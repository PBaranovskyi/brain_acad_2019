package sinitsyn_ihor.Works.ClassWork1;

import java.util.List;

public class School {
    private List<Teacher> teacherList;

    public School(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setListTeacher(List<Teacher> listTeacher) {
        this.teacherList = teacherList;
    }

    @Override
    public String toString() {
        return "School{" + "listTeacher=" + teacherList + '}';
    }
}
