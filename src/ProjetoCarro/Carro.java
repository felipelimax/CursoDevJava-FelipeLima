package ProjetoCarro;

public class Carro {
   String modelo, cor, marca, chassi, teto_Solar, tem_Cambio;
   double velocidade_Maxima, velocidade_Atual, volume_Combustivel;
   int ano, nr_Portas,nr_Machas,marcha_atual;
   Proprietario proprietario ;


   void acelera (){
       velocidade_Atual += 1;
          }
   
    void freia(){
     velocidade_Atual = 0;
         }
   
    void troca_marcha(int marcha){
    marcha_atual = marcha;
         }
   
    void reduzir_marcha(){
       marcha_atual -=1;
         }
}
