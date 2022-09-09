public class Bicycle  extends  WheelableTransport implements  Service{


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public  void  check(){
      System.out.println("Обслуживаем " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
        updateTyre();
    }}

    public void updateTyre() {
            System.out.println("Меняем покрышку у велосипеда");
        }
    }

