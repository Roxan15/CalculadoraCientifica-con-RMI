//El archivo que implementa la interfaz es al que se le implementara el rmic (remot metoc interconection compailer)
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//ara definirla como objeto de servicio
public class Operacion extends UnicastRemoteObject implements IOperacion {
	// Esta es una clase de implementación
	// Las clases de implementación pueden implementar cualquier numero de
	// interfaces
	// Debemos poner un construtor especial
	
	public Operacion() throws RemoteException {// constructor siempre lleva los parentesis, y las cosas que implemene van despues.
		super();
	}

	public BigDecimal suma(BigDecimal num1, BigDecimal num2) throws RemoteException{
		return num1.add(num2);
	}
	public BigDecimal resta(BigDecimal num1, BigDecimal num2) throws RemoteException{
		return num1.subtract(num2);
	}
	public BigDecimal multiplicacion(BigDecimal num1, BigDecimal num2) throws RemoteException{
		return num1.multiply(num2);
	}
	public BigDecimal division(BigDecimal num1, BigDecimal num2) throws RemoteException{
		return num1.divide(num2, 6,BigDecimal.ROUND_HALF_UP);
	}

	public double alapotenciax(double num1, double num2) throws RemoteException{
		return Math.pow(num1, num2);
	}
	public double alaraizx(double num1, double num2) throws RemoteException{
		return Math.pow(num1, 1.0/num2);
	}
	
}