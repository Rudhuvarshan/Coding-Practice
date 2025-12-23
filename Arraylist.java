import java.util.*;
class A{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        ArrayList <Integer> a =new ArrayList<>();
        a.add(10);
        a.add(11);
        a.add(12);
        int b=100+a.get(2);
        for(int v:a){
        System.out.println(v);}
    }
}