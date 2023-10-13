
//El archivo que implementa la interfaz es al que se le implementara el rmic (remot metoc interconection compailer)
import java.math.BigDecimal;
import java.math.BigInteger;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//ara definirla como objeto de servicio
public class OpeCientifica extends UnicastRemoteObject implements IOpeCientifica {
	// Esta es una clase de implementación
	// Las clases de implementación pueden implementar cualquier numero de
	// interfaces
	// Debemos poner un construtor especial
	public OpeCientifica() throws RemoteException {// constructor siempre lleva los parentesis, y las cosas que
													// implemene van despues.
		super();
	}

	public double seno(double num1) throws RemoteException {
		return Math.sin(num1);
	}

	public double coseno(double num1) throws RemoteException {
		return Math.cos(num1);
	}

	public double tang(double num1) throws RemoteException {
		return Math.tan(num1);
	}

	public double cosecante(double num1) throws RemoteException {
		return 1.00 / Math.sin(num1);
	}

	public double secante(double num1) throws RemoteException {
		return 1.00 / Math.cos(num1);
	}

	public double cotang(double num1) throws RemoteException {
		return 1.00 / Math.tan(num1);
	}

	public double raizCuadrada(double num1) throws RemoteException {
		return Math.sqrt(num1);
	}

	public double raizCubica(double num1) throws RemoteException {
		return Math.cbrt(num1);
	}

	public double log(double num1) throws RemoteException {
		return Math.log10(num1);
	}

	public double ln(double num1) throws RemoteException {
		return Math.log(num1);
	}

	public BigDecimal absoluto(BigDecimal num1) throws RemoteException {
		return num1.abs();
	}

	public BigInteger factorial(int num1) throws RemoteException {
		if (num1 < 0) {
            return BigInteger.ZERO; // El factorial de un número negativo es 0
        }
        if (num1 == 0 || num1 == 1) {
            return BigInteger.ONE; // El factorial de 0 y 1 es 1
        }

        BigInteger resultado = BigInteger.ONE;
        for (int i = 2; i <= num1; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }

		return resultado;
	}

	public double pi() throws RemoteException {
		double pi = Math.PI;
		return pi;
	}

	public double euler() throws RemoteException {
		double e = Math.E;
		return e;
	}

	public double alCubo(double num1) throws RemoteException {
		return Math.pow(num1, 3);
	}

	public double alCuadrado(double num1) throws RemoteException {
		return Math.pow(num1, 2);
	}

	public double diezAlaX(double num1) throws RemoteException {
		return Math.pow(10, num1);
	}

	public double dosaAaX(double num1) throws RemoteException {
		return Math.pow(2, num1);
	}

	public double eulerAlaX(double num1) throws RemoteException {
		return Math.exp(num1);
	}

	public BigDecimal unoSobreX(BigDecimal num1) throws RemoteException {
		BigDecimal one = BigDecimal.ONE;
		return one.divide(num1,6,BigDecimal.ROUND_HALF_UP);
	}
}