package mainclasses.streanTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {


    public static final int SCHOOLS_COUNT = 100;
    public static final int TEACHERS_COUNT = 5;
    static List<String> teacherNames = Arrays.asList("Koly",  "Lena", "Nata");

    public static void main(String[] args) {
        List<School> schoolList = generateScools(SCHOOLS_COUNT, teacherNames);
        for (School school : schoolList) {
            System.out.println(school);
        }
    }

    public static List<School> generateScools(int count, List<String> teacherNames) {
        if (teacherNames !=null && !teacherNames.isEmpty()) {
            Main.teacherNames = teacherNames;
        }

        List<School> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {

            List<Teacher> listTeacher = generateTeachers(TEACHERS_COUNT);
            list.add(new School(listTeacher));

        }
        return list;
    }

    private static List<Teacher> generateTeachers(int count) {
        List<Teacher> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Teacher teacher = new Teacher();
            teacher.setSubject(generateSubject());
            teacher.setName(generateName());
            teacher.setAge(new Random().nextInt(70));
            list.add(teacher);
        }

        return list;
    }

    private static String generateName() {
        Random random = new Random();
        int randomIndex = random.nextInt(teacherNames.size());
        return teacherNames.get(randomIndex);
    }

    private static Subject generateSubject() {
        Subject[] subjects = Subject.values();
        Random random = new Random();
        int randomIndex = random.nextInt(subjects.length);
        return subjects[randomIndex];
    }
}
