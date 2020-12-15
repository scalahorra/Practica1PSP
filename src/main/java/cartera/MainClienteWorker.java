package cartera;

public class MainClienteWorker {

	//Main para el ejercicio 13 y 14
	public static void main(String[] args) throws InterruptedException {
		
		//Creamos 10 clientes y 10 trabajadores
		for (int i = 0; i < 10; i++) {
			
			Client client = new Client();
			Worker worker = new Worker();
			
			client.start();			
			Thread.sleep(10000);
			
			worker.start();
			Thread.sleep(10000);
		}
	}

}
