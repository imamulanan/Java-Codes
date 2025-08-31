interface smartTVremote{
    void powerOn();
}

interface TVremote extends smartTVremote{
    void powerOff();
}

class TV implements TVremote{
    @Override
    public void powerOn() {
        System.out.println("Power On");
    }

    @Override
    public void powerOff() {
        System.out.println("Power off");
    }
}
public class Raf {
    public static void main(String[] args) {
      TV t = new TV();
      t.powerOn();
      t.powerOff();
    }
}
