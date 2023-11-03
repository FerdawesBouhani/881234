package src;
 class MaArithmeticException extends Exception {
    MaArithmeticException(String message){
        super(message);}}
public class Main {
    public static int divint (int x, int y) throws MaArithmeticException {
        if (y==0) throw new MaArithmeticException(" exception nouvelle");
        return (x/y);
    }
public static void main (String [] args) {
    int c=0,a=1,b=0;
    try {
        c= divint(a,b);
    }catch (MaArithmeticException e) {
        System.out.println(e.getMessage());
    }
    System.out.println("res: " + c);
    System.exit(0);
    }
    }




