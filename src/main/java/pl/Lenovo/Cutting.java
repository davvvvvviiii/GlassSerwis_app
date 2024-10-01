package pl.Lenovo;

public class Cutting extends Technology {

    public Cutting(boolean ready) {
        super(ready);
    }

    @Override
    public void applyTechnology() {
        if (isReady()){
            System.out.println("ready");
        }
        else {
            System.out.println("not ready");
        }
    }
}
