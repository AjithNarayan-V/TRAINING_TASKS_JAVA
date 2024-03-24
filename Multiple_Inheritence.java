interface Android{
    static final int androidId=1234545;
    void gamingMode();
    void fastCharging();
    void fingerPrint();
    void virtualRam();
}
interface Ios{  
    static final int IosId=5454321;
    void dynamicIsland();
    void faceId();
    void Security();
    void applecloud();

}
class kaki implements Android{

    @Override
    public void gamingMode() {
        System.out.println("kaki has gaming mode");
    }

    @Override
    public void fastCharging() {
        System.out.println("kaki has Fast Charging mode");

    }

    @Override
    public void fingerPrint() {
        System.out.println("kaki has indisplay finger print sensor ");

    }

    @Override
    public void virtualRam() {
        System.out.println("kaki has virtual ram technology");

    }
    void methodCall(){
        System.out.println("------------kaki Features---------------");
        gamingMode();
        fastCharging();
        fingerPrint();
        virtualRam();
        System.out.println(androidId);
        System.out.println("-----------------------------------------");
    }

  
}
class vivi implements Ios{

    @Override
    public void dynamicIsland() {
        System.out.println("vivi has dynamic island");

    }

    @Override
    public void faceId() {
        System.out.println("kaki has faceId");

    }

    @Override
    public void Security() {
        System.out.println("kaki has security features");

    }

    @Override
    public void applecloud() {
        System.out.println("kaki has vivi cloud");
    }
    void methodCall(){
        System.err.println("-----------vivi Features--------------");
        dynamicIsland();
        faceId();
        Security();
        applecloud();
        System.out.println(IosId    );
        System.out.println("--------------------------------------");
    }
    
}


public class Multiple_Inheritence  {
    public static void main(String[] args) {
        kaki kaki=new kaki();
        kaki.methodCall();
        vivi vivi=new vivi();
        vivi.methodCall();
        
    }
    
}
