package pl.Lenovo;

public class Milling extends Technology{

    public Milling(boolean ready) {
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
