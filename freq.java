import java.util.*;
class A{
    public static void main(String[]args){

        int a=6;
        int arr[]={1,2,2,3,3,3,30,30,80};
        ArrayList <Integer> v=new ArrayList<>();
        for(int val:arr){  
            int cnt=0;
            if(!(v.contains(val))){
                System.out.print(val);
                v.add(val);
                for(int val2:arr){
                    if(val2==val){
                        cnt+=1;
                    }
                }
                System.out.println("-"+cnt);
            }
        }
    }
}