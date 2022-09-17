class parent
{
    void fun(){
        System.out.println("parent");
    }
}
class child extends parent
{
    void fn(){
        System.out.println("child");
    }
}
class student
{
    public static void main(String args[]){
        child a =new child();
        a.fun();
        a.fn();
    }
}