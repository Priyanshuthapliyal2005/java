class PrinterThread extends Thread {
    private String message;
    public PrinterThread(String message) {
        this.message = message;
    }


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Ques23 {
    public static void main(String[] args) {
        PrinterThread thread1 = new PrinterThread("Hello");
        PrinterThread thread2 = new PrinterThread("World");
        thread1.start();
        thread2.start();


        System.out.println(" *************************************************************************");
        System.out.println("Implemented By: Priyanshu Thapliyal\t Class Roll No. 46\t CSE4(A2)");
        System.out.println(" *************************************************************************");
    }
}
