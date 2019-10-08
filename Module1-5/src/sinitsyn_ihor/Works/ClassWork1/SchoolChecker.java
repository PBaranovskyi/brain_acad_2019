package sinitsyn_ihor.Works.ClassWork1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SchoolChecker {
    public static List<String> surname = Arrays.asList("Ivanov", "Petrov", "Sidorov", "Korayka", "Kovalenko", "Petrenko", "Tishenko", "Ivanko", "Boyko", "Mishenko");
    public enum subj {HISTORY, INFORMATICS, MATH, CHEMISTRY, PHYSICS, BIOLOGY, LANGUAGE, LITERATURE};

    public static List<School> generateSchools(int count) {
        List<School> list = new ArrayList<>();
        for (int i = 0; i < count; i++){
            List<Teacher> listTeacher = generateTeachers(new Random().nextInt(5)+2);
            list.add(new School(listTeacher));
        }
        return list;
    }

    private static List<Teacher> generateTeachers(int count) {
        List<Teacher> list = new ArrayList<>();
        for (int i = 0; i < count; i++){
            Teacher teacher = new Teacher();
            teacher.setSubject(generateSubject());
            teacher.setName(generateName());
            teacher.setAge(new Random().nextInt(50)+20);
            list.add(teacher);
        }
        return list;
    }

    private static String generateName() {
        Random rand = new Random();
        int i = rand.nextInt(surname.size());
        return surname.get(i);
    }

    private static subj generateSubject() {
        Random rand = new Random();
        int i = rand.nextInt(subj.values().length);
        return subj.values()[i];
    }
}