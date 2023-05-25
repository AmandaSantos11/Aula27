package ex1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loja {
    public static List<Produto> listaDeProdutos = new ArrayList<>();
    public static void main(String[] args) {

        Livro livro = new Livro("It-A coisa",50,"Stephen King", 3300);
        Cd cd = new Cd("Banda Djavú", 15, 10, 5510);
        Dvd dvd1 = new Dvd("Os três mosqueteiros - Disney", 67, 1.8, 3800);
        Dvd dvd2 = new Dvd("A noiva cadáver", 70, 1.17, 220);
        Dvd dvd3 = new Dvd("Pocahontas - Disney", 80, 1.21, 3545);

        Dvd dvd4 = new Dvd("Pocahontas - Disney", 80, 1.21, 3545);
        Dvd dvd5 = new Dvd("Pocahontas - Disney", 80, 1.21, 3000);

        listaDeProdutos.addAll(Arrays.asList(livro,cd,dvd1,dvd2,dvd3));

        for (int i = 0; i < listaDeProdutos.size(); i++) {
            listaDeProdutos.get(i).mostrarDetalhesDoProduto();
        }

        System.out.println("Os códigos de barra são iguais?");
        System.out.println(dvd3.equals(dvd4));
        System.out.println("-------------------------------");

        procurarProduto(dvd1);
    }
    public static String procurarProduto(Object o){
        for (int i = 0; i < listaDeProdutos.size(); i++) {
            if (listaDeProdutos.get(i) == o){
                System.out.println("O item está na "+i+"º posição da lista.");
            }
        }
        return "O produto não foi encontrado";
    }
}