public class Demo8{
    public static void main(String[] args) {
        System.out.println("******** Code by Parth ********");

        // Checking if enough arguments are provided
        if (args.length < 2) {
            System.out.println("Usage: java NameAgeChecker <Name> <Age>");
            return;
        }

        // Getting name and age from command line arguments
        String name = args[0]; 
        int age = Integer.parseInt(args[1]); // Convert age from String to int

        // Displaying the name and age
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // Checking if the user is 18 or older
        if (age >= 18) {
            System.out.println("Status: You are an adult (18+).");
        } else {
            System.out.println("Status: You are a minor.");
        }
    }
}
