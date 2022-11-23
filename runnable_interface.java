
class MyThreadRunnable implements Runnable{
    public void run(){
        while(true){
        System.out.println("hii how was the day ?");
        }
    }

}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        while(true){
        System.out.println("nice ");
        }
        
    }

}

public class runnable_interface {
    public static void main(String[] args) {
        MyThreadRunnable obj1 = new MyThreadRunnable();
        MyThreadRunnable2 obj2 = new MyThreadRunnable2();
    Thread T1=new Thread(obj1);
    Thread T2=new Thread(obj2);
    T1.start();
   T2.start();
    }
}
