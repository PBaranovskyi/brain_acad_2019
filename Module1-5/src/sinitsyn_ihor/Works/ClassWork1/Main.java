package sinitsyn_ihor.Works.ClassWork1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private int schoolCount = 0;
    private int teacherCount = 0;
    private List<String> teacherNames = new ArrayList<>();

    public static void main(String[] args) {
        SchoolChecker sc = new SchoolChecker();
        List<School> schoolList = sc.generateSchools(10);
        long count = schoolList.stream()
                .filter(school -> schoolContainInformatics(school))
                .count();
        System.out.println("With informatics " + count);

        long countTeachersWithInformatics = schoolList.stream()
                .flatMap(school -> school.getTeacherList().stream())
                .filter(teacher -> teacher.getSubject() == SchoolChecker.subj.INFORMATICS)
                .count();
        System.out.println("Teachers with informatics " + countTeachersWithInformatics);

        List<School> sortedSchools = schoolList.stream()
                .sorted((o1, o2) -> getSubjectCount(o2) - getSubjectCount(o1))
                .collect(Collectors.toList());
        for (School sortedSchool : sortedSchools) {
            System.out.println(sortedSchool);
        }

        Optional<Teacher> maxAge = schoolList.stream().flatMap(school -> school.getTeacherList().stream()).max(Comparator.comparing(Teacher::getAge));

//        if (maxAge.isPresent()){
//            System.out.println("Max age = " + maxAge.get());
//        }
        maxAge.ifPresent(x -> System.out.println(x));
    }

    private static int getSubjectCount(School school) {
        return (int) school.getTeacherList().stream()
                .map(teacher -> teacher.getSubject()).distinct()
                .count();
    }

    private static boolean schoolContainInformatics(School school) {
        return school.getTeacherList().stream()
                .filter(teacher -> teacher.getSubject() == SchoolChecker.subj.INFORMATICS)
                .count() > 0;
    }
}
