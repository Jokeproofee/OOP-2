import transport.Car;

public class Main {

    public static void printCar(Car car){
        System.out.println(car.getBrand() + " " +
                car.getModel() + ", " +
                car.getProductionYear() + " год выпуска, страна сборки " +
                car.getProductionCountry() + "," +
                car.getColor() + " цвет, объем двигателя - " +
                car.getEngineVolume() + " литра. Коробка передач " +
                car.getTransmission() + ", тип кузова " +
                car.getBodyType() +  ". Регистрационный номер " +
                car.getRegNumber() + " , мест " +
                car.getNumberOfSeats() + " , тип резины " +
                car.getRubberType() + " , тип запуска " +
                car.getKey().getRemoteEngineStart() + " , бесключевой доступ " +
                car.getKey().getKeylessAccess() + " , Срок действия страховки " +
                car.getInsurance().getInsuranceValidityPeriod() + " , Стоимость страховки " +
                car.getInsurance().getTheCostOfInsurance() + " , Номер страховки " +
                car.getInsurance().getInsuranceNumber());
    }

    public static void printFlower(Flower flower) {
        System.out.println("Цвет цветка " + flower.getFlowerColor() + ",Страна " +
                flower.getCountry() + ", Цена " +
                flower.getCost() + " рублей, Дней стояния " +
                flower.getLifeSpan() + " дней.");
    }

    public static void printPriceFlowerBouquet (Flower... flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.getLifeSpan() < minimumLifeSpan) {
                minimumLifeSpan = flower.getLifeSpan();
            }
            totalCost += flower.getCost();
        }
        totalCost = totalCost * 1.1;
        System.out.printf("Стоимость букета: " + "%.2f",totalCost);
        System.out.println();
        System.out.println("Срок стояния букета: " + minimumLifeSpan);
    }
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        Human human = new Human(35,"Максим","Минск","бренд-менеджер");
        Human human1 = new Human(29,"Аня","Москва","методист образовательных программ");
        Human human2 = new Human(28,"Катя","Калининград","продакт-менеджер");
        Human human3 = new Human(27,"Артём","Москва","директор по развитию бизнеса");
        Human human4 = new Human(21,"Владимир","Казань","");

        System.out.println("Привет! Меня зовут " + human.getName() + ". Я из города " + human.getTown() + ". Мне " + human.getYearOfBirth() + " лет." + " Я работаю на должности " + human.getJob() + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human1.getName() + ". Я из города " + human1.getTown() + ". Мне " + human1.getYearOfBirth() + " лет." + " Я работаю на должности " + human1.getJob() + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human2.getName() + ". Я из города " + human2.getTown() + ". Мне " + human2.getYearOfBirth() + " лет." + " Я работаю на должности " + human2.getJob() + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human3.getName() + ". Я из города " + human3.getTown() + ". Мне " + human3.getYearOfBirth() + " лет." + " Я работаю на должности " + human3.getJob() + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human4.getName() + ". Я из города " + human4.getTown() + ". Мне " + human4.getYearOfBirth() + " лет." + " Я работаю на должности " + human4.getJob() + ". Будем знакомы!");

        //Задание 2
        System.out.println("Задание 2");
        Car lada = new Car("Lada","Grande",1.7,"жёлтый",2015,"Россия","механическая","седан","р156ор078",5,"летняя",new Car.Key(false,false),new Car.Insurance(null,12_000,"123456789"));
        Car audi = new Car("Audi","A8 50 L TDI quattro",3.0,"черный",2020,"Германия","механическая","седан","р150ор078",4,"зимняя",new Car.Key(false,false),new Car.Insurance(null,12_000,null));
        Car bmw = new Car("BMW","Z8",3.0,"черный",2021,"Германия","механическая","седан","р656ор078",5,"летняя",new Car.Key(false,false),new Car.Insurance(null,12_000,null));
        Car kia = new Car("Kia","Sportage 4",2.4,"красный",2018,"Южная Корея","автомат","седан","р186ор078",4,"зимняя",new Car.Key(false,false),new Car.Insurance(null,12_000,null));
        Car hyundai = new Car("Hyundai","Avante",1.6,"оранжевый",2016,"Южная Корея","механическая","седан","р276ор078",5,"летняя",new Car.Key(false,false),new Car.Insurance(null,12_000,null));

        printCar(lada);
        printCar(audi);
        printCar(bmw);
        printCar(kia);
        printCar(hyundai);

        // Задание 2
        System.out.println("Задание 2");
        Flower rose = new Flower(null,"Голландия",35.59,0);
        Flower chrysanthemum = new Flower(null,null,15,5);
        Flower pion = new Flower(null,"Англия",69.9,1);
        Flower gypsophila = new Flower(null,"Турция",19.5,10);

        printFlower(rose);
        printFlower(chrysanthemum);
        printFlower(pion);
        printFlower(gypsophila);

        printPriceFlowerBouquet(rose,rose,rose,chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,gypsophila);
    }
}