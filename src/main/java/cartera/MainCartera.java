package cartera;

public class MainCartera {

	//Main ejercicio 4
	public static void main(String[] args) {
		
		Cartera c1 = new Cartera();
		Cartera c2 = new Cartera();
		
		c1.start();
		
		try {
			c1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		c2.start();

		
		//Que dos metodos esten sincronizados quiere decir que hasta que no acabe de ejecutar uno, el otro no va a empezar
	}

}
