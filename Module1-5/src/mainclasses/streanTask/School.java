package mainclasses.streanTask;

import java.util.List;

public class School {
    private List<Teacher> listTeacher;

    public School(List<Teacher> listTeacher) {
        this.listTeacher = listTeacher;
    }

    public List<Teacher> getListTeacher() {
        return listTeacher;
    }

    public void setListTeacher(List<Teacher> listTeacher) {
        this.listTeacher = listTeacher;
    }

    @Override
    public String toString() {
        return "School{" +
                "listTeacher=" + listTeacher +
                '}';
    }
}
