package advanced1.thread.control.interrupt;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class ThreadStopMainV1 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(4000);
        log("작업 중단 지시 runFlag : false");
        // 작업 중단을 지시해도 work 스레드가 즉각적으로 반응하지 않고 늦게 중단된다
        task.runFlag = false;
    }

    static class MyTask implements Runnable {

        volatile boolean runFlag = true;

        @Override
        public void run(){
            while (runFlag){
                log("작업 중");
                sleep(3000);
            }

            log("자원 정리");
            log("자원 종료");
        }
    }
}