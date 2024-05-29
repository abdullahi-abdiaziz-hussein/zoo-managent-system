public class Monkey extends Animal{
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return getName()+" "+getAge();
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName()+" Chattering");
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+" eating bananas");
    }
}
