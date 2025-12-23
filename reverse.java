import java.util.*;
class A{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int val=in.nextInt();
        int sum=0;

        while(val>0){
            int r=val%10;
            sum=sum*10+r;
            val=val/10;
        }
        System.out.println(sum);
    }
}