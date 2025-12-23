import java.util.*;
class A{
    public static void main(String [] args){
        int a []={1,2,3,4,5};
        int t=2;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=t;i<a.length;i++){
            al.add(a[i]);


        }
        for(int i=0;i<t;i++){
            al.add(a[i]);
        }
        // for(int i=0;i<a.length;i++){
        //     a[i]=al.get(i);
        // }
        System.out.print(al);
    }
}