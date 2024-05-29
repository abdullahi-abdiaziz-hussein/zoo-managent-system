public class Lion extends Animal{
    public Lion(String name, int age) {
        super(name, age);
    }


    @Override
    public String toString() {
        return getName()+" "+getAge();
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName()+" Roaring");
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+" Eating meat");
    }
}
