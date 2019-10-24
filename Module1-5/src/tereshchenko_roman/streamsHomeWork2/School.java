package tereshchenko_roman.streamsHomeWork2;

import java.util.List;

public class School {

    private List<Teacher> teacherList;

    public School(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    @Override
    public String toString() {
        return "School{" +
                "teacherList=" + teacherList +
                '}';
    }
}
