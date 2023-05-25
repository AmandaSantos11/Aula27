package ex1;
public class Cd extends Produto{
    public int numeroDeFaixa;
    public Cd(String nome, double preco, int numeroDeFaixa, int codigoDeBarra) {
        super(nome, preco, codigoDeBarra);
        this.numeroDeFaixa=numeroDeFaixa;
    }
    @Override
    public void mostrarDetalhesDoProduto() {
        super.mostrarDetalhesDoProduto();
        System.out.println("Número de faixa: " +numeroDeFaixa);
        System.out.println("-------------");
    }
}