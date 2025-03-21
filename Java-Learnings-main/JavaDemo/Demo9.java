public class Demo9{
    public static void main(String[] args) {
        System.out.println("******** Code by Parth ********");

        // Checking if enough arguments are provided
        if (args.length < 2) {
            System.out.println("Usage: java TriangleArea <Base> <Height>");
            return;
        }

        // Getting base and height from command line arguments
        double base = Double.parseDouble(args[0]); // Convert base to double
        double height = Double.parseDouble(args[1]); // Convert height to double

        // Calculating the area of the triangle
        double area = 0.5 * base * height;
        System.out.println("Triangle Area: " + area);
    }
}
