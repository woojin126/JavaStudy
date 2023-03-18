package STUDY.threadAndProcess;


class ThreadEx1 extends Thread { // 상속을 이용하여 스레드 구현
    @Override
    public void run() { //스레드가 수행할 작업
        for (int i = 0 ; i < 500 ; i ++) {
            System.out.print(1); //조상 Thread의 getName() 호출
        }
    }
}

class ThreadEx2 implements Runnable { //인터페이스를 사용하여 runnable 구현

    @Override
    public void run() {
        for (int i = 0 ; i < 500 ; i++) {
            //Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
            System.out.print(0);
        }
    }
}
public class MyThread {
    public static void main(String[] args) {
        ThreadEx1 t1 = new ThreadEx1();

        Runnable r = new ThreadEx2();
        Thread t2 = new Thread(r);
 /*
 멀티 스레드사용으로 0과 1이 교차하여 사용중. 두개가 동시에 실행
  */
        t1.start();
        t2.start();
    }
}
