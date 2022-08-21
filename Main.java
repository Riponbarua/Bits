import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  int n = 5; //0101
        // int pos =3;
        //  int bitMask=1<<pos;

        //  if ((bitMask & n)==0){
        //      System.out.println("bit was 0");

        //   }else {
        //      System.out.println("bit was 1");
        //  }
        // }
//}
        //***********************************************

        //int n = 5;
        //int pos =2;
        // int bitMask = 1<<pos;
        // int notBitMask = ~(bitMask);

        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);

        // }
//}
      //***************************************************
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper =1:set oper =0:cler
        int n =5;//0101->0111->dedc 7
        int pos =1;
        int bitMask= 1<<pos;
        if (oper==1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else {
            int newBitMask =~(bitMask);
            int newNamber = newBitMask & n;
            System.out.println(newNamber);
        }
    }
}
