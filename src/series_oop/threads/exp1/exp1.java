package series_oop.threads.exp1;

public class exp1 {
    public static void main(String[] args) throws InterruptedException {

        // System.out.println(Thread.activeCount());

        // Thread.currentThread().setName("MAIN");

        // System.out.println(Thread.currentThread().getName());

        // Thread.currentThread().setPriority(10);
        // System.out.println(Thread.currentThread().getPriority()); // độ ưu tiên, số càng cao thì ưu tiên hơn.

        // System.out.println(Thread.currentThread().isAlive());

//        for(int i = 3; i > 0; i--){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("OK");

        My_Thread thread = new My_Thread();

        // System.out.println(thread.isAlive());
        thread.setDaemon(false);
        thread.start();
        System.out.println(thread.isDaemon());

    }
}
