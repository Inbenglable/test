import java.util.Scanner;

class CommissionEmployee {
    protected static int a = 10, b = 5;
    public static void main(String args[]){
        System.out.println("no public");

    }

    public static double earnings() {
        return a * b;
    }
}













public class extend extends CommissionEmployee {
 static int abc;
    public extend(int c) {

    }

      double c= super.earnings();


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        extend x = new extend(input.nextInt());
        System.out.println(x.earnings());
    }
}

