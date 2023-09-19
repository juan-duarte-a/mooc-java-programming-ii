public class CustomTacoBox implements TacoBox {
    
    private int tacos;

    public CustomTacoBox(int tacos) {
        if (tacos >= 0) this.tacos = tacos;
    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        if (tacos > 0) 
            tacos--;
    }
    
}
