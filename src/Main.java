public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion("Lion 1",3);
        lion.makeSound();
        lion.eat();
//        System.out.println(lion.toString());

        System.out.println("***********");

        Animal elephant = new Elephant("elephant 1",9);
        elephant.makeSound();
        elephant.eat();
//        System.out.println(elephant.toString());

        System.out.println("***********");

        Animal monkey = new Monkey("monkey 1",5);
        monkey.makeSound();
        monkey.eat();
//        System.out.println(monkey.toString());

    }
}
