package jha.omnitya;

/**
 * @author omnityajha
 *
 */
public class Triangle {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw(){
		System.out.println("Point A(x) is :"+getPointA().getX()+" Point A(y) is :"+getPointA().getY());
		System.out.println("Point B(x) is :"+getPointB().getX()+" Point B(y) is :"+getPointB().getY());
		System.out.println("Point C(x) is :"+getPointC().getX()+" Point C(y) is :"+getPointC().getY());
	}
}
