package ex1;
public class Livro extends Produto{
    public String autor;
    public Livro (String nome, double preco, String autor, int codigoDeBarra){
        super (nome,preco, codigoDeBarra);
        this.autor=autor;
    }
    @Override
    public void mostrarDetalhesDoProduto() {
        super.mostrarDetalhesDoProduto();
        System.out.println("Autor: "+autor);
        System.out.println("-------------");
    }
}