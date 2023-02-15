package TestFinal;

public class  TestFinal {
    protected  int a=100;
    protected  void test() {
        System.out.println("hello from t1");
    }

 public static void main(String[] args) {
         TestFinal obj = new TestFinal2();
         obj.test(); // which test will be called?
         }

}
