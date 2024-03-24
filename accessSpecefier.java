class OuterClass {
    protected int a;
    protected int b;
    OuterClass(int a, int b) {
        System.out.println("test");
        this.a = a;
        this.b = b;
    }
    void print() {
        System.out.println(a);
        System.out.println(b);
        // System.out.println(c);

    }
    protected class InnerClass {
        protected int c;
        InnerClass(int c) {
            this.c = c;
        }
        void nestedtest() {
            System.out.println(c);

        }
    }
}

class OuterClass1 extends OuterClass.InnerClass {
    OuterClass1(int a, int b) {
        super(c);
    }
    void print(){
        System.out.println(c);
    }
    
}


public class accessSpecefier {
    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass(1, 2);
        OuterClass.InnerClass innerObject = outerObject.new InnerClass(90);
        innerObject.nestedtest();
        outerObject.print();
    }

}
