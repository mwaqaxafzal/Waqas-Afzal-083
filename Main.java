package labtask;

import java.util.Scanner;

public class LABTASK {

    public static int findBinary(int n_Number) {

        if (n_Number == 0) {
            return 0;
        } else {
            
            int e;
            e=n_Number % 2 + 10*findBinary(n_Number / 2);
                        
            
            return e;
            
           
        }
    }

    ;
    

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n_Number;
        System.out.println(" Enter The Number Which You Want To Convert Into Binary =");

        n_Number = s.nextInt();
        System.out.println(findBinary(n_Number));

    }

}