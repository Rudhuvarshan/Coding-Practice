import java.util.*;
class A{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int base=1;
        int sum=0;
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)=='1'){
                sum+=base;

            }
            base*=2;
        }
        System.out.print(sum);
    }
}