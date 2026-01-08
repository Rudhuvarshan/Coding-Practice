import java.util.*;
class A{
    public static void main(String[]args){
        Scanner v=new Scanner(System.in);
        while(true){
        int a=v.nextInt();
        System.out.println("*".repeat(a));
        for(int i=0;i<a-2;i++){
        System.out.print("*");
        System.out.print(" ".repeat(a-2));
        System.out.println("*");

        }
        System.out.println("*".repeat(a));
        
    }}
}