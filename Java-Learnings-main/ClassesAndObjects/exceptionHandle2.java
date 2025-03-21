class exceptionHandle2 {
    public static void main(String args[]) {
        int num = 10;
        int a[] = {1, 2};
        try {
            a[5] = 9; // This will cause ArrayIndexOutOfBoundsException
            System.out.println("Array[5]: " + a[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is out of your bounds!");
        }
        try {
            int divide = num / 0; // This will cause ArithmeticException
            System.out.println("Division by 0: " + divide);
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred!");
        } 
        finally {
            System.out.println("Multiple Catch Blocks executed successfully!");
        }
    }
}
