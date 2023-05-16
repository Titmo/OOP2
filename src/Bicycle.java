public class Bicycle implements Service{
    private String modelName;
    private int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void check() {
        System.out.println("Обслуживаем " + this.modelName);
        for (int i = 0; i < this.wheelsCount; i++) {
            updateTyre();
        }
    }
}
