package Blind75;

public class abc {
    public static void main(String[] args) {
        Bike();
        Bike ktm = new Bike();
        ktm.name = "Duke 390";
        ktm.power = 390;
        ktm.printBike();
        // Polymorphism
        Polymorphism poly = new Polymorphism();
        poly.name = "ani";
        poly.age = 20;
        poly.print(poly.name);

        //Inheritance
        Child inherits = new Child();
        inherits.prints();
    }

    static void Bike() {
        System.out.println("ktm");
    }
}

class Bike {
    String name;
    int power;

    public void printBike() {
        System.out.println(this.name);
        System.out.println(this.power);
    }
    
    
}

class Polymorphism {
    // Example of polymorphism. Contains functions/methods of same name but Should
    // have either different return
    // type or different parameters. Function overloading..
    String name;
    int age;

    public void print(String name) {
        System.out.println(name);
    }

    public void print(int age) {
        System.out.println(age);
        
    }
}

// Inheritance
class Parent {
    String name = "Ani";
    int age = 20;
}

class Child extends Parent{
        public void prints(){
            System.out.println(name+" age is "+age);
        }
    }
