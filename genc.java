class A{
    public static void main(String[]args){
        int [] a={6,1,6,1,3,2,6,1};
        int l=8;
        int res=Integer.MAX_VALUE;
        int f=0;
        int v=0;
        for(int i=0;i<l;i++){
            int temp=a[i];
            for(int j=0;j<l;j++){
                if(temp==a[j]){
                    v+=1;

                }

            }
            if(res>v){
                res=v;
                f=a[i];
                
            }
            v=0;
        }
        System.out.println(f);

    }
}