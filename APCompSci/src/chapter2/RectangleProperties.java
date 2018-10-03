package chapter2;
import java.awt.Rectangle;
public class RectangleProperties {

	public static void main(String[] args) {
		Rectangle darlene = new Rectangle(0,0,10,15);
		double wid = darlene.getWidth();
		double hgt = darlene.getHeight();
		System.out.println(wid * hgt);
		System.out.println(wid + " " + hgt);
	
	}

}
