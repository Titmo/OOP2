public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("car1",4);
        Car car2 = new Car("car2",4);

        Truck truck1 = new Truck("truck1",6);
        Truck truck2 =new Truck("truck2",8);

        Bicycle bicycle1 =new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);

        ServiceStation serviceStation = new ServiceStation();
        car1.check( car1);
        serviceStation.check(car1);
        car2.check(car2);
        serviceStation.check(car2);
        truck1.check(truck1);
        serviceStation.check(truck1);
        truck2.check(truck2);
        serviceStation.check(truck2);
        bicycle1.check(bicycle1);
        serviceStation.check(bicycle1);
        bicycle2.check(bicycle2);
        serviceStation.check(bicycle2);
    }
}