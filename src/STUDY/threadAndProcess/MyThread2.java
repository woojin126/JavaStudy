package STUDY.threadAndProcess;


class ThreadEx3 extends Thread {
    @Override
    public void run() {
        for (int i = 0 ; i < 1000; i++)
            System.out.printf("%s", new String("|"));

        System.out.print("소요시간2:" + (System.currentTimeMillis() - MyThread2.startTime));
    }
}
public class MyThread2 {
    static long startTime = 0;
    public static void main(String[] args) {

        ThreadEx3 th3 = new ThreadEx3();
        th3.start();
        startTime = System.currentTimeMillis();

        for (int i = 0 ; i < 1000; i++)
            System.out.printf("%s", new String("-"));

        System.out.print("소요시간1: " + (System.currentTimeMillis() - MyThread2.startTime));
    }
}
