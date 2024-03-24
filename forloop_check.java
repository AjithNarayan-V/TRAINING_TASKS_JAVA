public class forloop_check {
    public static void main(String[] args) {
        int index = 0;
        for (int i = 0; i <5; i++) {
            if(i<2)
            {
                System.out.println("sajd"+i);
                index++;
            }
            else{
                i=i-index;
                index=0;
                System.out.println(i);
            }
           

    }
    
}
}
