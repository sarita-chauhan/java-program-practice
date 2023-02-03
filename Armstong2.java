

import java.util.Scanner;

public class Armstong2 {
    public static void main(String[] args) {
        int n, rem, sum=0,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no");
         n=sc.nextInt();
        c=n;
        while(n>0){
            rem=n%10;
            sum=(rem*rem*rem)+sum;
            n=n/10;
        }
        if(c==sum){
            System.out.println("Armstong");
        }
        else{
            System.out.println("not Armstong");
        }
    }
}
