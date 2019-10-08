package mainclasses.streanTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SchoolsGenerator {

    private List<String> teacherNames = new ArrayList<>();


    public List<School> generateScools(int schoolCout, int teachersCount, List<String> teacherNames) {
        if (teacherNames !=null && !teacherNames.isEmpty()) {
            this.teacherNames = teacherNames;
        }

        List<School> list = new ArrayList<>();
        for (int i = 0; i < schoolCout; i++) {

            List<Teacher> listTeacher = generateTeachers(teachersCount);
            list.add(new School(listTeacher));

        }
        return list;
    }

    private  List<Teacher> generateTeachers(int count) {
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

    private  String generateName() {
        Random random = new Random();
        int randomIndex = random.nextInt(teacherNames.size());
        return teacherNames.get(randomIndex);
    }

    private  Subject generateSubject() {
        Subject[] subjects = Subject.values();
        Random random = new Random();
        int randomIndex = random.nextInt(subjects.length);
        return subjects[randomIndex];
    }


}
