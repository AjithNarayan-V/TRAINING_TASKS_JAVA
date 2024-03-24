class vehicle{
    int speed;
    int capacity;
    vehicle(int speed,int capacity){
        this.speed=speed;
        this.capacity=capacity;
    }
    int getspeed(){
        return speed;
    }
    int getcapacity(){
        return capacity;
    }
}
class car extends vehicle{
    int speed=0;
    String name;
    car(int speed,int capacity,String name){
        super(speed, capacity);
        this.name=name;
    }
    String getbrand(){
        System.out.println("speed"+speed);

        return name;
    }
}
class bicycle extends vehicle{
    bicycle(int speed, int capacity){
        super(speed, capacity);
    }
}
public class inheritnace_hw {
    public static void main(String[] args) {
        car myCar=new car(200, 23, "tata");
        System.out.println("Car Speed: " + myCar.getspeed());
        System.out.println("Car Fuel Capacity: " + myCar.getcapacity());
        System.out.println("Car Brand: " + myCar.getbrand());
        bicycle myBicycle = new bicycle(25, 0);
        System.out.println("Bicycle Speed: " + myBicycle.getspeed());
        System.out.println("Bicycle Fuel Capacity: " + myBicycle.getcapacity());
    }
}
