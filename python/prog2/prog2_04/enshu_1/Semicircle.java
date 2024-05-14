// 演習問題1: 図形クラス群の拡張 Semicircle.java
public abstract class Semicircle extends Shape{
    private double radius;
    public Semicircle(double radius) {
		setRadius(radius);
	}
    public double getRadius() {
		return radius;
	}
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override public String toString() {
		return "Semicircle(length:" + radius + ")"; 
	}
}
