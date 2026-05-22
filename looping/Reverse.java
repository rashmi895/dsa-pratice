public class Reverse {
  public static void main(String[] args) {
    int num=359;
    int rev=0;
    while(num>0){
    int first=num%10;
    rev=rev*10+first;
    num=num/10;
    }
    System.out.println(rev);
  }
  
}
