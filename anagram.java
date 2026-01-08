import java.util.*;
class A{
    public static void main(String[]args){
        System.out.print("Enter 1: ");
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        System.out.print("Enter 2: ");
        String b=in.nextLine();
        char [] arr1=a.toCharArray();
        char [] arr2=a.toCharArray();
        for(int i=0;i<a.length();i++){
            for(int j=0;j<a.length()-1;j++){
                
                if(arr1[j]>arr1[j+1]){
                    char temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        for(char v:arr1){
            System.out.print(v);
        }

    }
}