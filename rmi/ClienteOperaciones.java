//archivos del paquete de rmi
//Para que funcione la conexión entre los 2 extremos, ambos deben tener el stub.
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;

import java.net.MalformedURLException;
import java.lang.ArithmeticException;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ClienteOperaciones{
	public static int opcion;
	public static void main(String[] args){
		//Las excepciones, los errores se manejan en el catch, para evita errores colocamos un do-while
		do{
			try{
				//Creación de la referencia remota, a traves de la clase Naming
				//buscando si existe un servicio remoto por medio de la url
				//que se registra en el servidor
				//Referencia hacia las operaciones del servicio1
				// String  url1 = "rmi://192.168.4.3/Operaciones";
				// IOperacion opera1 = (IOperacion) Naming.lookup(url1);
				//Referencia hacia las operaciones del servicio2
				String  url2 = "rmi://localhost/OperaCientifica";
				// String  url2 = "rmi://192.168.4.4/OperaCientifica";
				IOpeCientifica opera2 = (IOpeCientifica) Naming.lookup(url2);
				//Código de la operacion remota
				//Acceso a todas las operaciones
				Scanner lector = new Scanner(System.in);
				// float num1,num2,result;
				double num3, result2;

				do{
					System.out.println("Menú principal");
					System.out.println("1. Sumar");
					System.out.println("2. Restar");
					System.out.println("3. Multiplicar");
					System.out.println("4. Dividir");
					System.out.println("5. Seno");
					System.out.println("6. Coseno");
					System.out.println("7. Tangente");
					System.out.println("8. Raiz cuadrada");
					System.out.println("9. Salir");
					System.out.println("Elige una opción del menú:");
					opcion = lector.nextInt();

					switch(opcion){
						// case 1:
						// 	System.out.println("Ingresa el primer número");
						// 	num1 = lector.nextFloat();
						// 	System.out.println("Ingresa el segundo número");
						// 	num2 = lector.nextFloat();
						// 	result = opera1.suma(num1,num2);
						// 	System.out.println("El resultado de la suma es:" + result);
						// 	break;
						// case 2:
						// 	System.out.println("Ingresa el primer número");
						// 	num1 = lector.nextFloat();
						// 	System.out.println("Ingresa el segundo número");
						// 	num2 = lector.nextFloat();
						// 	result = opera1.resta(num1,num2);
						// 	System.out.println("El resultado de la resta es:" + result);
						// 	break;
						// case 3:
						// 	System.out.println("Ingresa el primer número");
						// 	num1 = lector.nextFloat();
						// 	System.out.println("Ingresa el segundo número");
						// 	num2 = lector.nextFloat();
						// 	result = opera1.multiplicacion(num1,num2);
						// 	System.out.println("El resultado de la multiplicación es:" + result);
						// 	break;
						// case 4:
						// 	System.out.println("Ingresa el primer número");
						// 	num1 = lector.nextFloat();
						// 	System.out.println("Ingresa el segundo número");
						// 	num2 = lector.nextFloat();
						// 	result = opera1.division(num1,num2);
						// 	System.out.println("El resultado de la división es:" + result);
						// 	break;
						case 5:
							System.out.println("Ingresa el número");
							num3 = lector.nextDouble();
							result2 = opera2.seno(num3);
							System.out.println("El seno del numero "+num3+" es: " + result2);
							break;
						case 6:
							System.out.println("Ingresa el número");
							num3 = lector.nextDouble();
							result2 = opera2.coseno(num3);
							System.out.println("El coseno del numero "+num3+" es: " + result2);
							break;
						case 7:
							System.out.println("Ingresa el número");
							num3 = lector.nextDouble();
							result2 = opera2.tang(num3);
							System.out.println("La tangente del numero "+num3+" es: " + result2);
							break;
						case 8:
							System.out.println("Ingresa el número");
							num3 = lector.nextDouble();
							result2 = opera2.raizCuadrada(num3);
							System.out.println("La raíz cuadrada del numero "+num3+" es: " + result2);
							break;
						case 9:
							System.out.println("Fin del programa!");
							break;
						default:
							System.out.println("Opción no valida, intenta nuevamente.");
							break;
					}
					System.out.println();
					lector.close();					

				}while(opcion != 9);

			}catch(MalformedURLException mue){
				System.out.println("Url mal formada: " + mue.getMessage());
			}catch(RemoteException re){
				System.out.println("Red no disponible: " + re.getMessage());
			}catch(NotBoundException nbe){
				System.out.println("Servicio no disponible: " + nbe.getMessage());
			}catch(IllegalArgumentException iae){
				System.out.println("El puerto de conexión es inválido: " + iae.getMessage());
			}catch(ArithmeticException ae){
				System.out.println("Error en alguna operacion: " + ae.getMessage());
			}catch(InputMismatchException ime){
				System.out.println("Por favor, ingrese un número, no se permiten carácteres especiales ni letras");
			}

		}while(opcion != 9);
	}
}

//Para correr todo:
/*
1. Iniciamos la plataforma rmi
 	1.1 corremos rmiregistry, aqui es para poner la url en funcion
2.Iniciamos el servidor
3.Iniciamos al cliente
*/