package ProjetoCarro;

public class main {
    public static void main(String[] args) {
      Carro meucarro = new Carro();
      meucarro.cor = "azul";
      meucarro.ano = 2017;
      meucarro.chassi = "abc-123";
      meucarro.marca = "honda-88";
      meucarro.modelo = "H-4785";
      meucarro.nr_Machas = 5;
      meucarro.nr_Portas = 4;
      meucarro.velocidade_Maxima = 250;

        meucarro.volume_Combustivel = 10;
        meucarro.marcha_atual = 2;
        meucarro.velocidade_Atual = 20;

        System.out.println(meucarro.velocidade_Atual);
        meucarro.acelera();
        System.out.println(meucarro.velocidade_Atual);
        meucarro.acelera();
        System.out.println(meucarro.velocidade_Atual);
        meucarro.acelera();
        System.out.println(meucarro.velocidade_Atual);
        meucarro.acelera();
        System.out.println(meucarro.velocidade_Atual);
    }
}