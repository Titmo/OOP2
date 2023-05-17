public class Bicycle extends Transport{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void doService(Transport transport) {
        for (int i = 0; i < transport.getWheelsCount() ; i++) {
            updateTyre();
        }
    }
}