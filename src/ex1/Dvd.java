package ex1;
public class Dvd extends Produto{
    public double duracao;
    public Dvd(String nome, double preco, double duracao, int codigoDeBarra) {
        super(nome, preco, codigoDeBarra);
        this.duracao=duracao;
    }
    @Override
    public void mostrarDetalhesDoProduto() {
        super.mostrarDetalhesDoProduto();
        System.out.println("Duração: " +duracao);
        System.out.println("-------------");
    }
}