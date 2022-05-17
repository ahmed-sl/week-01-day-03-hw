public class Circle {
    double radius;

    public Circle(){
        radius = 2.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "The radius = "+radius;
    }
}
