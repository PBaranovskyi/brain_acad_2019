package tereshchenko_roman.streamsHomeWork2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Teacher> teacherList1 = Arrays.asList(new Teacher("Anna", Subject.INFORMATIC), new Teacher("Vladimir", Subject.MATHEMATIC), new Teacher("Tatyana", Subject.LITERATURE));
        List<Teacher> teacherList2 = Arrays.asList(new Teacher("Sergey", Subject.PHYSICS), new Teacher("Svetlana", Subject.LITERATURE), new Teacher("Oleg", Subject.INFORMATIC));
        List<Teacher> teacherList3 = Arrays.asList(new Teacher("Vasiliy", Subject.INFORMATIC), new Teacher("Galina", Subject.LITERATURE), new Teacher("Petr", Subject.MATHEMATIC));
        ;

        List<School> schools = Arrays.asList(new School(teacherList1), new School(teacherList2), new School(teacherList3));

        Map<Subject, Long> teachersMap = schools.stream()
                .flatMap(school -> school.getTeacherList().stream())
                .collect(Collectors.groupingBy(Teacher::getSubject, Collectors.counting()));

        System.out.println(teachersMap);

        long count = schools.stream().filter(Main::schoolContainInformatics)
                .count();

        System.out.println("Schools with informatics: " + count);

        //Посчитать учителей, которые преподают информатику

        long countTeachersOfInformatic = schools.stream()
                .flatMap(school -> school.getTeacherList().stream())
                .count();

        System.out.println(("Teachers of informatics: " + countTeachersOfInformatic));

        //Отсортировать школы по количеству предметов

        List<School> sortedSchools = schools.stream()
                .sorted((o1, o2) -> getSubjectCount(o2) - getSubjectCount (o1))
                .collect(Collectors.toList());

        for (School sortedSchool : sortedSchools) {
            System.out.println(sortedSchool);
        }

        //Найти самого старого преподавателя

        Optional<Teacher> result = schools.stream()
                .flatMap(school -> school.getTeacherList().stream())
                .max(Comparator.comparing(Teacher::getAge));

        if (result.isPresent()){
            System.out.println(result.get());
        }

        //То же самое, но короче(Идея преобразует):
        result.ifPresent(x -> System.out.println(x));

    }

    private static int getSubjectCount(School school) {
        return (int) school.getTeacherList().stream()
                .map(teacher -> teacher.getSubject()).distinct().count();
    }


    private static boolean schoolContainInformatics(School school) {
        return school.getTeacherList().stream()
                .filter(teacher -> teacher.getSubject() == Subject.INFORMATIC)
                .count() > 0;
    }




}
