class Animal {
    String name;

    Animal(String name){
        this.name = name;
    }

    public void sound(){
        System.out.println(name+ " makes some sound");
    }
}

class Dog extends Animal {
    Dog(String name){
        super(name);
    }

    public void sound(){
        System.out.println(name+ " barks");
    }
}

class Cat extends Animal {
    Cat(String name){
        super(name);
    }

    public void sound(){
        System.out.println(name+ " meows");
    }
}

class Cow extends Animal {
    Cow(String name){
        super(name);
    }

    public void sound(){
        System.out.println(name+ " moos");
    }
}

public class Q5 {
    public static void main(String args[]){
        Animal a1 = new Animal("Some Animal");
        Animal a2 = new Dog("Bruno");
        Animal a3 = new Cat("Kitty");
        Animal a4 = new Cow("Ganga");

        a1.sound();
        a2.sound();
        a3.sound();
        a4.sound();
    }
}
