public class Function{
    private double num1;
    private double num2;

    public void setNum1(double num1){
        this.num1 = num1;
    }

    public double getNum1(){
        return num1;
    }

    public void setNum2(double num2){
        this.num2 = num2;
    }

    public double getNum2(){
        return num2;
    }

    public double Multiplication(){
        return getNum1()*getNum2();
    }

    public void totalm(){
        System.out.println("Your result is: " + Multiplication());
    }

    public double addition(){
        return getNum1()+getNum2();
    }

    public void totala(){
        System.out.println("Your result is: " + addition());
    }

    public double substraction(){
        return getNum1()-getNum2();
    }

    public void totals(){
        System.out.println("Your result is: " + substraction());
    }

    public double division(){
        return getNum1()/getNum2();
    }

    public void totald(){
        System.out.println("Your result is: " + division());
    }
}