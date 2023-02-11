import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        float p,r,t,SI;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal");
         p=sc.nextFloat();

         System.out.println("Enter the time");
         t=sc.nextFloat();
         
         System.out.println("Enter the rate");
         r=sc.nextFloat();

        SI=(p*t*r)/100;
        System.out.println("Simple interest is" +SI);

        
    }
}
