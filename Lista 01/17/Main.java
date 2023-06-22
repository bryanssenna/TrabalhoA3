import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    
     double m2, totalTinta, valorLataTinta, totalLataTinta, valorTotalLataTinta, valorGalao, totalRendGalao, valorTotalGalao, tGalao, tLata, tValor;
   
    System.out.println("Vamos avaliar quanto será gasto de tinta?");
    
    System.out.println("Quantos M² será pintado ?");
       m2 = teclado.nextDouble();
       valorGalao = 25;
       valorLataTinta = 80;
       totalTinta = (m2 / 6) + ((m2 / 6)* 0.1);
       totalLataTinta = Math.ceil(totalTinta / 18) ;
       valorTotalLataTinta = totalLataTinta * valorLataTinta;
       totalRendGalao = Math.ceil(totalTinta / 3.6) ;
       valorTotalGalao = totalRendGalao * valorGalao ;
       tLata = Math.floor(totalRendGalao / 5);
       tGalao = Math.ceil(totalRendGalao % 5);
       tValor = (tLata * valorLataTinta) + (tGalao * valorGalao);

    System.out.println("Comprando só em lata daria " + totalLataTinta + " lata, que totaliza o valor de R$" + valorTotalLataTinta + ".");
    
    System.out.println("Comprando só em galão " + totalRendGalao + " galão, que totaliza o valor de R$" + valorTotalGalao + ".");
    
    System.out.println("comprando com lata e galão daria " + tLata + " lata e " + tGalao + " galão, que totaliza o valor de R$" + tValor + ".");
    
 
  }
}
