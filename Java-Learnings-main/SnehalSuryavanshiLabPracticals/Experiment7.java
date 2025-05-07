class Student{
    int rollno;
    String name;
    Student(int r, String n){
         rollno = r;
         name = n;
    }
}

class Test extends Student{
    int sub1;
    int sub2;
    Test(int r , String n , int s1 , int s2){
super(r, n);
    sub1 = s1;
    sub2 = s2;
    }
void display(){
    System.out.println("Name : " + name);
    System.out.println("Roll No : " + rollno);
    System.out.println("Subject 1 : " + sub1);
    System.out.println("Subject 2 : " + sub2);
}
}

class Result extends Test{
Result(int rollNo , String studentName , int sub1 , int sub2){
    super(rollNo,studentName,sub1,sub2);
}
   void calculate_res(){
         System.out.println("Total : " + (sub1 + sub2));
         System.out.println("Average : " + ((sub1 + sub2)/2));
   }
}

public class Experiment7 {
    public static void main(String[] args) {
        Result t1 = new Result(101, "Parth", 100, 98);
        t1.display();
        t1.calculate_res();
    }
}
