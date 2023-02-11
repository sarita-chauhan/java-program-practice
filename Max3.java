import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number");

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();


        if(a>b){
            if(a>c){
                System.out.print(a);
            }else{
                System.out.print(c);
            }
        }
        else{
            if(b>c){
                System.out.print(b);
            }
            else{
                System.out.print(c);
            }
        }
    }
}
