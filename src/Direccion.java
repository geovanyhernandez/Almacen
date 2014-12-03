public class Direccion {

	private String direccion;
	private String pais;
 	private String calle;
 	private String portal;
 	private int numeroPortal;
 	private String puerta;

 	public void setDireccion(String direccion){
 		this.direccion=direccion;
 	}
 	public void setPais(String pais){
 		this.pais=pais;
 	}
 	public void setCalle(String calle){
 		this.calle=calle;
 	}
 	public void setPotal(String portal){
 		this.portal=portal;
 	}
 	public void setNumerPortal(int numeroPortal){
 		this.numeroPortal=numeroPortal;
 	}
 	public void setPuerta(String puerta){
 		this.puerta=puerta;
 	}

 	//get//
 	public String getDireccion(){
 		return direccion;
 	}
 	public String getPais(){
 		return pais;
 	}
 	public String getCalle(){
 		return calle;
 	}
 	public String getPortal(){
 		return portal;
 	}
 	public int getNumeroPortal(){
 		return numeroPortal;
 	}
 	public String getPuerta(){
 		return puerta;
 	}

}