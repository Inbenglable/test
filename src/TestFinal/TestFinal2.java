package TestFinal;
public class TestFinal2 extends TestFinal{
    protected  int a=200;


    public static void main(String[] args){


        TestFinal t=new TestFinal3();
        t.test();
        boolean x=t instanceof TestFinal2;
        System.out.println(x);

    }

}

