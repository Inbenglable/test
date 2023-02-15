import java.io.*;
import java.util.Scanner;

public class file{

public static void main(String a[]) throws IOException {
            File ja = new File("C:\\Users\\86158\\Desktop\\new.txt");

   // BufferedWriter brWriter=new BufferedWriter(new FileWriter(ja));
    BufferedReader reader = new BufferedReader(new FileReader(ja));
    String line=new String();
while((line=reader.readLine())!=null){
    System.out.println(line);
}
}
 }

