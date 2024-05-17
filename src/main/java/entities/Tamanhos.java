package entities;

public enum Tamanhos {
    GRANDE(4.0),
    MEDIA(3.0),
    PEQUENA(2.0),
    BROTINHO(1.5);

    private double mult;

    private Tamanhos(double mult) {
        this.mult = mult;
    }

    public double getMult(){
        return mult;
    }

}
