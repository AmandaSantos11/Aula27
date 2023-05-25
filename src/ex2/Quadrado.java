package ex2;
public class Quadrado extends Retangulo{
    public Quadrado(float lado, float altura) {
        super(lado, altura);
    }
    @Override
    public float calcularArea() {
        return super.calcularArea();
    }
    @Override
    public float calcularPerimetro() {
        return super.calcularPerimetro();
    }
    @Override
    public void informacaoDaForma() {
        System.out.println("Informações do Quadrado:");
        System.out.println("Lado: "+lado);
        System.out.println("Altura: "+altura);
        System.out.println("Calculo da Área é: "+calcularArea());
        System.out.println("Calculo do Perímetro é: "+calcularPerimetro());
    }
}