import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the Two numbers");
        double a = s.nextDouble();
        double b= s.nextDouble();
        double res;
        System.out.println("Emter the choice ");
        System.out.println("+ : Addition \n- : SubTraction \n* : Multiplication \n/ : division " );
        String n = s.next();

        switch (n){
            case "+" : res = a+b;
            System.out.println("Sum : " + res);
            break;
            case  "-" : res = a-b;
            System.out.println(" Difference : "+res);
            break;
            case  "*" : res = a*b;
            System.out.println(" Product "+ res);
            break;
            case "/" : if(b==0){
                System.out.println(" Invalid denominator");
            }else {
                res = a / b;
                System.out.println("Quotient : " + res);
            }
            break;
            default: System.out.println("invalid Choice");
        }
    }

}
