package hilos;

public class Principal {

	public static void main(String[] args) {
		
		//Generamos 100 hilos
		for (int i = 0; i < 100; i++) {
			
			//Creamos un numero aleatorio entre 1 y 5
			int tiempo = (int) (Math.random()*5+1);
			
			//Creamos un hilo
			Hilo h = new Hilo(tiempo);
			
			//Le introducimos el tiempo que debe descansar a la clase
			h.setTiempo(tiempo);
			
			//Iniciamos el hilo
			h.start();
			
			//Metodo para que duerma el tiempo correspondiente * 1000 para pasarlo a segundos
			try {
				Thread.sleep(tiempo*1000);	
			} catch (Exception e) {	
				e.printStackTrace();
			}
			
			
		}
		
	}

}




