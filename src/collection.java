import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public abstract class collection {
    public static void a(){
        int a=1;
    }
    public static void main(String[]args){
        int [][]array1 = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}, {10}};

System.out.println(Arrays.deepToString(array1));
        int[] intArray = { 1, 2, 3, 4, 5, 6 };
        System.out.println(intArray.toString());
       int[] intArrayCopy = {4,6,8,5,2};

        //System.arraycopy(intArray, 0, intArrayCopy, 1, 3);
        // 另一个copy方法 : Arrays.copyOf(dataType[] srcArray,int length);
        Arrays.sort(intArrayCopy);
        System.out.println(Arrays.toString(intArrayCopy));
      /*  int[][] array1copy=new int[4][];
        System.arraycopy(array1,0,array1copy,0,4);
        System.out.println(Arrays.toString(array1copy[3]));
        array1[3][0]=20;
        System.out.println(Arrays.toString(array1copy[3]));
        int []x={2,2,2,1};
        int b= Arrays.binarySearch(x,2);
        System.out.println(b);
        ArrayList<String> ts =new ArrayList<String>();
ts.add(0,"yell");
System.out.println(ts.get(0));

ArrayList<String> arrayList=new ArrayList<String>(10);
arrayList.add("a");
        arrayList.add("b");
        System.out.println(arrayList.get(0));

        Map<constan,Integer> mapp=new HashMap<>();
constan o1=new constan();
int t1=2;
mapp.put(o1,t1);
System.out.printf("o1 to %d\n", mapp.get(o1));
        System.out.println(mapp);*/


    }

}
