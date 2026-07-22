import java.util.*;
public class operation {
    public static void main(String[] args)
    {Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the number a");
        int a=sc.nextInt();
        System.out.println("enter the number b");
        int b=sc.nextInt();
        System.out.println(" enter the operations (+,=.%,/,*): ");
        char op=sc.nextLine().charAt(0);
switch(op)
{
    case '+' :
        System.out.println("addition :"+(a+b));
        break;
        case '-':
            System.out.println("subtraction :"+(a-b));
            break;
            case '*':
                System.out.println("multiplication :"+(a*b));
               break;
              case '/':
                    System.out.println("division :"+(a/b));
                    break;
                   case '%':
                        System.out.println("modulus :"+(a%b));
                        break;
                        default:
                            System.out.println("invalid operation");
                       break;
}
sc.close();
    }
    }
    

