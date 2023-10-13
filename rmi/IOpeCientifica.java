import java.math.BigDecimal;
import java.math.BigInteger;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface IOpeCientifica extends Remote{
	//No tiene atributos o propiedades
	//Solo defines puras acciones, operaciones, que va a hacer, pero no como lo va a hacer, eso le toca a la clase de donde extrae los métodos.
	public double seno(double num1) throws RemoteException;//El RemoteException nos marca los errores si algo sale mal
	public double coseno(double num1) throws RemoteException;//El RemoteException expone los metodos a la red como servicios, si no lo quiero exponer, no los pongo
	public double tang(double num1) throws RemoteException;

	public double cosecante(double num1) throws RemoteException;
	public double secante(double num1) throws RemoteException;
	public double cotang(double num1) throws RemoteException;

	public double raizCuadrada(double num1) throws RemoteException;
	public double raizCubica(double num1) throws RemoteException;
	
	public double log(double num1) throws RemoteException;
	public double ln (double num1) throws RemoteException;
	public BigDecimal absoluto (BigDecimal num1) throws RemoteException;
	public BigInteger factorial(int num1) throws RemoteException;
	public double pi () throws RemoteException;
	public double euler () throws RemoteException;

	public double alCubo(double num1) throws RemoteException;
	public double alCuadrado(double num1) throws RemoteException;

	public double diezAlaX (double num1) throws RemoteException;
	public double dosaAaX (double num1) throws RemoteException;
	public double eulerAlaX (double num1) throws RemoteException;

	public BigDecimal unoSobreX(BigDecimal num1) throws RemoteException;
}