package entities;

 public enum Sabores {
    MARGHERITA(12.1),
    PEPPERONI(14.5),
    CARNE_DE_SOL(10.3),
    CALABRESA(13.2),
    MISTA(9.6)
    ;

    private double preco;

    private Sabores(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }
}
