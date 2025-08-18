package entities;

public class area {
	
	public double width, height;
	
	public double areaR() {
		return width * height;
	}
	
	public double perimeter() {
		return width + height + width + height;
	}
	
	public double diagonal() {
		return Math.sqrt(width*width+height*height);
	}
}
