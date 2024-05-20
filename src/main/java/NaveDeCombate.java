public class NaveDeCombate extends NaveEspacial {
  private int numeroDeArmas;

  //construtor
  public NaveDeCombate(String modeloNave, double capacidadeDeCarga, int numeroDeArmas){
    super(modeloNave, capacidadeDeCarga);
    this.numeroDeArmas = numeroDeArmas;
  }
  public int getNumeroDeArmas(){
    return numeroDeArmas;
  }
  
public void setNumeroDeArmas(int numeroDeArmas){
  this.numeroDeArmas = numeroDeArmas;
}

  public void exibirInformacoesDeNaves(){
    super.exibirInformacoesDeNaves();
    System.out.println("Número de armas: " + numeroDeArmas);
  }
}