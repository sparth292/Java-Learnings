// Command line args

public class Experiment3 {
    public static void main(String[] args) {
        String Name = args[0];
        int Id = Integer.parseInt(args[1]);
        System.out.println("User ID : " + Id);
        System.out.println("User Name : " + Name);
    }
}
