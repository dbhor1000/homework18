public class Truck extends Transport implements Transport.Competitor, Transport.DriverAndCarInformation {

    enum TruckTypes {         //Перечисления с типами для класса Truck
        N1(null, 3.5f),
        N2(3.5f, 12f),
        N3(12f, null);

        private final Float min;
        private final Float max;

        TruckTypes(Float min, Float max) {
            this.min = min;
            this.max = max;
        }

        @Override
        public String toString() {
            String result = "С полной массой";
            if (min != null) {
                result += " от " + min + "т.";
            }
            if (max != null) {
                result += " до " + max + "т.";
            }
            return result;
        }
    }


    DriverCategoryC driver;
    TruckTypes type;

    public <T extends DriverCategoryC> Truck(String model, String subModel, double engineSize, T driver, TruckTypes type) {

        super(model, subModel, engineSize);
        this.driver = driver;
        this.type = type;


    }

    public <T extends DriverCategoryC> Truck(String model, String subModel, double engineSize, T driver) {

        super(model, subModel, engineSize);
        this.driver = driver;
        this.type = null;


    }

    public DriverCategoryC getDriver() {
        return driver;
    }


    @Override
    public void pitStop() {

        System.out.println(model + " " + subModel + " ушёл на питстоп.");
        System.out.println();

    }

    @Override
    public void bestTime() {

        System.out.println("Лучшее время круга " + model + " " + subModel + " :" + ((Math.random() * ((130 - 75) + 1)) + 75));

    }

    @Override
    public void maxSpeedOnLap() {

        System.out.println("Наибольшая скорость " + model + " " + subModel + " на круге: " + ((Math.random() * ((180 - 120) + 1)) + 120));

    }

    @Override
    public void requestDriverAndCarInformation() {

        System.out.println("Водитель " + driver.getDriverName() + " управляет автомобилем " + model + " " + subModel + " и будет участвовать в заезде. ");

    }


    @Override
    public void printType() {
        System.out.println(model + " " + subModel + " :");
        if (type == null) {
            System.out.println("Данных по ТС не достаточно.");
        } else {
            System.out.println(type);
        }

        System.out.println();
    }

}