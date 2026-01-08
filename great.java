class A{
    public static void main(String [] args){
        int [] arr={15,20,17,70,2};
        int max=arr[0];
        for(int a:arr){
            if(a>max){
                max=a;
            }
            
        }
        System.out.println(max);
    }
}