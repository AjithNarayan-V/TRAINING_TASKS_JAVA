interface Android{
    void amlodDisplay();
    void indisplay();
    void customApp();
    void calling();
    void blutooth();
    void wifi();   
}
interface Ios extends Android{

    void faceId();
    void privacy();
    void ecoSystem();
    void calling();
    void blutooth();
    void wifi();

}
class newPhone implements Ios{

    @Override
    public void amlodDisplay() {
        System.out.println("newPhone amload display");
    }

    @Override
    public void indisplay() {
        System.out.println("newPhone indisplay sensor");

    }

    @Override
    public void customApp() {
        System.out.println("newPhone can have custom app");

    }

    @Override
    public void faceId() {
        System.out.println("newPhone has faceId ");

    }

    @Override
    public void privacy() {
        System.out.println("newPhone has privacyfeatures");

    }

    @Override
    public void ecoSystem() {
        System.out.println("newPhone device eco system");

    }

    @Override
    public void calling() {
        System.out.println("newPhone has calling features");

    }

    @Override
    public void blutooth() {
        System.out.println("newPhone has bluetooth");
    }

    @Override
    public void wifi() {
        System.out.println("newPhone has wifi");

    }
    void methodCall(){
        System.err.println("------------NEW PHONE FEATURES--------------");
        amlodDisplay();
        indisplay();
        customApp();
        faceId();
        privacy();
        ecoSystem();
        calling();
        blutooth();
        wifi();
        System.out.println("-------------------------------------------------");
    }

}


public class MultipleInheritence_2 {
    
    public static void main(String[] args) {
        newPhone newPhone=new newPhone();
        newPhone.methodCall();
        
    }
}
