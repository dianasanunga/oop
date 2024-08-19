package Student;

public class Student {
    private String name;
    private String lastname;
    private Integer age;
    private String studentCode;

    public Student() {
    }

    public Student(String name, String lastname, Integer age, String studentCode) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", studentCode='" + studentCode + '\'' +
                '}';
    }
}
