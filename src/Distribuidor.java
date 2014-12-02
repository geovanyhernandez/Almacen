public class Distribuidor {

	private String nombre;
	private String CIF;
	private Dirección dirección;
	private Contacto personaContacto;

	//set//
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setCIF(String CIF){
		this.CIF=CIF;
	}
	public void setDireccion(Dirección dirección){
		this.dirección=dirección;
	}
	public void setPersonaContacto(Contacto personaContacto){
		this.personaContacto=personaContacto;
	}

	//get//
	public String getNombre(){
		return nombre;
	}
	public String getCIF(){
		return CIF;
	}
	public Dirección getDireccion(){
		return dirección;
	}
	public Contacto getPersonaContacto(){
		return personaContacto;
	}
}