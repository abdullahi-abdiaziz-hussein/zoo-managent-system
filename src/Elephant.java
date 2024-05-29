public class Elephant extends Animal{
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return getName()+" "+getAge();
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName()+" Trumpeting");
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+" Eating grass");
    }
}
