package pl.Lenovo;

public abstract class Technology {
    private boolean ready;

    public Technology(boolean ready) {
        this.ready = ready;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

   public abstract void applyTechnology();
}
