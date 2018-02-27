import java.util.concurrent.*;
public class ThreadedCounting {

    public static void countInThreads(Counter counter) {
        try{
            BlockingQueue<Boolean>[] syncQueues = (BlockingQueue<Boolean>[]) new BlockingQueue[3];
            for (int i = 0; i < syncQueues.length; i++) {
                syncQueues[i] = new ArrayBlockingQueue<>(1);
            }
            Thread[] threads = {
                    new Thread(()->countInThread(1,counter, syncQueues[0], syncQueues[1])),
                    new Thread(()->countInThread(2,counter, syncQueues[1], syncQueues[2])),
                    new Thread(()->countInThread(3,counter, syncQueues[2], syncQueues[0]))
            };

            for (Thread t:threads){
                t.start();
            }
            syncQueues[0].put(true);

            for (Thread t:threads){
                t.join();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private static void countInThread(int start, Counter counter, BlockingQueue<Boolean> in, BlockingQueue<Boolean> out){
        try {
            for (int i = start; i<=100;i+=3){
                in.take();
                counter.count(i);
                out.offer(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Counter {

        void count(int cnt) {
            System.out.println(cnt);
        }
    }

    public static void main(String[] args) {
        countInThreads(new Counter());
    }
}