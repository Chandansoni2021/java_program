
class my_thread extends Thread{
    public void run(){
        while(true){
        System.out.println("i am happy");
        System.out.println("hey hey ");
    }
}
}
class my_thread2 extends  Thread{
    public void run(){
        while(true){
        System.out.println("i am sad");
        System.out.println("chala ja yrr kyu pareshaan ar raha hai  ");
    }
}
}
class thread1{
    public static void main(String[] args) {
        my_thread t1 =new my_thread();
        my_thread2 t2= new my_thread2();
    t1.start();
    t2.start();
    }
}