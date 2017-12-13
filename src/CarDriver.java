public class CarDriver {
    public static void main(String[] args){
        Car myCar = new Car();
        Car hisCar = new Car("Black", 400, 3.5, "Honda");
        Car herCar = new Car("Pink", 300, 2.5, "Volks");
        System.out.println(myCar);
        System.out.println(hisCar);
        System.out.println(herCar);

        myCar.setColor("Black");myCar.setHorsePower(500);myCar.setEngineSize(4.2);
        hisCar.setColor("Blue");hisCar.setHorsePower(650);hisCar.setEngineSize(5.6);
        herCar.setColor("Yellow");herCar.setHorsePower(450);herCar.setEngineSize(3.8);

        System.out.println("My Car: " + myCar.getColor()+ " " + myCar.getHorsePower());
        System.out.println("His Car: " + hisCar.getColor()+ " " + hisCar.getHorsePower());
        System.out.println("Her Car: " + herCar.getColor()+ " " + herCar.getHorsePower());
    }
}
