import java.util.*;
class A{
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        char [] a1=a.toCharArray();
        char [] a2=b.toCharArray();
        int cnt=0;
        
        for(int i=0;i<a.length();i++){
            boolean bln=false;
            for(int j=0;j<a.length();j++){
                if(a1[i]==a2[j]){
                    bln=true;
                    break;
                }
                
            }
            if(bln==true){
                    cnt+=1;
                    bln=false;
                }
        }
        if(cnt==a.length()){
            System.out.println("anagram");
        }
        else{
            System.out.println("no anagram");
        }
    }
}