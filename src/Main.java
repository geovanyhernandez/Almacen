import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Main{

	public  static void main(String[] args)throws IOException {

		 FileReader fr = new FileReader("distribuidores.txt");
		 BufferedReader br = new BufferedReader(fr); 
		 String [] campo = null;

		 System.out.println("distribuidores:");
		 String a;

		 ArrayList <Distribuidor>distri = new ArrayList <Distribuidor>();
			

		  while((a = br.readLine()) !=null) {
		  

			 	Distribuidor distribuidor = new Distribuidor();
			 	Direccion direccion = new Direccion();
			 	Contacto contacto = new  Contacto();

			 	campo = a.split(",");

			 	distribuidor.setNombre(campo[0]);
			 	distribuidor.setCIF(campo[1]);
			 	
			 	direccion.setDireccion(campo[2]);

			 	contacto.setMovil(Integer.parseInt(campo[3]));

			 	distribuidor.setDireccion(direccion);
			 	distribuidor.setPersonaContacto(contacto);


			 	distri.add(distribuidor);
		 	
		 	}
		 for (int b=0; b<distri.size(); b++) {
		 	System.out.println("--------------------------------");	
		 	System.out.println("Nombre "+distri.get(b).getNombre());	
		 	System.out.println("CIF "+distri.get(b).getCIF());
		 
		 	System.out.println("direccion "+distri.get(b).getDireccion().getDireccion());
			System.out.println("movil "     +distri.get(b).getPersonaContacto().getMovil());


		 	
		 }


		 distri.clear();
	}
}