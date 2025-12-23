class A{
    public static void main(String[] args){
        int a=[1,2,1,3,2];
        ArrayList<Integer> res=new ArrayList<>();
        for(int i:a){
            if(!res.contains(i)){
                res.add(i);
            }
        }
        System.out.println(res);
    }
}