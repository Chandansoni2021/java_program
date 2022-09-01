import java.util.Scanner;

import javax.crypto.AEADBadTagException;

class hello
{
     public static void main(String[] args) {
        // System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
        if(a%2==0){
            System.out.println("it is even");
        }
        else if(a%2!=0){
            System.out.println("it is  odd");
        }
    }
        else{
        System.out.println("it is zero");
        }
    }
}