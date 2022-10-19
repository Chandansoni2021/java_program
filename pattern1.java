// package pack1;
public class pattern1
{
    public static void main(String[] args) {
        int row =5;
        int col = 2*5-1;
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                if(j>=(row-1)-i && j<=(row-1)+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    

}


// # range (n-1)-i to (n-1)+i


// #      *
// #     ***
// #    *****
// #   *******
// #  *********