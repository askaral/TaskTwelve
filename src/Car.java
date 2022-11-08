public class Car {
    private String model;
    private int year;
    private int speed;
    private String name;

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String getModel(){
        return model;
    }
    public int getYear()
    {
        return year;
    }
    public int getSpeed(){
        return speed;
    }
    public String getName(){
        return name;
    }
     void getall(){
        System.out.println("Model: "+getModel());
        System.out.println("Name: "+getName());
        System.out.println("Year: "+getYear());
        System.out.println("Speed km/h: "+getSpeed());
    }


}
