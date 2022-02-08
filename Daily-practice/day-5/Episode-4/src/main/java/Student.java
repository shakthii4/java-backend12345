public class Student
{
    private String name;
    private String interstedCourse;
    private String hobby;

    public void setName(String name) {
        this.name = name;
    }

    public void setInterstedCourse(String interstedCourse) {
        this.interstedCourse = interstedCourse;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void displayStudentInfo()
    {
        System.out.println("Student name"+name);
        System.out.println("Student Intersted Course"+interstedCourse);
        System.out.println("Student hobby"+hobby);
    }
}
