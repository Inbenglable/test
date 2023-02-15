
public class PassByValue{

  public  static void main(String[]args) {
/*int   a[]={5};
      System.out.println(a[0]);
  triple(a[0]);
      System.out.println(a[0]);*/
     // triple(a[1]);
      temp t=new temp();
      t.x=1;
      triple(t);
      System.out.println(t.x);
    }
  /*  public static void triple(double n) {
        n*=5;
        System.out.println(n);}*/


    /*public static void triple(int a) {
     a*=3;

         System.out.println(a);}*/

    public static void triple(temp a) {
        a.x*=3;

        System.out.println(a.x);}
}



class temp{
    int x;
}
