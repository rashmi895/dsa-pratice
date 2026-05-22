public class CheckPower {
  public static boolean IsPower(int x,long y){
    if(x==1)
      return (y==1);


      long pow =1;
      while(pow < y)
        pow*=x;

        return pow==y;
      
    
  }
  public static void main(String[] args) {
    System.out.println(IsPower(2,8));
    System.out.println(IsPower(1, 20));
        System.out.println(IsPower(2, 128));
        System.out.println(IsPower(2, 30));
  }
}
