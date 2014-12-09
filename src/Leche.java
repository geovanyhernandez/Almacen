public class Leche {

	private String tipo;
	private String procedencia;
	private Double eurosLitro;
	private Distribuidor distribuidor;

    //set//
    public void setTipo(String tipo){
    	this.tipo=tipo;
    }
    public void setProcedencia(String procedencia){
    	this.procedencia=procedencia;
    }
    public void setEurosLitro(Double eurosLitro){
    	this.eurosLitro=eurosLitro;  	
    }
    public void setDistribuidor(Distribuidor distribuidor){
    	this.distribuidor=distribuidor;
    }
    //get//
    public String getTipo(){
    	return tipo;
    }
    public String getProcedencia(){
    	return procedencia;
    }
    public Double getEurosLitro(){
    	return eurosLitro;
    }
    public Distribuidor getDistribuidor(){
    	return distribuidor;
    }

}
