package w3;

public class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateAreaOfRectangle(){
        return length*width;
    }
    public double calculatePerimeterOfRectangle(){
        return (2*length+2*width);
    }
}
