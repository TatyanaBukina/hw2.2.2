public class Truck extends WheelableTransport implements  Service {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку у грузовика");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель у грузовика");
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп у грузовика");
    }

    @Override
    public  void  check(){
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();

    }
}
