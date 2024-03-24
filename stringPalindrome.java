import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str1;
        str1=sc.nextLine();
        // String s;
            StringBuffer str2=new StringBuffer();
            for(int i=str1.length()-1;i>=0;i-- ){
                    str2.append(str1.charAt(i));
            }
       
        System.out.println(str1.equals(str2.toString())?"palindrome":"not Palindrome");
        // System.out.println(str1.compareTo(str2)?"palindrome":"not Palindrome");


    }
    
}
