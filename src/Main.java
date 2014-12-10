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
			 	Direccion direccion       = new Direccion();
			 	Contacto contacto         = new  Contacto();

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



		// distri.clear(); //comienza la segunda parte

		  Scanner sc = new Scanner(System.in);
	  	  System.out.println("\n informacion  productos");
	  	 
	  	  //manzana
	     ArrayList <Manzana>manza = new ArrayList <Manzana>();

		 System.out.println(" manzanas ");
	     
	     for (int c=0; c<1; c++) {
			 	Manzana manzana = new Manzana();
			 	Distribuidor distribu = new Distribuidor();

			 	System.out.println("tipo de manaza");
			 	manzana.setTipoManzana(sc.next());

			 	System.out.println("procendecia de manzana");
			 	manzana.setProcedencia(sc.next());

			 	System.out.println("color de manzana");
			 	manzana.setColor(sc.next());

			 	System.out.println("a cuanto euros el kilo");
			 	manzana.setEurosKilo(sc.nextDouble());

			 	System.out.println("introduce el nombre del distribuidor");
			 	String distr = sc.next();
			 	distribu.setNombre(distr);

			 	for (int d=0; d<distri.size();  d++) {
			 		String distri_array=distri.get(d).getNombre();
			 		if (distr.equalsIgnoreCase(distri_array)){
			 			manzana.setDistribuidor(distri.get(d));
			 		
			 		}
			 	}
		 	
		 	manza.add(manzana);
		 }
		 	


		  ArrayList <Lechuga>lechu = new ArrayList <Lechuga>();
		   System.out.println(" Lechugas ");

		   for (int e=0; e<1; e++) {
		   		Lechuga lechuga = new Lechuga();
		   		Distribuidor distribuidor = new Distribuidor();

		   		System.out.println("tipo de lechuga");
		 	    lechuga.setTipoLechuga(sc.next());

		 	    System.out.println("procedencia de lechuga");
		 	    lechuga.setProcedencia(sc.next());

		 	    System.out.println("color de  lechuga");
		 	    lechuga.setColor(sc.next());

		 	    System.out.println("a cuantos euros la unidad");
		 	    lechuga.setEurosUnidad(sc.nextDouble());

		 	    
		 	    System.out.println("distribuidor de las lechuga");
		 	    String distr= sc.next();
		 	    distribuidor.setNombre(distr);

		 	    for (int d=0; d<distri.size();  d++) {
			 		String distri_array=distri.get(d).getNombre();
			 		if (distr.equalsIgnoreCase(distri_array)){
			 			lechuga.setDistribuidor(distri.get(d));
			 		}

		 	    	}
		 	    	lechu.add(lechuga);	
		 	   } 	

		ArrayList <Leche>lech = new ArrayList <Leche>();
		  System.out.println(" Leche ");

		  for (int c=0; c<2; c++) {
			  	Leche leche = new Leche();
			  	Distribuidor distribuidor = new Distribuidor();


			  	System.out.println("tipo de leche");
			 	leche.setTipo(sc.next());

			 	System.out.println("procedencia de leche");
			 	leche.setProcedencia(sc.next());


			 	System.out.println("a cuantos euros el litro");
			 	leche.setEurosLitro(sc.nextDouble());

			 	System.out.println("distribuidor de leche");
			 	String distr = sc.next();
			 	distribuidor.setNombre(distr);

			 	for (int d=0; d<distri.size();  d++) {
				 		String distri_array=distri.get(d).getNombre();
			 		if (distr.equalsIgnoreCase(distri_array)){
			 			leche.setDistribuidor(distri.get(d));
			 		}
				 }
		 	
			 		lech.add(leche);
			    }
		 	

	 		System.out.println("****manzanas****");
	 		System.out.println("");
	  		 for (int m=0; m<manza.size(); m++) {


		  	 	System.out.println("\ntipo de manzana "         + manza.get(m).getTipoManzana());
		  	 	System.out.println("\nprocedencia de manzana "  + manza.get(m).getProcedencia());
		  	 	System.out.println("\neuros el kilo manzana "   + manza.get(m).getEurosKilo());
		  	 	System.out.println("\ncolor de manzana "        + manza.get(m).getColor());

		  	 	System.out.println("***DISTRIBUIDOR***");

		  	 	System.out.println("\ndistribuidor "     + manza.get(m).getDistribuidor().getNombre());
		  	 	System.out.println("\nCIF "              + manza.get(m).getDistribuidor().getCIF());
		  	 	System.out.println("\ndireccion "        + manza.get(m).getDistribuidor().getDireccion().getDireccion());
		  	 	System.out.println("\ncontacto movil "   + manza.get(m).getDistribuidor().getPersonaContacto().getMovil());

	  		}
	  		System.out.println("****Lechuga****");
	  		System.out.println("");
	  		for (int b=0; b<lechu.size(); b++) {
	  			System.out.println("\ntipo de lechuga  "          + lechu.get(b).getTipoLechuga());
		  	 	System.out.println("\nprocedencia de lechuga "    + lechu.get(b).getProcedencia());
		  	 	System.out.println("\neuros unidad de lechuga "   + lechu.get(b).getEurosUnidad());
		  	 	System.out.println("\ncolor de lechuga"           + lechu.get(b).getColor());

		  	 	System.out.println("***DISTRIBUIDOR***");

		  	 	System.out.println("\ndistribuidor "     + lechu.get(b).getDistribuidor().getNombre());
		  	 	System.out.println("\nCIF "              + lechu.get(b).getDistribuidor().getCIF());
		  	 	System.out.println("\ndireccion "        + lechu.get(b).getDistribuidor().getDireccion().getDireccion());
		  	 	System.out.println("\ncontacto movil "   + lechu.get(b).getDistribuidor().getPersonaContacto().getMovil());
		  	 }
		  	 System.out.println("****Leche****");
		  	 System.out.println("");
		  	 for (int c=0; c<lech.size(); c++) {
		  	 	System.out.println("\ntipo de leche  "          + lech.get(c).getTipo());
		  	 	System.out.println("\nprocedencia de leche "    + lech.get(c).getProcedencia());
		  	 	System.out.println("\neuros el litro leche "    + lech.get(c).getEurosLitro());
		  	
		  	 	System.out.println("***DISTRIBUIDOR***");

		  	 	System.out.println("\ndistribuidor "     + lech.get(c).getDistribuidor().getNombre());
		  	 	System.out.println("\nCIF "              + lech.get(c).getDistribuidor().getCIF());
		  	 	System.out.println("\ndireccion "        + lech.get(c).getDistribuidor().getDireccion().getDireccion());
		  	 	System.out.println("\ncontacto movil "   + lech.get(c).getDistribuidor().getPersonaContacto().getMovil());
		  	 }	
		  	 //vaciamos los arraylist
		  	 
		  	 manza.clear();
			 lech.clear();
			 lechu.clear();
			 distri.clear();

	}
}
