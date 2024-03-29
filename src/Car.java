import java.sql.SQLOutput;
import java.time.LocalDate;

public class Car extends Transport implements Transport.Competitor, Transport.DriverAndCarInformation {

    enum CarTypes {         //Перечисления с типами для класса Car
        Sedan("Седан"),
        Hatchback("Хетчбек"),
        Coupe("Купе"),
        Universal("Универсал"),
        Vnedorozhnik("Внедорожник"),
        Crossover("Кроссовер"),
        Pickup("Пикап"),
        Furgon("Фургон"),
        Minivan("Минивэн");

        private String carType;

        CarTypes(String carType) {
            this.carType = carType;
        }

        @Override
        public String toString() {
            return carType;
        }

    }




    private DriverCategoryB driver;
    private CarTypes type;

    public <T extends DriverCategoryB> Car(String model, String subModel, double engineSize, T driver, CarTypes type) {     //Альтернативный конструктор с указанием типа автомобиля

        super(model, subModel, engineSize);
        this.driver = driver;
        this.type = type;
    }

    public <T extends DriverCategoryB> Car(String model, String subModel, double engineSize, T driver) {

        super(model, subModel, engineSize);
        this.driver = driver;
        this.type = null;       //Если тип не указан, значение null
    }

    public DriverCategoryB getDriver() {
        return driver;
    }

    public CarTypes getType() {
        return type;
    }

    public void setType(CarTypes type) {
        this.type = type;
    }

    @Override
    public void pitStop() {

        System.out.println(model + " " + subModel + " ушёл на питстоп.");
        System.out.println();

    }

    @Override
    public void bestTime() {

        System.out.println("Лучшее время круга " + model + " " + subModel + " :" + ((Math.random()*((90-60)+1))+60));

    }

    @Override
    public void maxSpeedOnLap() {

        System.out.println("Наибольшая скорость " + model + " " + subModel + " на круге: " + ((Math.random()*((220-150)+1))+150));
    }


    @Override
    public void requestDriverAndCarInformation() {

        System.out.println("Водитель " + driver.getDriverName() + " управляет автомобилем " + model + " " + subModel + " и будет участвовать в заезде. " );

    }


    @Override
    public void printType() {      //Выводим тип автомобиля

        System.out.println(model + " " + subModel + " :");

        if(type == null){
            System.out.println("Данных по ТС не достаточно.");
        } else {

        System.out.println("Тип автомобиля: " + type);
    }

        System.out.println();
    }
}