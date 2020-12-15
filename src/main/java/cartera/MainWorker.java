package cartera;

public class MainWorker {

	//Main para el ejercicio 8
	public static void main(String[] args) {
		
		//Ejecutamos los hilos de Worker
		Worker w = new Worker();
		w.start();
	}

}
