import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String []args){
    int a[][]={{1,2},{3,4},{5,6}};
    int b[][]=Arrays.copyOf(a,a.length);
    a[0][1]=10;
    System.out.println(Arrays.deepToString(a));
    System.out.println(Arrays.deepToString(b));
    }
}
