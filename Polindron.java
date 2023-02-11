import java.util.Scanner;

public class Polindron {
    public static void main(String[] args) {
        int n,sum=0,rem,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        n=sc.nextInt();
        c=n;
        while(n>0) {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(c==sum){
            System.out.print("Polindron number");
        }
        else{
            System.out.print("not polindron number");
        }
    }
}
