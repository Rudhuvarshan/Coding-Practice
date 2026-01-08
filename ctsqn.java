import java.util.*;
class A{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String [] input=a.split(" ");
        int val=0;
        String dd="00";
       for(int i=0;i<input.length;i++){
        String v1=input[i];
        if(v1.length()%2==0){
            if( v1.charAt(0)=='a'|| v1.charAt(0)=='e' || v1.charAt(0)=='i' || v1.charAt(0)=='o' || v1.charAt(0)=='u'){
                 if(v1.length()>val){
                    val=v1.length();
                    dd=v1;
            }


            }
           
        }

       }
       System.out.print(dd);

    }
}