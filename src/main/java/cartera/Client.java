package cartera;

public class Client extends Thread{

	@Override
	public void run() {
		
		int x = 2;
		
		//Metodo while para conseguir un bucle infinito
		while (x>1) {
			
			//Ponemos 1 segundo a dormir al hilo
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//Creamos un numero aleatorio entre 1 y 100
			int cantidadIncrementar = (int) (Math.random()*100+1);
			
			//Ejecutamos el metodo creado en Cartera para incrementar la variable dinero
			Cartera.incrementarDinero(cantidadIncrementar);
			
			//Mostramos en pantalla la variable dinero
			System.out.println("Se ha ingresado: " + cantidadIncrementar + " - Total: " + Cartera.dinero);
		}
	}
}