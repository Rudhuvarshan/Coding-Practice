import java.util.*;
class A{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(true){
        int input=in.nextInt();
        int temp=0;
        for(int i=1;i<=input;i++){
            if(input%i==0){
                temp+=1;
            }

        }
        if (temp==2){
            System.out.println(input+":is prime number.");
        }
        else{
            System.out.println(input+":is not a prime number.");
        }}
    }
}