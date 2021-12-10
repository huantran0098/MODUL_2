package thuchanh.staticproperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car = new Car("Range Rover" , "SKT T1") ;
        System.out.println(Car.numberOfCar);
        Car car1 = new Car("Mini Copper" , "C9") ;
        System.out.println(Car.numberOfCar);
    }
}
