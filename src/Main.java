
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Q5");
        car1.setName("Audi");
        car1.setYear(2012);
        car1.setSpeed(240);
        Car car2 = new Car();
        car2.setModel("C 220");
        car2.setName("Mercedes");
        car2.setYear(2009);
        car2.setSpeed(280);
        Car car3 = new Car();
        car3.setModel("X6");
        car3.setName("BMW");
        car3.setYear(2015);
        car3.setSpeed(320);
        Car [] cars = new Car[]{car1,car2,car3};
        for (Car car:cars) {
            car.getall();
            System.out.println("----------------");
        }
        Person person1 = new Person();
        person1.setName("Askar");
        person1.setSurName("Almazbekov");
        person1.setAge(32);
        person1.setEmail("almazbekovaskar30@gmail.com");
        Person person2 = new Person();
        person2.setName("Kymbat");
        person2.setSurName("Ishembekova");
        person2.setAge(30);
        person2.setEmail("ishembekova31@gmail.com");
        Person person3 = new Person();
        person3.setName("Nargiza");
        person3.setSurName("Omurzakova");
        person3.setAge(28);
        person3.setEmail("omurzakova32@gmail.com");
        Person[] people = new Person[]{person1, person2, person3};
        for (Person person: people) {
            person.getAllInfo();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        }
    }

}