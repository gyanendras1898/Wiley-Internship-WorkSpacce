package day5.drawing;

public class Square implements Drawable, Fillable {

	@Override
	public void fillingColor() {
		System.out.println("Square filled with color");
	}

	@Override
	public double size() {
		return 4;
	}

	@Override
	public void drawingColor() {
		System.out.println("Square drawn");
	}

	@Override
	public double thickness() {
		return 1;
	}

}
