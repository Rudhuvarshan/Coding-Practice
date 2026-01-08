// input:
// prices=[7,6,4,3,1]  o/p--> 0
// prices=[1,2,4,2,5,7,2,4,9,0] o/p-->8
import java.util.*;
class A{
    public static void main(String[]args){
        int prices []={1,2,4,16,2,5,1,7,2,4,9,0};
        int min=prices[0];
        int pos=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min & prices[i]>0){
                min=prices[i];
                pos=i;
            }

        }
        if(pos+1==prices.length){
            System.out.println(0);
        }
        else{
            int max=0;
            for(int j=pos;j<prices.length;j++){
                if(prices[j]>max){
                    max=prices[j];
                }

            }
            System.out.println(max-min);
        }
    }
}
