package OOPEx;

/**
 * Created by alexander on 2017-11-08.
 */
public class MyCircle {

    private MyPoint center;
    private int radius;

    public MyCircle() {
        center = new MyPoint();
        radius = 0;
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX()  {
        return center.getX();
    }

    public void setCenterX(int centerX) {
        this.center.setX(centerX);
    }

    public int getCenterY()  {
        return center.getY();
    }

    public void setCenterY(int centerY) {
        this.center.setY(centerY);
    }

    public int[] getCenterXY() {
        return this.center.getXY();
    }

    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    public String toString() {
        return "MyCircle[radius=" + this.radius + ",center=" + this.center.toString() + "]";
    }
    public double getArea() {
        return this.radius*this.radius * Math.PI;
    }

    public double getCircumference() {
        return 2*this.radius*Math.PI;
    }

    public double distance(MyCircle otherCircle) {
        return this.center.distance(otherCircle.center);
    }
}
