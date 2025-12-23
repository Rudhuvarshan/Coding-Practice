import java.util.*;
class A{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String n=in.nextLine();
        String v="";
        for(int i=n.length()-1;i>=0;i--){
            v+=n.charAt(i);

        }
        System.out.print(v);
    }
}