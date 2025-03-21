class Student {
    int rollNo, proj_id;
    String name, dept;
    Student(int rno, String n) {
        rollNo = rno;
        name = n;
    }
    void setData(int pid, String dept_name) {
        proj_id = pid;
        dept = dept_name;
    }
    void display() {
        System.out.println("Name: " + name + "\nRoll No: " + rollNo + "\nDepartment: " + dept + "\nProject ID: " + proj_id);
    }
}
public class ClassObjects {
    public static void main(String[] args) {
        Student s = new Student(49, "Parth");
        s.setData(123, "AIML");
        s.display();
    }
}
