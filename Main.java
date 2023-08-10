import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner mynum = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.print("Insert Number 1: ");
        double n1 = mynum.nextDouble();
        System.out.print("Insert Number 2: ");
        double n2 = mynum.nextDouble();
        Function f = new Function();
        f.setNum1(n1);
        f.setNum2(n2);

        boolean loop = true;
        while(loop){
            c.print();
            System.out.print("Enter your choice: ");
            int choose = mynum.nextInt();
            mynum.nextLine();
            switch(choose){
                case 1:
                    f.addition();
                    f.totala();
                    break;
                case 2:
                    f.substraction();
                    f.totals();
                    break;
                case 3:
                    f.Multiplication();
                    f.totalm();
                    break;
                case 4:
                    f.division();
                    f.totald();
                    break;
                case 5:
                    c.reEnterNumbers(f);
                    break;
                case 6:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please retype!");
                    break;
            }
        }
    }
}
