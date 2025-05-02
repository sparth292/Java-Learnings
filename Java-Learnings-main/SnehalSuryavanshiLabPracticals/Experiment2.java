
interface Norms {
    final static int TA = 3000;
    final static double DA = 0.9;
    final static double HRA =  0.5;
    public void cal_gs(); 
      
}


class Emp{
    int id;
    String name;
    double bs;
    void getData(int Id , String Name , Double Bs){
           id = Id;
           name = Name;
           bs = Bs;

    }
    void putData(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Basic Salary : " + bs);
        
    }
    
}

class EmpSalaryDetails extends Emp implements Norms{
      public void cal_gs() {
          double gs = TA + HRA + DA + bs; 
          System.out.println("Gross Salary : " + gs);
      }
}

public class Experiment2 {
    public static void main(String[] args) {
        EmpSalaryDetails emp1 = new EmpSalaryDetails();
        emp1.getData(101,"Vishal",1000.0);
        emp1.putData();
        emp1.cal_gs();

    }
}
