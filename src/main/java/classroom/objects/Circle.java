package classroom.objects;

public class Circle {
    public final double Pi = 3.14;
    public double radius;

    public double calculateRadius(double radius){
        this.radius = Pi * Math.pow(radius, 2);
        return this.radius;
    }

    public Circle(double radius) {
        this.radius = calculateRadius(radius);
    }
}
