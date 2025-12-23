import java.util.*;
class A{
    public static void main(String[] srgs){
        int a[]={1,3,4,5,7};
        ArrayList<Integer> al=new ArrayList<>();
        int odd=0;
        int even=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                al.add(a[i]);
                even+=a[i];
            }
            else{
                odd+=a[i];
            }}
            if(even>odd){
                System.out.println(al);
            }
            else{
                System.out.println("its less");
            }
        
    }
}