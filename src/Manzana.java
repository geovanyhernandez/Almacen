public class Manzana{
	private String tipoManzana;
	private String procedencia;
	private String color;
	private Double eurosKilo;
	private Distribuidor distribuidor;
	

	//set//
	public void setTipoManzana(String tipoManzana){
		this.tipoManzana=tipoManzana;
	}
	public void setProcedencia(String procedencia){
		this.procedencia=procedencia;
	}
	public void setColor(String color){
		this.color=color;
	}
	public void setEurosKilo(Double eurosKilo){
		this.eurosKilo=eurosKilo;
	}
	public void setDistribuidor(Distribuidor distribuidor){
		this.distribuidor=distribuidor;
	}
	 

	//get//
	public String getTipoManzana(){
		return tipoManzana;
	}
	public String getProcedencia(){
		return procedencia;
	}
	public String getColor(){
		return color;
	}
	public Double getEurosKilo(){
		return eurosKilo;
	}
	public Distribuidor getDistribuidor(){
		return distribuidor;
	}
	
}