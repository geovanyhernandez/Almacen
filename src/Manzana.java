public class Manzana{
	private String tipoManzana;
	private String procedencia;
	private String color;
	private Double eurosKilo;
	private Distribuidor distribuidor;
	private int cod_barras;

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
	 public void setCod_Barras(int cod_barras){
                 this.cod_barras=cod_barras;
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
	public int getCod_Barras(){
        return cod_barras;
    }
}