package ex1;
abstract class Produto {
    public String nome;
    public double preco;
 public int codigoDebarra;
    public Produto(String nome, double preco, int codigoDebarra){
        this.nome=nome;
        this.preco=preco;
        this.codigoDebarra=codigoDebarra;
    }
    public void mostrarDetalhesDoProduto (){
        System.out.println("Detalhes do produto:");
        System.out.println("Nome: " +nome);
        System.out.println("Preço: "+preco);
        System.out.println("Código de barras: "+codigoDebarra);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigoDebarra == produto.codigoDebarra;
    }
}