public class Ques22 {
    public static void main(String[] args) {
        SharedPrinter sp = new SharedPrinter();
        Thread odd = new Thread(new Odd(sp),"Odd");
        Thread even = new Thread(new Even(sp),"Even");
        System.out.println(" *************************************************************************");
        System.out.println("Implemented By: Priyanshu Thapliyal\t Class Roll No. 46\t CSE4(A2)");
        System.out.println(" *************************************************************************");
        odd.start();
        even.start();
    }
}
class SharedPrinter {
    private int flag = 1;
    synchronized void printEvenNum(int num) {
        while (flag != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + " " + num);
        flag = 1;
        notify();
    }
    synchronized void printOddNum(int num) {
        while (flag == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + " " + num);
        flag = 0;
        notify();
    }
}

class Odd implements Runnable {
    private SharedPrinter sp;

    public Odd(SharedPrinter sp) {
        this.sp = sp;
    }

    @Override
    public void run() {
        int number = 1;
        while (number <= 20) {
            if (number % 2 != 0) {
                sp.printOddNum(number);
            }
            number++;
        }
        System.out.println("Odd thread finished");
        System.out.println("Implemented By: Priyanshu Thapliyal\t Class Roll No. 46\t CSE4(A2)");
    }
}
class Even implements Runnable {
    private SharedPrinter sp;

    public Even(SharedPrinter sp) {
        this.sp = sp;
    }
    @Override
    public void run() {
        int number = 2;
        while (number <= 20) {
            if (number % 2 == 0) {
                sp.printEvenNum(number);
            }
            number++;
        }
        System.out.println("Even thread finished");
    }
}
