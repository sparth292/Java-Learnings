class MyNewException extends Exception{
  MyNewException(){
super();
}
}

class predefinedException{
public static void main(String args[]){

try{

int arr[] = {1,2};

int n = arr[5];

}
catch(ArrayIndexOutOfBoundsException e){

System.out.println("Array is out of bound !");

}

try{

Class.forName("");

}
catch(ClassNotFoundException e){

System.out.println("Class not found !");

}

try{
String s2 = "canada";

if(!(s2.equals("india"))){

throw new MyNewException();

}

}
catch(MyNewException e){

System.out.println("Bhai tujhe exception lag gya !	");

}



}


}