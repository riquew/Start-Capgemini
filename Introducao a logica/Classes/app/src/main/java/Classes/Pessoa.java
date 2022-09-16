package Classes;

public class Pessoa {
    // Atributos
    private float peso;
    private float altura;
    
    public Pessoa(float peso, float altura) {
        setPeso(peso);
        setAltura(altura);
    }
    
    
    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;    
    }
    
    // Metodos acessores
    public void setPeso(float peso) {
        if(peso < 0 || peso >= 1000) {
            System.out.println("Peso invalido");
        } else {
            this.peso = peso;
        }
    }
    
    public float getPeso() {
        return this.peso;
    }
    
    public void setAltura(float altura) {
        if(altura < 0 || altura > 3) {
            System.out.println("Altura invalida");
        } else {
            this.altura = altura;
        }
    }
    
    public float getAltura() {
        return this.altura;
    }
}