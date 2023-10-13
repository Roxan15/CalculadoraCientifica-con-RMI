import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface IOperacion extends Remote{
	//No tiene atributos o propiedades
	//Solo defines puras acciones, operaciones, que va a hacer, pero no como lo va a hacer, eso le toca a la clase de donde extrae los métodos.
	public BigDecimal suma(BigDecimal num1, BigDecimal num2) throws RemoteException;//El RemoteException nos marca los errores si algo sale mal
	public BigDecimal resta(BigDecimal num1, BigDecimal num2) throws RemoteException;//El RemoteException expone los metodos a la red como servicios, si no lo quiero exponer, no los pongo
	public BigDecimal multiplicacion(BigDecimal num1, BigDecimal num2) throws RemoteException;
	public BigDecimal division(BigDecimal num1, BigDecimal num2) throws RemoteException;

	public double alapotenciax(double num1, double num2) throws RemoteException;
	public double alaraizx(double num1, double num2) throws RemoteException;
	
}