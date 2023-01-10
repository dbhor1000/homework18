public class Bus extends Transport implements Transport.Competitor, Transport.DriverAndCarInformation {


    enum BusTypes {
        Osobo_malaya("До 10 мест"),
        Malaya("До 25 мест"),
        Srednyaya("40-50 мест"),
        Bolshaya("60-80 мест"),
        Osobo_bolshaya("100-120 мест");


        private String busType;

        BusTypes(String busType) {
            this.busType = busType;
        }

        @Override
        public String toString() {
            return busType;
        }

        public static void busTypesToString(){

            Bus.BusTypes[] bus = Bus.BusTypes.values();
            for(int i = 0; i < bus.length; i++){

                System.out.println(bus[i].toString());
            }
            System.out.println();
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

        if(type == null){
            System.out.println("Данных по ТС не достаточно.");
        } else {

            switch (type) {
                case  Osobo_malaya:
                    System.out.println("Вместимость: до 10 мест.");
                    break;
                case Malaya:
                    System.out.println("Вместимость: до 25 мест");
                    break;

                case Srednyaya:
                    System.out.println("Вместимость: от 40 до 50 мест.");
                    break;

                case Bolshaya:
                    System.out.println("Вместимость: от 60 до 80 мест.");
                    break;

                case Osobo_bolshaya:
                    System.out.println("Вместимость: от 100 до 120 мест.");
                    break;
            }
        }

        System.out.println();
    }

}

