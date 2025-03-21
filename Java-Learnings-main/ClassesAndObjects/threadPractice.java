class greenSignal implements Runnable{
public void run(){
     for(int i = 1 ; i <= 10 ; i++){
        System.out.println("Green");
     }
}
}

class redSignal implements Runnable{
public void run(){
     for(int i = 10 ; i > 0 ; i--){
        System.out.println("Red");
     }
}
}

class yellowSignal implements Runnable{
public void run(){
     for(int i = 10 ; i > 0 ; i--){
        System.out.println("Yellow");
     }
}
}

class threadPractice{

public static void main(String args[]){
       redSignal r1 = new redSignal();
       yellowSignal y1 = new yellowSignal();
       greenSignal g1 = new greenSignal();
       Thread t1 = new Thread(r1);
       Thread t2 = new Thread(y1);
       Thread t3 = new Thread(g1);
       t2.setPriority(10);
       t1.setPriority(1);
       t3.setPriority(4);
       System.out.println("red priority : " + t1.getPriority());
       System.out.println("yellow priority : " + t2.getPriority());
       System.out.println("green priority : " + t3.getPriority());
       t2.start();
       t3.start();
       t1.start();                     
}

}