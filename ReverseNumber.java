import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n,  rem;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        n=sc.nextInt();

        while(n>0){
            rem=n%10;
            System.out.print(rem);
            n=n/10;
    
        }
        
        
    }
}
