public class NaveEspacial{
  
  //aqui estou definindo quais atributos as naves terão, no caso vou atribuir a capacidade de carga e o nome do modelo da nave.
  private String modeloNave;
  private double capacidadeDeCarga;

  // aqui fica o construtor
  public NaveEspacial(String modeloNAve, Double capacidadeDeCarga){
    this.modeloNave = modeloNave;
    this.capacidadeDeCarga = capacidadeDeCarga;

  }
  
  public String getModeloNave(){
    return modeloNave;
    
  }
  
  public void setModeloNave(String modeloNave){
    this.modeloNave = modeloNave;
    
  }

  public double getCapacidadeDeCarga(){ 
    return capacidadeDeCarga;
    
  }
public void setCapacidadeDecarga(double capacidadeDeCarga){
  this.capacidadeDeCarga = capacidadeDeCarga;
}

  public void exibirInformacoesDeNaves(){
    System.out.println("Modelo de nave: " + modeloNave);
    System.out.println("Capacidade de carga: " + capacidadeDeCarga + " toneladas");
  }
  
}