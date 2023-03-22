package STUDY.threadAndProcess;

import java.sql.SQLOutput;

public class DaemonThread implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {  // main 안에있는 코드는 모두 메인쓰레드!
        Thread t = new Thread(new DaemonThread());
        t.setDaemon(true);
        t.start();

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(i);

            if (i == 5) autoSave = true;
        }

        System.out.println("프로그램 종료합니다.");
    }

    @Override
    public void run() { // 데몬쓰레드!
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            if (autoSave) autoSave();
        }
    }

    private void autoSave() {
        System.out.println("작업파일이 자동저장되었습니다.");
    }
}

