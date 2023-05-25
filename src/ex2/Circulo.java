package ex2;
public class Circulo extends Forma{
    public float raio;
public float pi = 3.14f;
    public Circulo(float raio){
        this.raio=raio;
    }
    @Override
    public float calcularArea() {
        return pi*(raio*raio);
    }
    @Override
    public float calcularPerimetro() {
        return 2*pi*raio;
    }
    @Override
    public void informacaoDaForma() {
        System.out.println("Informações do Circulo:");
        System.out.println("Raio: "+raio);
        System.out.println("Calculo da Área é: "+calcularArea());
        System.out.println("Calculo do Perímetro é: "+calcularPerimetro());
    }
}