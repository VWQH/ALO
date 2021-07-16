package series_oop.threads.exp1;

public class My_Thread extends Thread{

    @Override
    public void run() {
        if(this.isDaemon()){
            System.out.println("This is a daemon that is running.");
        }else{
            System.out.println("This thread is running.");
        }
    }
}
