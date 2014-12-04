import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

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

		   

		  ArrayList <String>distribmanza= new ArrayList <String>();
		  ArrayList <String>distrilechu= new ArrayList <String>();
		  ArrayList <String>distrileche= new ArrayList <String>();
		 
		  ArrayList <Manzana>manza = new ArrayList <Manzana>();
		 
		 



		 Scanner sc = new sc Scanner(System.in);
		 System.out.println(" manzanas ");
	
		 for (int c=0; c<2; c++) {
		 	Manzana manzana = new Manzana();

		 	System.out.println("tipo de manaza");
		 	manzana.setTipoManzana(sc.next());

		 	System.out.println("procendecia de manzana");
		 	manzana.setProcedencia(sc.next());


		 	System.out.println("color de manzana");
		 	manzana.setProcedencia(sc.next());


		 	System.out.println("a cuantos euros la unidad");
		 	manzana.setProcedencia(sc.nextDouble());


		 	System.out.println("introduce el nombre del distribuidor");
		 	String dist = sc.next();

		 	add.distribmanza(dist);
		 	add.manza(manzana);
		 }

		  ArrayList <Lechuga>lechu = new ArrayList <Lechuga>();
		   System.out.println(" Lechugas ");

		   for (int d=0; d<1; d++) {
		   		Lechuga lechuga = new Lechuga();

		   		System.out.println("tipo de lechuga");
		 	    lechuga.setTipoLechuga(sc.next());

		 	    System.out.println("procedencia de lechuga");
		 	    lechuga.setProcedencia(sc.next());

		 	    System.out.println("color de  lechuga");
		 	    lechuga.setColor(sc.next());

		 	    System.out.println("a cuantos euros la unidad");
		 	    lechuga.setEurosUnidad(sc.nextDouble());
		 	    Distribuidor
		 	    System.out.println("distribuidor de las lechuga");
		 	    String distrilechuga= sc.next();

		 	    add.distrilechu(distrilechuga);
		 	    add.lechu(lechuga);		 			
		   	
		   }

		ArrayList <Leche>lech = new ArrayList <Leche>();
		  System.out.println(" Leche ");

		  for (int e=0; e<2; e++) {
		  	Leche leche = new Leche();

		  	System.out.println("tipo de leche");
		 	leche.setTipoLeche(sc.next());

		 	System.out.println("procedencia de leche");
		 	leche.setProcedencia(sc.next());

		 	System.out.println("a cuantos euros el litro");
		 	leche.setEurosLitro(sc.nextDouble());

		 	System.out.println("distribuidor de leche");
		 	String distrileche= sc.next();

		 	add.distrilech(distrileche);
		 	add.leche(lech);

		  	
		}

	 System.out:println("****manzanas****")
	  	 for (; ; ) {
	  	
	  	}



	}
}