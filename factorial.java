import java.util.*;
class A{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int res=1;
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            res*=i;
        }
        System.out.print("Factorial of:"+n+"is:"+res);
    }
}