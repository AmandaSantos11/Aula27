package ex2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(3.13f, 4);
        Circulo circulo = new Circulo(45.7f);
        Quadrado quadrado = new Quadrado(78f,20);
        Retangulo retangulo2 = new Retangulo(2,4);
        Circulo circulo2 = new Circulo(10);

        List<Forma> listaDeFormas = new ArrayList<>(5);
        listaDeFormas.addAll(Arrays.asList(circulo2,retangulo,quadrado,circulo,retangulo2));

        for (int i = 0; i < listaDeFormas.size(); i++) {
            listaDeFormas.get(i).informacaoDaForma();
            System.out.println("-------------");
        }
    }
}