public class Bicycle extends Transport{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check(Bicycle bicycle) {
        super.check(bicycle);
        System.out.println("количество колес у  " + bicycle.getModelName()+":"+bicycle.getWheelsCount());

    }
}
