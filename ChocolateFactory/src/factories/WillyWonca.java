package factories;

import boilers.ChocolateBoilerSynchronized;

public class WillyWonca implements Runnable{
	
	/*
	 * Singlenton Pattern:
	 * 
	 * Definition: Singlenton pattern ensure a class
	 * has only one instance, and provide a global
	 * point of access to it
	 * 
	 * */

	@Override
	public void run() {
		ChocolateBoilerSynchronized c = ChocolateBoilerSynchronized.getInstance();
		c.fill();
		c.boild();
		c.drain();
	}

	public static void main(String []args) {
		
		/*
		 * next code probably will be failed (we will have more than one unique instance)
		 * because CarlosV factory does not support multithreading
		 */
		 
		new Thread(new CarlosV()).start();
		new Thread(new CarlosV()).start();
		new Thread(new CarlosV()).start();
		
		/*
		 * next code  will be fine (we will have only one instance)
		 * because WillyWOnca factory supports multithreading
		 */
		new Thread(new WillyWonca()).start();
		new Thread(new WillyWonca()).start();
		new Thread(new WillyWonca()).start();
		
	}
	
}
