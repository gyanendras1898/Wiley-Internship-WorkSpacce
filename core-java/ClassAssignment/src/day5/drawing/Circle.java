package day5.drawing;

public class Circle implements Drawable, Fillable {

	@Override
	public void fillingColor() {
		System.out.println("Circle filled with color");
	}

	@Override
	public double size() {
		return 5;
	}

	@Override
	public void drawingColor() {
		System.out.println("Circle drawn");
	}

	@Override
	public double thickness() {
		return 1;
	}

}
