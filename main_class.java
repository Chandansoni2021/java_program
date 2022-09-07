class rectangle {
    int  length, width;
    void getdata(int x, int y)
    {
        length=x;
        width=y;
    }
     int rectarea(){         // main class reuse nhi hoti hai 
    int area=length*width;
    return area;
     }
    }
    //CLASS RECTANGLE CLOSE //DATA BINDING OR ENCAPSULATION
     class main_class{ 
         public static void main(String args[]){
                    rectangle R =new rectangle();      //DATA HIDING OR DATA ABSTRACTION
                    R.length =23;
                    R.width = 20;
                    int cal= R.length*R.width;
                    System.out.println(cal);

                    rectangle S=new rectangle();
                    S.getdata(1,2);
                    System.out.println(S.rectarea());
         }
        }
// MAIN METHOD CLOSE