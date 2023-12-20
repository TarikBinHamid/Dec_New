package firstClassCar;

public class TestCar {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.name="Toyota";
        car1.model="Highlander";
        car1.price=55000;
        car1.startEngine();
        System.out.println(car1.price);
    }

}
