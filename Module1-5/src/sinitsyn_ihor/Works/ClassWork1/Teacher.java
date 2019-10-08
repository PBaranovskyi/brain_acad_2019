package sinitsyn_ihor.Works.ClassWork1;

public class Teacher {
    private SchoolChecker.subj subject;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSubject(SchoolChecker.subj subject) {
        this.subject = subject;
    }

    public SchoolChecker.subj getSubject() {
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
        return "Teacher{" + "subject=" + subject + ", name='" + name + " age=" + age + '\'' + '}';
    }
}
