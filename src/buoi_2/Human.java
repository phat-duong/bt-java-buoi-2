package buoi_2;

public class Human {
    String name = "abc";
    int age = 20;

    public void walk(){
        System.out.println("I'm walking");
    }

    public void eat(){
        System.out.println("I'm eating");
    }


    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.name);
        System.out.println(human.age);
        human.walk();
        human.eat();
    }
}
