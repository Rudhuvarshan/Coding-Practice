class A{
    public static void main(String[]args){
        int [] arr={1,2,5,10,3};
        int max=arr.length-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<max;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        System.out.println(arr[max]);
    }
}