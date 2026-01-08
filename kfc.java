import java.util.*;
class A{
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int total=0;
        
        String a=in.nextLine();
        int b=in.nextInt();
        in.nextLine();  
        String res="";
        for(int i=0;i<=b;i++){
            String v1=in.next();
            res+=v1;
            if(i!=b-1){
                res+=",";
            }
        }
        String arr[]=res.split(",");
        for(String v:arr){
            if(v.equals("Pizza")){
                total+=200;
            }
            else if(v.equals("Burger")){
                total+=150;

            }
             else if(v.equals("Coke")){
                total+=50;

            }
             else if(v.equals("Pasta")){
                total+=100;

            }}
    if(a.equals("dinein")){
        int temp=total*10/100;

        total+=temp;
    }
    else{
        total+=10;
    }
        System.out.println("Ordered items:"+res);
        System.out.println("Total Bill:"+total);
        }
    }
