package threads6;

//import java.util.concurrent.locks.Condition;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;

public class Banco {
	private final double[] cuentas;
//	private Lock cierreBanco;
//	private Condition saldoSuficiente;
	
	public Banco() {
//		cierreBanco = new ReentrantLock();
		cuentas = new double[100];
		for(int i = 0; i < cuentas.length; i++) {
			cuentas[i] = 2000;
		}
//		saldoSuficiente = cierreBanco.newCondition();
	}
	
/*	Se deja de utilizar la instancia de Condition y Lock 
 * ya que se utiliza la palabra reservada synchronized, por lo tanto, 
 * se deja comentado*/
	public synchronized void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException {
//		cierreBanco.lock(); //Método para bloquear este código y que solo pueda ser ejecutado por un hilo
//		try {
			while(cuentas[cuentaOrigen]<cantidad) {
//				return; //si el saldo es menor a la cantidad entonces termina el método
//				saldoSuficiente.await();
				wait();
			}
			System.out.println(Thread.currentThread());
			cuentas[cuentaOrigen]-= cantidad;
			System.out.printf("%10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);
			cuentas[cuentaDestino]+= cantidad;
			System.out.printf("Saldo total: %10.2f%n", getSaldoTotal());
//			saldoSuficiente.signalAll();
			notifyAll();
//		} finally {
//			cierreBanco.unlock(); //El método se desbloquea para que 
//		}
	}
	
	public double getSaldoTotal() {
		double saldoTotal = 0;
		for(double a: cuentas) {
			saldoTotal+=a;
		}
		return saldoTotal;
	}
}
