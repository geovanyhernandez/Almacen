import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.ArrayList;

public class Main{

	public  static void main(String[] args)throws IOException {

		 FileReader fr = new FileReader("recetario.txt");
		 BufferedReader br = new BufferedReader(fr); 
		 String [] campos = null;

		 System.out.println("distribuidores:");
		 String a;

		 ArrayList<Distribuidor>distrubuidor:new ArrayList<Distribuidor>();
		 while (a = br.readline() !=null) {

		 	Distribuidor distribuidor = new Distribuidor();
		 	Direccion direccion = new Direccion();
		 	Contacto contacto = Contacto();

		 	campo = a.split(",");

		 	distribuidor.setNombre(campo[0]);
		 	distribuidor.setCIF(campo[1]);
		 	
		 	direccion.setDireccion(campo[2]);

		 	contacto.setMovil(campo[3]);

		 	
		 }






	}
}