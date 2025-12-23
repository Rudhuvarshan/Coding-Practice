import java.util.*;
class DATE{
    public static void main(String[] srgs){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int sum=0;
        int res=0;
        String [] arr=a.split("-");
        for(String s:arr){
            int v1=Integer.parseInt(s);
            while(v1>0){
                sum+=v1%10;
                v1=v1/10;
            }
        }
        while(sum>0){
            res+=sum%10;
            sum=sum/10;
        }
        System.out.println(res);    

    }

}