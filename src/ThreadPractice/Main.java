package ThreadPractice;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread th=new ThreadClass(1);
        Thread th2=new ThreadClass(2);
        th.start();
        th.join();
        th2.start();

    }
}
