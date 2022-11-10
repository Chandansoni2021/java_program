import java.io.*;
import java.util.*;
public class arraylist1 {
public static void main(String[] args) {
    int n=5;
    ArrayList<Integer> arrli=new ArrayList<Integer>(n);
for(int i=0;i<n;i++){
    arrli.add(i);
}
    System.out.println(arrli);
    arrli.remove(3);
System.out.println(arrli);
for(int i=0;i<arrli.size();i++){
    System.out.print(arrli.get(i)+" ");
}
    arrli.add(2,89);
    // to add directly as any any index position

}    
}
// [0, 1, 2, 3, 4]
// [0, 1, 2, 4]