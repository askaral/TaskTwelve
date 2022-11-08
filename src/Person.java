public class Person {
    private String name;
    private String surName;
    private int age;
    private String email;
    
    public void setName(String name){
        this.name=name;
    }
    public void setSurName(String surName){
        this.surName=surName;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getName(){
        return name;
    }
    public String getSurName(){
        return surName;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
    public void getAllInfo(){
        System.out.println("Name: "+getName());
        System.out.println("Surname:"+getSurName());
        System.out.println("Age: "+getAge());
        System.out.println("Email: "+getEmail());
    }
}
