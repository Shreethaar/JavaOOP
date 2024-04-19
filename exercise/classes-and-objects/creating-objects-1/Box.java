public class Box {
	private double width;
	private double height;
	private double depth;

	public double volume() {
		return width*height*depth;
	}
	
	public void setDim(double w, double h, double d) {
		width=w;
		height=h;
		depth=d;
	}

}


