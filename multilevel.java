class car{
    int seat=4;
     int millage=21;
    static int topspeed=150;
    int fuelNeed;
    car(int km){
        fuelNeed=km/millage;
    }
    void engine(){
        System.out.println("has engine");
    } 
   
    void topspeed(){
        System.out.println(topspeed);
    }
    void printfuelneed(){
        System.out.println(fuelNeed);
    }

}
class thar extends car{
    // int millage=13;
    int seat=4;
    int fuelNeed;
    int topspeed=200;

    thar(int km){
        super(km);
        fuelNeed=km/millage;
    }
    void fourXfour(){
        System.out.println("Four X Four");
    }
    void offroad(){
        System.out.println("offroading car");
    }
    void topspeed(){
        System.out.println(topspeed);
    }
    void printfuelneed(){
        System.out.println(fuelNeed);
    }


}
class punch extends thar{
    int seat=7;
    // int millage=20;
    static int fuelNeed;
    int capacity;
    punch(int km){
        super(km);
        fuelNeed=km/millage;
    }
    void ev(){
        System.out.println("has ev");
    }
    void printfuelneed(){
        System.out.println(fuelNeed);
    }
}

public class multilevel {

    public static void main(String[] args) {
        punch hr=new punch(400);
        hr.printfuelneed();
    }
}