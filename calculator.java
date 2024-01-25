// 1st way ro create this
import java.util.Scanner;
class practicequestion
{
   public static void main(String[]args) {
       int p1, p2,ph,cal;
       System.out.println("enter kro koi do no : ");
       Scanner r = new Scanner(System.in);
       p1 = r.nextInt();
       p2 = r.nextInt();
       System.out.println("opration lgao :");
       ph = r.nextInt();


       if(ph == 1)
       {
           cal = p1+p2;
           System.out.print("add" + cal);
       }

       else if (ph ==2)
       {
           cal = p1-p2;
           System.out.println("sub" +cal);

       }
       else if (ph ==3)
       {
           cal = p1*p2;
           System.out.print("multi" +cal);

       }
       else if (ph ==4)
       {
           cal = p1/p2;
           System.out.print("divide"+cal);

       }
       else
       {
           cal = p1%p2;
           System.out.print("remainder"+cal);
       }
   }
}


// 2nd way ro create this
import java.util.Scanner;

public class practicequestion {
   public static void main(String[] args) {
       System.out.println("Addition");
       System.out.println("subtraction");
       System.out.println("multiplication");
       System.out.println("divide");
       System.out.println("Reminder");
       System.out.print("Choose your operation: ");
       Scanner sc = new Scanner(System.in);
       int s = sc.nextInt();
       System.out.print("Enter first number : ");
       int a = sc.nextInt();
       System.out.print("Enter second number : ");
       int b = sc.nextInt();

       int Addition = a+b;
       int subtraction = a-b;
       int multiplication = a*b;
       int divide = a/b;
       int Reminder = a%b;

       switch (s){
           case 1:
               System.out.println(Addition);
               break;
           case 2:
               System.out.println(subtraction);
               break;
           case 3:
               System.out.println(multiplication);
               break;
           case 4:
               System.out.println(divide);
               break;
           case 5:
               System.out.println(Reminder);
               break;
           default:
       }
   }
}
