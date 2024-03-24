abstract class iphone{
    abstract void fileManager();
    abstract void wifi();
    abstract void privateSafe();
    void camera(){
        System.out.println("Camera is running");
    }
    void bluetooth(){
        System.out.println("Bluetooth is running");
    }
}

class iphone11 extends iphone{
    void fileManager(){
        System.out.println("FileManager is running");
    }
    void wifi(){
        System.out.println("Wifi is running");
    }
    void privateSafe(){
        System.out.println("Private Safe is running");
    }
    void battery(){
        System.out.println("Battery is running at 300omah");
    }
}
class iphone12 extends iphone{
    void cinimatic(){
        System.out.println("It has cenematic settings");
    }

    @Override
    void fileManager() {

    }

    @Override
    void wifi() {

    }

    @Override
    void privateSafe() {

    }
}


public class abstraction {
    public static void main(String[] args) {
        iphone i11=new iphone11();
        i11.camera();
        i11.bluetooth();
        i11.fileManager();
        i11.wifi();
        i11.privateSafe();
        // i11.battery();
        iphone i12=new iphone12();
        i12.camera();
        i12.bluetooth();
        // i12.cinimatic();
        i12.fileManager();
        i12.wifi();
        i12.privateSafe();
        // i12.battery();
        iphone i13=new iphone11();
        i13.camera();

    }
}
