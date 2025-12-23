import java.util.*;
class A{
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        String a=in.nextLine();
        String res="dummy ";
        for(int i=0;i<a.length();i++){
            res+=a.charAt(i);
        }
        System.out.println(res+"!");
    }
}