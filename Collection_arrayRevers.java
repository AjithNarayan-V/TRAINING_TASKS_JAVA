import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection_arrayRevers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int rotate = 4;
        int size=6;
        rotate(0, rotate - 1, list);
        rotate(rotate, size-1, list);
        rotate(0,size-1 , list);
        System.out.println(list);
    }
    static void rotate(int start, int end, List<Integer> list) {
        for (int i = start,j=end; i < j; i++,j--) {
            int temp1 = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp1);
        }
    }
}