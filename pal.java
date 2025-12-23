import java.util.*;
class A{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String v1=new StringBuilder(a).reverse().toString();
        System.out.println(v1);
    }
}