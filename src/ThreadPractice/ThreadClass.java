package ThreadPractice;

public class ThreadClass extends Thread{
    private int thNum;
    public ThreadClass(int thNum){
        this.thNum=thNum;
    }
    @Override
    public void run() {
        for (int i=0;i<3;i++){
            System.out.println(i+" from "+thNum);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            } ;
        }
        }
    }


