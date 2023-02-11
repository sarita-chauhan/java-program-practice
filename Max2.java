import java.util.Scanner;

public class Max2 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }

    }
}
