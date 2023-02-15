public class Generics {

    public static <T> void printArray(T[] array) {
         for (T element : array) System.out.printf("%s ", element);
         System.out.println();
         }

    /*public static  void printArray(double[] array) {
        for (double element : array) System.out.printf("%s ", element);
        System.out.println();
    }*/

    public static <T> T a(T i){
        return i;
    }
         public static  void main(String []args) {
            Double[] t = {1.0, 2.0, 4.0, 5.0, 6.0};
            int c=2;
           System.out.println( a(c));
             printArray(t);
             String s = (String) simplyReturn("hello");
             System.out.println(s);

         }
    public static Object simplyReturn(Object o) {
        return o;
    }

}
