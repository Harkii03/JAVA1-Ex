import java.util.Scanner;

class Fahrenheit {

    public static void main(String[] args){
        // get to number 
        Scanner sc = new Scanner(System.in);
        int F = sc.nextInt(); 

        double Celuius = (5.0/9)*(F-32);

        System.out.println(String.format("%.4f", Celuius));
    }
}