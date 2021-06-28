package JAVA;

class Main
{
    public static void main(String[] args) 
    {
        System.out.println("hola mundo");
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "andres herera";
        car.passengers = 4;

        System.out.println("car license: " + car.license);

        Car car2 = new Car();
        car2.license = "AMQ564";
        car2.driver = "andreas herera";
        car2.passengers = 3;
        System.out.println("car license: " + car2.license);
    }
}