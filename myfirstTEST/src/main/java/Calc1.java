public class Calc1 {
    double num1;
    double num2;

    public Calc1(){
        this.num1 = num1;
        this.num2 = num2;
    }

    static double SUM(double a, double b){
        return a+b;
    }
    static double SUB(double a, double b){
        return a-b;
    }
    static double DIV(double a, double b){
        if(a != 0){
            return a/b;
        }
        else{
            return -1;
        }
    }
    static double MULTI(double a, double b){
        return a*b;
    }
    static double MODULU(double a, double b){
        return a%b;
    }



}
