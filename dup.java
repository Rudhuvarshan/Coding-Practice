class A{
    public static void main(String[]args){
        int [] a={1,6,12,5,2,6};
        int v=0;
        int dup=0;
        for(int i=0;i<a.length;i++){
            int temp=a[i];
            for(int j=0;j<a.length;j++){
                int ab=a[j];
                if(temp==ab){
                    v+=1;
                }


            }
            if(v>1){
                dup=temp;
                break;
            }
            else{
                v=0;
            }

        }
        System.out.print(dup);
    }
}