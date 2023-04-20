// 1º Crie a classe "Carro"

// 2º Evolua o exercício 1 e defina 3 atributos para a sua classe "Carro": cor, modelo e capacidade do tanque.

/*  3º Evolua o conceito do exercício 2 e defina 1 método para calcular o valor total para encher o tanque
    Este deve receber como parâmetro o valor da gasolina. Faça também duas sobrecargas do construtor; */

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    public Carro() {
    }

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double totalValorTanque(double valorGasolina) {
        return capacidadeTanque * valorGasolina;
    }
}