public class Car extends  WheelableTransport implements  Service{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(){
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку у машины");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель у машины");
    }


}

