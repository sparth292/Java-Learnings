class exceptionHandle{
    public static void main(String args[]){
        String arr[]={"Prayag","Paras","Parth","Piyush"};
        try{
            System.out.println("Array[]: "+arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Out of your bounds!");
        }
    }
}