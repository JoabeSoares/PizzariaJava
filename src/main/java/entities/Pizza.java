package entities;

public class Pizza {
    // Atributos
    private String sabor1;
    private Sabor sabor;
    private String sabor2;
    private String tamanho;
    private double preco;

    // Construtor
    public Pizza(){
    };

    // Métodos getters e setters
    public String getSabor1() {
        return sabor1;
    }

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public void setSabor1(String sabor1) {
        this.sabor1 = sabor1;
    }

    public String getSabor2() {
        return sabor2;
    }

    public void setSabor2(String sabor2) {
        this.sabor2 = sabor2;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

     //Método para exibir informações da pizza
    public void exibirPizza() {
        System.out.println("Pizza de " + sabor1 + " e " + sabor2);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preço: R$ " + preco);
    }
}
