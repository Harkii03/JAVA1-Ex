import java.util.Scanner;

public class PrimeFactorizer {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int F = sc.nextInt();

        System.out.print(F + ":");
        for(int i = 2; i < F; i++) {
            if (F % i == 0){
                F /= i;

                if( F == 1 ) System.out.print(i);
                else System.out.print(" " + i);

                i = 1;
            }
        }
        System.out.println(" " + F);

    }
}
