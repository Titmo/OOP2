public class Truck extends Car {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void doService(Transport transport) {
        for (int i = 0; i < transport.getWheelsCount() ; i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}