import java.util.*;
class A{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if(a<2){
            System.out.print(0);
        }
        else{
        int [] arr=new int[a];
        arr[0]=0;
        arr[1]=1;
        int f=2;
        int i1=0;
        int i2=1;
        for(int i=0;i<a-2;i++){
            arr[f]=arr[i1]+arr[i2];
            f++;
            i1++;
            i2++;


        }
        for(int v:arr){
            System.out.print(v+" ");
        }}
    }
}