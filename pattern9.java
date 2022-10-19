import java.util.Scanner;

class pattern9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int i=0;i<n-1;i++){
            for(int k =0;k<2*n-1;k++){
                if(k>=i && k<=n-2-i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
        }
        System.out.println();
    }
            for(int i=0;i<n;i++){
            for(int j =0;j<n-1;j++){
                if(j>=n-1-i && j<=n-1+i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println("");
        }
    }
}
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 