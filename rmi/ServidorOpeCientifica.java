//rmic ya no esta disponible para las versiones de java porteriores a la 12, con 8 no hay problemas
import java.rmi.Naming;
public class ServidorOpeCientifica{
	
	public void registrarObjetoRemoto(){
		try{
			//Se crea la referencia remota al usar un objeto polimorfico. Opera, has lo que hay en IOPeracion para reconstruir lo que hay en Operacion
			//polimorfismo:Una variable que se crea a travez de una interfaz y el constructor se crea a traves de la clase que implementa la interfaz
			IOpeCientifica opera = new OpeCientifica();
			//Una referencia polimorfica
			//Naming.rebind("rmi://localhost:1099/Operaciones",opera);//Operaciones es el nombre del servicio, no se relaciona con ninguna clase
			//Variable que almacena la url
			String url = "rmi://localhost:1099/OperaCientifica";
			//String url = "rmi://192.168.4.4:1099/OperaCientifica";
			Naming.rebind(url,opera);
			System.out.println("Servicio registrado correctamente");

		}catch(Exception e){
			System.out.println("Error: "+ e);
		}
	}

	public ServidorOpeCientifica(){
		registrarObjetoRemoto();
	}

	public static void main(String[] args) {
		System.out.println("Inicializando servicio ...");
		new ServidorOpeCientifica();
	}
}
//Definir enlace:
/*
rmi://<host_name>
	[:<name_serve_port>]
		/<service_name>
*/