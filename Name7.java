public class Name7 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1; i<=6; i++){
            if(6%i==0){
                count++;
            }
        }
        if (count ==2){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
