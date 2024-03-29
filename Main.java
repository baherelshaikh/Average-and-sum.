import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number... ");
        a= input.nextInt();
        System.out.println("Please enter the second number... ");
        b= input.nextInt();
        System.out.println("Please enter the third number... ");
        c= input.nextInt();

        System.out.println("the avarage of the numbers = "+(a+b+c)/3);
        System.out.println("The sum of the numbers = "+(a+b+c));

        input.close();
    }
}