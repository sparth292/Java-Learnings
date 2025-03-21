class A{
int a;
int copy(int a){
     this.a = a;
     return this.a;
}
}

class thisObject{
      public static void main(String args[]){
             A a1 = new A();
             System.out.println(a1.copy(34));                             
      }
}