package ex2;
public class Retangulo extends Forma{
    public float lado;
    public float altura;
    public Retangulo(float lado, float altura){
        this.lado=lado;
        this.altura=altura;
    }
    @Override
    public float calcularArea() {
        return lado * altura;
    }
    @Override
    public float calcularPerimetro() {
        return (lado+lado)+(altura+altura);
    }
    @Override
    public void informacaoDaForma() {
        System.out.println("Informações do Retângulo:");
        System.out.println("Lado: "+lado);
        System.out.println("Altura: "+altura);
        System.out.println("Calculo da Área é: "+calcularArea());
        System.out.println("Calculo do Perímetro é: "+calcularPerimetro());
    }
}