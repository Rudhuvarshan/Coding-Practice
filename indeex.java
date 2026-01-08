import java.util.*;
class A{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String [] input=in.nextLine().split(" ");
        int l=input.length;
        int [] a=new int[l];




        for(int i=0;i<l;i++){
            a[i]=Integer.parseInt(input[i]);

        }
        for(int i=l-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        // for(int r:a){
        //     System.out.print(r+" ");
        // }

    //     System.out.println("rudhu");
    //    String res=input.replace(" ","_");
    // String res=input.toLowerCase();
    //     System.out.println(res);
    //     String val=input.substring(2,5);
    //     System.out.print(val);

    //   int cnt=0;
    // for(int i=0;i<input.length();i++){
    //     if (input(i)=="a"){
            // System.out.print(input(0));
    //     }

    // }
    // if(input.contains(".org")){
    //     System.out.println("organisation");
    // }
    // else if(input.contains(".com")){
    //     System.out.println("Personal");
    // }
    // else if(input.contains(".in")){
    //     System.out.println("indian website");
    // }
    // else{
    //     System.out.println("FAKE");
    // }

    }
}