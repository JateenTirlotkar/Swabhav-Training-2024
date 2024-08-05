package DecoratorHW.test;

import Decorator.model.GoldenHat;
import DecoratorHW.model.HatDecorator;
import DecoratorHW.model.IHat;
import DecoratorHW.model.RibbonedHat;
import DecoratorHW.model.StandardHat;

public class HatTest {
	public static void main(String[] args) {
		IHat hat = new StandardHat();
		System.out.println(hat);
		System.out.println();
		HatDecorator goldenHat  =new GoldenHat(hat);
		System.out.println("Golden Hat price is: "+goldenHat.getPrice());
		System.out.println();
		RibbonedHat ribbonedHat =  new RibbonedHat(goldenHat);
		
		System.out.println("Ribboned Hat price is: "+ribbonedHat.getPrice());
	}

}
