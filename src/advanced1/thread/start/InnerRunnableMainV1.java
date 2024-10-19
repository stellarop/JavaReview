package advanced1.thread.start;

import static advanced1.util.MyLogger.log;

public class InnerRunnableMainV1 {
    public static void main(String[] args) {
        log("main() start");

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();


        log("main() end");
    }

    // 중첩 클래스로 Runnable 구현
    static class MyRunnable implements Runnable{

        @Override
        public void run() {
            log("run()");
        }
    }
}