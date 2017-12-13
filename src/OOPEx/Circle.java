package OOPEx;

/**
 * Created by alexander on 2017-10-25.
 */
public class Circle {
    double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }
    public double getCircumference() {
        return 2*this.radius*Math.PI;
    }
    public String toString() {
        return "OOPEx.Circle[radius=" + radius + "]";
    }
}
