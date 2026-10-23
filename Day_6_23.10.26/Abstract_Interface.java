
//interface only allow abstract method
// abstract method is hinding the implemts
//encapsulation is data hiding and setter and getter
package Day_6;

public class Abstract_Interface {
    public static void main(String[] args) {
        HondaCity h = new HondaCity();

        h.BS6();
        h.DualDiscBreaks();
        h.AirBags();
        h.RootsHorn();
        h.SonyMediaPlayer();
    }
}

interface RTO {
    void BS6();
    void DualDiscBreaks();
    void AirBags();
}

class HondaCity implements RTO {

    void RootsHorn() {
        System.out.println("Roots Horn");
    }

    void SonyMediaPlayer() {
        System.out.println("Sony Media Player");
    }

    @Override
    public void BS6() {
        System.out.println("BS6 Engine");
    }

    @Override
    public void DualDiscBreaks() {
        System.out.println("Dual Disc Brakes");
    }

    @Override
    public void AirBags() {
        System.out.println("Airbags Available");
    }
}
