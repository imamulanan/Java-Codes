// 8. Create an interface TVremote and use it to inherit another interface smart TVremote.
// Create a class TV which implements TVremote interface.

interface smartTVremote{
    void powerOn();
}

interface TVremote extends smartTVremote{
    void powerOff();
}

class TV implements TVremote{
    @Override
    public void powerOn(){
        System.out.println("Power is on now");
    }

    @Override
    public void powerOff(){
        System.out.println("Power is off now");
    }
}

public class Pbm_08{
    public static void main(String[] args) {
        TV t = new TV();
        t.powerOn();
        t.powerOff();
    }
}
