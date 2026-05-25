import java.util.Scanner;
public class Calculator {
  Scanner sc=new Scanner(System.in);
  
  public static void main(String[] args) {
   
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the first number:");
    int a=sc.nextInt();
    System.out.println("Enter the first number:");
    int b=sc.nextInt();
    System.out.println("enter the operation you want to perform");
char operator=sc.next().charAt(0);
switch(operator){
  case '+':
    System.out.println(a+b);
    break;
    case '-':
      System.out.println(a-b);
      break;
      case '*':
                System.out.println("Multiplication = " + (a * b));
                break;

            case '/':
                System.out.println("Division = " + (a / b));
                break;
                 default:
                System.out.println("Invalid Day");
        }

}
    
  }

