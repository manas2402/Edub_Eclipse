package Assignment6_29_05_24;


class Shape {
    double xAxis;
    double yAxis;

    // Constructor to initialize the coordinates
    public Shape(double xAxis, double yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }
}
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rectangle = new Shape(10.0, 20.0); // Example dimensions
        Shape square = new Shape(15.0, 15.0);   // Equal sides for a square
        Shape box = new Shape(12.0, 8.0);      // Example dimensions for a box

        // Display the coordinates for each shape
        System.out.println("Rectangle: x=" + rectangle.xAxis + ", y=" + rectangle.yAxis);
        System.out.println("Square: x=" + square.xAxis + ", y=" + square.yAxis);
        System.out.println("Box: x=" + box.xAxis + ", y=" + box.yAxis);
	}

}
