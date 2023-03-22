package STUDY.threadAndProcess;

public class SleepThread {
    public static void main(String[] args) {
        ThreadA th1 = new ThreadA();
        ThreadB th2 = new ThreadB();

        th1.start();
        th2.start();

        try { // 해당코드로 threadA, threadB가 먼저 출력후 메인스레드는 2초후에 찎히게된다
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("<<main 종료>>");
    }
}

class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i=0;i<300;i++) 
            System.out.print("-");
        System.out.print("<<threadA 종료");
    }
}

class ThreadB extends Thread {
    @Override
    public void run() {
        for (int i=0;i<300;i++)
            System.out.print("|");
        System.out.print("<<threadB 종료");
    }
}