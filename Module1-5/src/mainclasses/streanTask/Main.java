package mainclasses.streanTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {


    public static final int SCHOOLS_COUNT = 100;
    public static final int TEACHERS_COUNT = 5;
    static List<String> teacherNames = Arrays.asList("Koly", "Lena", "Nata", "Max", "Misha", "Roma", "Igor");

    public static void main(String[] args) {

        SchoolsGenerator sc = new SchoolsGenerator();

        List<School> schools = sc.generateScools(100, 2, teacherNames);

        long count = schools.stream()
                .filter(school -> schoolContainInformatics(school))
                .count();

        System.out.println("SChools with information count: " + count);

        long countTeachersWithInform = schools.stream()
                .flatMap(school -> school.getListTeacher().stream())
                .filter(teacher -> teacher.getSubject() == Subject.INFORMATICA)
                .count();

        System.out.println("Teachers of INOFMATICA " + countTeachersWithInform);

        List<School> sortedSchools = schools.stream()
                .sorted((o1, o2) -> getSubjectCount(o2) - getSubjectCount(o1))
                .collect(Collectors.toList());


        for (School sortedSchool : sortedSchools) {
            System.out.println(sortedSchool);
        }

        Optional<Teacher> result = schools.stream()
                .flatMap(school -> school.getListTeacher().stream())
                .max(Comparator.comparing(Teacher::getAge));

        if (result.isPresent()){
            System.out.println(result.get());
        }

        result.ifPresent(x -> System.out.println(x));


    }

    private static int getSubjectCount(School school) {
        return (int) school.getListTeacher().stream()
                .map(teacher -> teacher.getSubject())
                .distinct().count();
    }

    private static boolean schoolContainInformatics(School school) {
        return school.getListTeacher().stream()
                .filter(teacher -> teacher.getSubject() == Subject.INFORMATICA)
                .count() > 0;
    }


}
