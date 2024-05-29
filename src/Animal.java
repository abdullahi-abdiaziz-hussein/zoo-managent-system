public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("animal talking");
    }

    public void makeSound(int times) {
        System.out.println("animal talking");
    }

    public void eat() {
        System.out.println("animal eating");
    }

    public void eat(String foodType) {
        System.out.println("animal eating");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
