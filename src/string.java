public class string {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'a';
        if (c1 == c2) {
            System.out.println("c1 and c2 are the same");
        }
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        if (s1 == s2) {
            System.out.println("s1 and s2 are the same");

        }
        String s3 = "Hello";
        String s4 = "Hello";
        if (s3 == s4) {
            System.out.println("s3 and s4 are the same");
        }
        String a="  ab ca c  ";
        System.out.println(a.trim());
        System.out.println(a);
   String b=new String(a);
        if (a==b){
            System.out.println("==");
        }
  else if (a.equals(b)){
       System.out.println("equal");
            System.out.println(b);
   }
    }
}