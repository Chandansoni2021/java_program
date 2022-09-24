// import javax.imageio.stream.MemoryCacheImageInputStream;

// public class java_devi_ji {
//     private void myname() {
//         System.out.println("hii chandan");


        
//     }
//      public static void main(String[] args) {
//         java_devi_ji obj1 = new java_devi_ji();
//         obj1.myname();
        
//     }
// }
// package hii;
// class c1{

//    private void mynamo(String name,int age){
//         System.out.println(name+" "+age);

//     }
// public class java_devi_ji{
//     public static void main(String args[]){
//         c1 obj1 = new c1();
//       obj1.mynamo("chandan", 12);
//     }
// }
// }

//overriding 
// class a{
//     public void math1(){
//         System.out.println("hii chandan i am method a");

//     }
// }
// class b extends a{
//     public void math1(){
//         System.out.println("hii i am method 1 of b");
//     }
// }


// public class java_devi_ji{
//     public static void main(String[] args) {
        
    
//     a obj1 = new a();
//     obj1.math1();
//     b obj2 =new b();
//     obj2.math1();
// }
// }

//overloading

class a{
    static void foo(){
        System.out.println("good morning foo");
    }
    static void foo(int a){
        System.out.println(a);

    
    }
}
class java_devi_ji extends a{
    public static void main(String[] args) {
        foo();
        foo(500);
    }
}



