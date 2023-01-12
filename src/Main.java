import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        //Водители, участвующие в гонках

        DriverCategoryB driver1 = new DriverCategoryB("Иван", true, 8);
        DriverCategoryB driver2 = new DriverCategoryB("Сергей", true, 5);
        DriverCategoryB driver3 = new DriverCategoryB("Артур", true, 6);
        DriverCategoryB driver4 = new DriverCategoryB("Арсен", true, 3);

        DriverCategoryC driver5 = new DriverCategoryC("Фёдор", true, 3);
        DriverCategoryC driver6 = new DriverCategoryC("Михаэль", true, 5);
        DriverCategoryC driver7 = new DriverCategoryC("Александр", true, 7);
        DriverCategoryC driver8 = new DriverCategoryC("Дмитрий", true, 7);

        DriverCategoryD driver9 = new DriverCategoryD("Пётр", true, 10);
        DriverCategoryD driver10 = new DriverCategoryD("Святослав", true, 12);
        DriverCategoryD driver11 = new DriverCategoryD("Денис", true, 8);
        DriverCategoryD driver12 = new DriverCategoryD("Арсений", true, 13);

        //Транспортные средства, участвующие в гонках

        Car car1 = new Car("Форд", "Фокус", 1.6, driver1);
        Car car2 = new Car("Форд", "Мустанг", 2.6, driver2, Car.CarTypes.Universal);
        Car car3 = new Car("Ауди", "A8", 1.6, driver3, Car.CarTypes.Vnedorozhnik);
        Car car4 = new Car("Лада", "Калина", 3.4, driver4, Car.CarTypes.Crossover);


        Truck truck1 = new Truck("Скания", "Model 1", 4.6, driver5, Truck.TruckTypes.N2);
        Truck truck2 = new Truck("Джип", "Гладиатор", 5.6, driver6, Truck.TruckTypes.N1);
        Truck truck3 = new Truck("Тойота", "Такома", 4.0, driver7);
        Truck truck4 = new Truck("Шевроле", "Колорадо", 4.2, driver8);


        Bus bus1 = new Bus("Вольво", "B11R", 3.6, driver9, Bus.BusTypes.Srednyaya);
        Bus bus2 = new Bus("MAN", "Bus2", 3.7, driver10);
        Bus bus3 = new Bus("Marcopolo", "Multego", 3.6, driver11);
        Bus bus4 = new Bus("King Long", "XMQ6996Y", 4.0, driver12);




        //Сводка по каждому транспортному средству:

        car1.requestDriverAndCarInformation();
        car1.bestTime();
        car1.maxSpeedOnLap();
        car1.pitStop();

        car1.requestDriverAndCarInformation();
        car2.bestTime();
        car2.maxSpeedOnLap();
        car2.pitStop();

        car1.requestDriverAndCarInformation();
        car3.bestTime();
        car3.maxSpeedOnLap();
        car3.pitStop();

        car1.requestDriverAndCarInformation();
        car4.bestTime();
        car4.maxSpeedOnLap();
        car4.pitStop();

        truck1.requestDriverAndCarInformation();
        truck1.bestTime();
        truck1.maxSpeedOnLap();
        truck1.pitStop();

        truck2.requestDriverAndCarInformation();
        truck2.bestTime();
        truck2.maxSpeedOnLap();
        truck2.pitStop();

        truck3.requestDriverAndCarInformation();
        truck3.bestTime();
        truck3.maxSpeedOnLap();
        truck3.pitStop();

        truck4.requestDriverAndCarInformation();
        truck4.bestTime();
        truck4.maxSpeedOnLap();
        truck4.pitStop();

        bus1.requestDriverAndCarInformation();
        bus1.bestTime();
        bus1.maxSpeedOnLap();
        bus1.pitStop();

        bus2.requestDriverAndCarInformation();
        bus2.bestTime();
        bus2.maxSpeedOnLap();
        bus2.pitStop();

        bus3.requestDriverAndCarInformation();
        bus3.bestTime();
        bus3.maxSpeedOnLap();
        bus3.pitStop();

        bus4.requestDriverAndCarInformation();
        bus4.bestTime();
        bus4.maxSpeedOnLap();
        bus4.pitStop();

        //Вывод типов транспортных средств по интересующим критериям:

        car1.printType(); //Тип не указан
        bus1.printType();
        truck1.printType();
        car2.printType();


    }
}