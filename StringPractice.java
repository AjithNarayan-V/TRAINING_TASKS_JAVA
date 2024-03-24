//string reverse 
//vowels
//vow count

import java.util.Arrays;

public class StringPractice {
    
    public static void main(String args[]){
        String str="ajith";
        String str2="  ravi";
        String str1=new String("kiruthik");
        str="kiruthik";
        System.out.println(str);
        System.out.println(str1==str);
        System.out.println("equals: "+str.equals(str1));
        System.out.println("concat: "+str.concat(str1));
        System.out.println("compareTo: "+str.compareTo(str1));
        System.out.println("contains: "+str.contains("k"));
        System.out.println("Endsiwith: "+str.endsWith("ruthik"));
        System.out.println("toUpper: "+str.toUpperCase());
        System.err.println("equalsIgnorCase: "+str.equalsIgnoreCase(str2));
        System.out.println("Trim: "+str2.trim());






    //======================STRING BUFFER========================================
        // StringBuffer sb=new StringBuffer("gracy");
        // System.out.println(sb);
        // sb.append("navarose");
        // System.out.println(sb);
        // sb.insert(5," " );
        // System.out.println(sb);
        // sb.replace(6, 15, "ias");
        // System.out.println(sb);
        // sb.delete(6, 10);
        // System.out.println(sb);
        // Arrays.toString(args);

    }
}
