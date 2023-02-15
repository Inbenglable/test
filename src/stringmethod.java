import java.util.Scanner;

public class stringmethod {

public static void main(String[] args) {
    String s1 = "hello world";
   /* char[] charArray =new char[5];
    charArray[0]='a';
    System.out.printf("s1: %s\n", s1);
    s1.getChars(6, 8, charArray, 0);
    for (char c : charArray) {
        System.out.print(c);
    }*/

/*String tr="abf f";
int a="a".compareTo("c");
    System.out.printf("\n%s\n",tr.trim());
    String[] tokens = tr.split("");
    for (String c:tokens){
        System.out.println(c);
    }
    System.out.println(a);

    StringBuilder sb=new StringBuilder("SB");
    sb.append("abcd");
    String str= sb.toString();
    System.out.println(str);*/
   Scanner input =new Scanner(System.in);
    String i=input.next();
    System.out.println(i);
    String a1 = "Hello World";
     String a2 = "123hello";
     System.out.println(a1.charAt(1));
     boolean result = a1.regionMatches(true,0, a2, 3, 5); // true or false?
    System.out.println(result);
}
}


