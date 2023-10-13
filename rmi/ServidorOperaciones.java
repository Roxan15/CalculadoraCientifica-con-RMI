//rmic ya no esta disponible para las versiones de java porteriores a la 12, con 8 no hay problemas
import java.rmi.Naming;
public class ServidorOperaciones{
	
	public void registrarObjetoRemoto(){
		try{
			//Se crea la referencia remota al usar un objeto polimorfico. Opera, has lo que hay en IOPeracion para reconstruir lo que hay en Operacion
			//polimorfismo:Una variable que se crea a travez de una interfaz y el constructor se crea a traves de la clase que implementa la interfaz
			IOperacion opera = new Operacion();
			//Una referencia polimorfica
			//Naming.rebind("rmi://localhost:1099/Operaciones",opera);//Operaciones es el nombre del servicio, no se relaciona con ninguna clase
			//Variable que almacena la url
			String url = "rmi://192.168.4.3:1099/Operaciones";
			System.out.println("Servicio registrado correctamente");
			Naming.rebind(url,opera);

		}catch(Exception e){
			System.out.println("Error: "+ e);
			System.out.println("Inicializando servicio ...");
		}
	}

	public ServidorOperaciones(){
		registrarObjetoRemoto();
	}

	public static void main(String[] args) {
		new ServidorOperaciones();
	}
}
//Definir enlace:
/*
rmi://<host_name>
	[:<name_serve_port>]
		/<service_name>
*/