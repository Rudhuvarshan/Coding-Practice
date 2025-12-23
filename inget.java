import java.util.*;
class A{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String [] a=in.nextLine().split(" ");
        int arr[]=new int[a.length];
        for (int i=0;i<a.length;i++){
            arr[i]=Integer.parseInt(a[i]);
        }
        for(int v:arr){
            System.out.print(v+" ");
        }
    }
}
