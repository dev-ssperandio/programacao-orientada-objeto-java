/* 4º Evolua o conceito do exercício 3 criando objetos da classe "Carro".
Use os métodos set/get, quando aplicáveis, para definir os valores dos atributos e exibir estes valores "get". 
Passe também uma mensagem para o cálculo do total pra encher o tanque. */

public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.setCor("vermelho");
        carro1.setModelo("Ford KA");
        carro1.setCapacidadeTanque(50);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.59));
        
        Carro carro2 = new Carro("Preto", "Ford Galaxie", 60);
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.8));       
    }
}