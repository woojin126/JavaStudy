package STUDY.threadAndProcess;

import javax.swing.*;

public class InterruptedThread {
    public static void main(String[] args) {
        ThreadInterrupted th1 = new ThreadInterrupted();
        th1.start();
        System.out.println("IsInterrupted():" + th1.isInterrupted()); //초기상태는 false;
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
        System.out.println("입력하신 값은 " + input + "입니다.");
        th1.interrupt(); //상태가 true가 된다.
        System.out.println("IsInterrupted():" + th1.isInterrupted()); // true
        //메인쓰레드가 interruped 되었는지 확인 당연히 false겠찌/
        System.out.println("interrupted():"+ Thread.interrupted()); //false;
    }
}

class ThreadInterrupted extends Thread {
    @Override
    public void run() {
        int i = 10;

        while (i!=0 && !isInterrupted()) {
            System.out.println(i--);
            for (long x=0;x<2500000000L;x++);

        }

        System.out.println("카운트가 종료되었습니다.");
    }
}
