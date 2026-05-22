public class IsValidTriangle{
  public static boolean Triangle (int a,int b, int c){
    return(a+b>c)&&(a+c>b)&&(c+b>a);

  }
  public static void main(String[] args) {
    int a=3,b=6,c=5;
if(Triangle(a,b,c)){
  System.out.println("valid triangle");
}
else{
System.out.println("not a valid triangle");
}
  }
}