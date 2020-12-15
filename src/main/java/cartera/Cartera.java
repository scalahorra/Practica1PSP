package cartera;

public class Cartera extends Thread{

	//Variables
	static int dinero=1000;
	
	
	//Metodos
	//Metodo para incrementar el dinero
	public synchronized static void incrementarDinero(int cantidadIncrementar) {
		
		dinero = dinero+cantidadIncrementar;
		
	}
	
	//Metodo para reducir el dinero
	public synchronized static void reducirDinero (int cantidadReducir) {
		
		dinero = dinero - cantidadReducir;
	}
	
	//Metodo para aplicar la sincronizacion de hilos
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			dinero++;
			
			System.out.println(dinero);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
				
		for (int i = 0; i < 5; i++) {
			
			dinero--;
			
			System.out.println(dinero);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}	
}