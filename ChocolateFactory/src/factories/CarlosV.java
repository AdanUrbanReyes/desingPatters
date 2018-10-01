package factories;

import boilers.ChocolateBoiler;

public class CarlosV implements Runnable{
	
	@Override
	public void run() {
		ChocolateBoiler c = ChocolateBoiler.getInstance();
		c.fill();
		c.boild();
		c.drain();
	}

}
