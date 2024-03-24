public class reverse {
    public static void main(String[] args) {
        int number = 213234;
        int revere = 0;
        int remainder = 0;
        while (number != 0) {
            remainder = number % 10;
            revere= revere* 10 + remainder;
            number = number / 10;
        }
        System.out.println(revere);
    }

}
