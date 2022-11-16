import java.util.Scanner;
class opposite_tringle_pattern {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0;i<n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print("  ");
            }
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            for(int p=i;p<n-1;p++){
                System.out.print("* ");

            }
        System.out.println();
        }
	}


}

// * * * * * * * * * 
//   * * * * * * *
//     * * * * *
//       * * *
//         *