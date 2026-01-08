class A{
    public static void main(String[]args){
        int arr[]={10,15,3,7};
        int target=17;
        int v=0;
        int v2=0;
        boolean f=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                   v=arr[i];
                   v2=arr[j];
                  

                    
                }
               
            }
        }
        System.out.println(v+"+"+v2+"="+target);
    }
}