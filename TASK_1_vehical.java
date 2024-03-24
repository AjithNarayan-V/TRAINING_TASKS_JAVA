
interface Engine {
     void petrol ();
     void desial ();    
}
interface Feature{
    void powerStearRing ();
    void automatic();
    void manual();
}
abstract class vehical{
    String name;
    String vehicalNumber;
    vehical(String name,String vehicalNumber){
        this.name=name;
        this.vehicalNumber=vehicalNumber;
    }
    abstract void display ();
}
class car extends vehical implements Feature,Engine{
    car(String name,String vehicalNumber){
       super(name,vehicalNumber);
    }

    @Override
    public void petrol() {
        System.out.println("Petrol Engine");
    }

    @Override
    public void desial() {
        System.out.println("Desial Engine");

    }

    @Override
    public void powerStearRing() {
        System.out.println("Power Stear Ring Feature");

    }

    @Override
    public void automatic() {
        System.out.println("Automatic Engine Feature");

    }

    @Override
    public void manual() {
        System.out.println("Manual Engine Feature");

    }

    @Override
    void display() {
        System.out.println("Has Digital despaly");

    }

}


public class TASK_1_vehical {
    public static void main(String[] args) {
        car c=new car("Innova","TN 23 DD 3512");
        c.petrol();
        // c.desial();
        c.powerStearRing();
        // c.automatic();
        c.manual();
        c.display();
        
    }
    
}
