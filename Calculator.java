import java.util.Scanner;

public class Calculator {

    private Scanner scanner;

    public Calculator(){
        scanner = new Scanner(System.in);
    }
    
    public void print(){
        System.out.println("-------------------------------");
        System.out.println("----------Calculator-----------");
        System.out.println("-------------------------------");
        System.out.println("1) Addition");
        System.out.println("2) Substraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.println("5) ReEnter num1 and num2");
        System.out.println("6) Exit");
        System.out.println("-------------------------------");
    }

    public void reEnterNumbers(Function f){
        System.out.println("Enter new values for num1 and num2 ");
        System.out.print("Insert Number 1: ");
        double n1 = scanner.nextDouble();
        System.out.print("Insert Number 2: ");
        double n2 = scanner.nextDouble();
        f.setNum1(n1);
        f.setNum2(n2);
    }
}
