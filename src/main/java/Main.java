public class Main {
  public static void main(String[] args) {

    //aqui estou estou criando as naves junto com os atributos
    NaveEspacial nave1 = new NaveEspacial("pássaro negro", 50.00);
    NaveDeCombate nave2 = new NaveDeCombate("milenium falcon",156.00,4);
    NaveDeCombate nave3 = new NaveDeCombate("quinjet", 100.00,2);

    //exibindo informações das naves
    System.out.println("informações das naves");


      nave1.exibirInformacoesDeNaves();
    System.out.println();

    nave2.exibirInformacoesDeNaves();
    System.out.println();

    nave3.exibirInformacoesDeNaves();
    System.out.println();
    
  }
}