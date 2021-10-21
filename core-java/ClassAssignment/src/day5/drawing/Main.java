package day5.drawing;

public class Main {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.drawingColor();
		System.out.println("Thickness: "+c.thickness());
		c.fillingColor();
		System.out.println("Size: "+c.size());
		
		System.out.println();
		
		Line l = new Line();
		l.drawingColor();
		System.out.println("Thickness: "+l.thickness());
	
	}

}
