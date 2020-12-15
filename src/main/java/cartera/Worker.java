package cartera;

public class Worker extends Thread{

	@Override
	public void run() {
		
		int x = 2;
		
		//Metodo while para crear un bucle infinito
		while (x>1) {
			
			//Mandamos dormir el hilo 1 segundo
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//Numero aleatorio entre 1 y 100
			int cantidadReducir = (int) (Math.random()*100+1);
			
			//Ejecutamos el metodo para reducir el dinero
			Cartera.reducirDinero(cantidadReducir);
			
			//Mostramos en pantalla el dinero que reducimos
			System.out.println("Se ha retirado: " + cantidadReducir + " - Total: " + Cartera.dinero);
		}
	}
}
