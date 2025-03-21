class Red extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Red Light - " + i);
        }
    }
}

class Yellow extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Yellow Light - " + i);
        }
    }
}

class Green extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Green Light - " + i);
        }
    }
}

public class threadDemo {
    public static void main(String[] args) {
        Red red = new Red();
        Yellow yellow = new Yellow();
        Green green = new Green();

        red.setPriority(10);
        yellow.setPriority(5);
        green.setPriority(1);

        System.out.println("Red light priority: " + red.getPriority());
        System.out.println("Yellow light priority: " + yellow.getPriority());
        System.out.println("Green light priority: " + green.getPriority());

        red.start();
        yellow.start();
        green.start();
    }
}
