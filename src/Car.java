public class Car extends Bicycle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void doService(Transport transport) {
        for (int i = 0; i < transport.getWheelsCount() ; i++) {
            updateTyre();
        }
        checkEngine();
    }
}