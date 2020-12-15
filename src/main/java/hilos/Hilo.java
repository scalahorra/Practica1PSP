package hilos;

public class Hilo extends Thread{
	
	private int tiempo;
	
	//Constructor
	public Hilo(int tiempo){
		
	}

	
	//Getter y Setter
	public int getTiempo() {
		return tiempo;
	}


	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}


	//Metodos
	@Override
	public void run() {
		
		System.out.println("Soy el hilo " + getId() + " y me pongo a dormir " + getTiempo() + " segundos");
		
		try {
			Thread.sleep(getTiempo()*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Soy el hilo " + getId() + " y he terminado de dormir");
	
	}
	
	
}
