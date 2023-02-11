import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        
        double p,r,t, A,CI;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal");
        p=sc.nextDouble();

        System.out.println("Enter the rate");
        r=sc.nextDouble();


        System.out.println("Enter the time");
        t=sc.nextDouble();

        CI=p * Math.pow((1+r/100),t)-p;
        System.out.println("Compound interest is" + CI );
        
        
    }
}
