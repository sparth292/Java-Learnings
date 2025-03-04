class AscendingOrder implements Runnable{
public void run(){
     for(int i = 1 ; i <= 10 ; i++){
        System.out.println(i);
     }
}
}

class DescendingOrder implements Runnable{
public void run(){
     for(int i = 10 ; i > 0 ; i--){
        System.out.println(i);
     }
}
}

class threadDemo{

public static void main(String args[]){
       AscendingOrder asc1 = new AscendingOrder();
       DescendingOrder desc1 = new DescendingOrder();
       Thread t1 = new Thread(asc1);
       Thread t2 = new Thread(desc1);
       t2.setPriority(10);
       t1.setPriority(1);
       System.out.println("asc1 priority : " + t1.getPriority());
       System.out.println("desc1 priority : " + t2.getPriority());
       t2.start();
       t1.start();                     
}

}