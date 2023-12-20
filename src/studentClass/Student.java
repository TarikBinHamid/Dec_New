package studentClass;

public class Student {
    private int studentID;
    private String studentName;
    private int studentGrade;
    private int age;
    private String course;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=5){
            this.age=age;
        }else {
            System.out.println("You can not be admitted");
        }

    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
