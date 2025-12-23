import java.util.*;
class A{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("pizza: ");
        int p =in.nextInt();
        System.out.print("puff: ");
        int pu=in.nextInt();
        System.out.print("cool: ");
        int co=in.nextInt();
        int pizza=p*100;
        int puff=pu*20;
        int cool=co*10;
        int total=pizza+puff+cool;
        System.out.println("Total:"+total);
    }
}