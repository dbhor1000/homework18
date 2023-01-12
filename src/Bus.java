public class Bus extends Transport implements Transport.Competitor, Transport.DriverAndCarInformation {

    enum BusTypes {         //Перечисления с типами для класса Bus
        Osobo_malaya(0, 10),
        Malaya(10, 25),
        Srednyaya(40, 50),
        Bolshaya(60, 80),
        Osobo_bolshaya(100, 120);

        private final int min;
        private final int max;

        BusTypes(int min, int max) {
            this.min = min;
            this.max = max;
        }

        @Override
        public String toString() {
            String result = "С посадкой от " + min + " до " + max + " пассажиров.";
            return result;
        }
    }



    DriverCategoryD driver;
    BusTypes type;



    public <T extends DriverCategoryD> Bus(String model, String subModel, double engineSize, T driver, BusTypes type) {

        super(model, subModel, engineSize);
        this.driver = driver;
        this.type = type;

    }

    public <T extends DriverCategoryD> Bus(String model, String subModel, double engineSize, T driver) {

        super(model, subModel, engineSize);
        this.driver = driver;
        this.type = null;

    }

    public DriverCategoryD getDriver() {
        return driver;
    }

    public BusTypes getType() {
        return type;
    }

    public void setType(BusTypes type) {
        this.type = type;
    }

    @Override
    public void pitStop() {

        System.out.println(model + " " + subModel + " ушёл на питстоп.");
        System.out.println();

    }

    @Override
    public void bestTime() {

        System.out.println("Лучшее время круга " + model + " " + subModel + " :" + ((Math.random()*((180-140)+1))+140));

    }

    @Override
    public void maxSpeedOnLap() {

        System.out.println("Наибольшая скорость " + model + " " + subModel + " на круге: " + ((Math.random()*((160-100)+1))+100));

    }

    @Override
    public void requestDriverAndCarInformation() {

        System.out.println("Водитель " + driver.getDriverName() + " управляет автомобилем " + model + " " + subModel + " и будет участвовать в заезде. " );

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

