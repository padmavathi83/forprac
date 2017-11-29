/* Java Program Example - Make Calculator */
		
import java.util.Scanner;

public class JavaProgram
{
    public static void main(String args[])
    {
        float a, b, res;
        char choice, ch;
        Scanner scan = new Scanner(System.in);
      do
        {
            System.out.print("1. Addition\n");
            System.out.print("2. Subtraction\n");
   switch(choice)
            {
                case '1' : System.out.print("Enter Two Number : ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a + b;
                    System.out.print("Result = " + res);
                    break;
                case '2' : System.out.print("Enter Two Number : ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a - b;
                    System.out.print("Result = " + res);
                    break;

            }
            System.out.print("\n---------------------------------------\n");
        }while(choice != 2);       
    }
}