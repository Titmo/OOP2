public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check(Car car) {
        super.check(car);
        System.out.println("количество колес у  " + car.getModelName()+":"+car.getWheelsCount());
    }
}
