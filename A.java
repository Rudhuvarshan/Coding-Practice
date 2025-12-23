class Main {
    public static void main(String[] args) {
  String a="I Love Zoho";
  String res="";
  String b[]=a.split(" ");
  for(int i=0;i<b.length;i++){
      String temp="";
      String tv=b[i];
      for(int j=tv.length()-1;j>=0;j--){
          temp+=tv.charAt(j);
      }
      res+=temp;
      res+=" ";
      
  }
  System.out.println(res.trim());
    }
}