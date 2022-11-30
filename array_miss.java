public class array_miss {
    public static void main(String[] args) {
        int n=10;
        int ar[] = {6,1,2,8,9,5,4,7,10};
        int a=0;
        for(int i=1;i<=n;i++){
            a = a+(i);
        }
        for(int j=0;j<ar.length;j++){
            a=a-ar[j];
        }
        System.out.println(a);

    }
}
