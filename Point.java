public class Point {
    private double x;
    private double y;
    
    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

	public boolean check3PointInLine(Point A, Point B, Point C) {
    	return A.getX() * C.getX() == A.getX() * B.getX() && A.getY() * C.getY() == A.getY() * B.getY();
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    public static void main(String[] args) {
    	 Point A = new Point(0, 0);
         Point B = new Point(3, 0);
         Point C = new Point(0, 4);

        Triangle ABC = new Triangle(A, B, C);
        if (ABC.isTriangle()) {
            System.out.println("This is Triangle");
            System.out.println("C = " + ABC.C());
            System.out.println("S = " + ABC.S());
        } else {
            System.out.println("This is not Triangle");
        }
    }
}