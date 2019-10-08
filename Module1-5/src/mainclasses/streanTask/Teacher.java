package mainclasses.streanTask;

public class Teacher {

    private Subject subject;
    private String name;

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject=" + subject +
                ", name='" + name + '\'' +
                '}';
    }
}
