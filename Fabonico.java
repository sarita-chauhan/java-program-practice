import java.util.Scanner;

public class Fabonico {
    public static void main(String[] args) {
        int term , firstTerm=0,secondTerm=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the terms");
        term=sc.nextInt();
        for(int i=1;i<=term;i++){
            System.out.println(firstTerm +" ");

            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }


     }
}
