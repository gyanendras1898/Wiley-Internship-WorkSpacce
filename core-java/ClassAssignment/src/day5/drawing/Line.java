package day5.drawing;

public class Line implements Drawable,Fillable {

	@Override
	public void drawingColor() {
		System.out.println("Line drawn");
	}

	@Override
	public double thickness() {
		return 1;
	}

	@Override
	public void fillingColor() {
		System.out.println("Line filled with color");	
	}

	@Override
	public double size() {
		return 3;
	}

}
