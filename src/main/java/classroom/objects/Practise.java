package classroom.objects;

import classroom.PezDispanser;

public class Practise {
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.isFourWheelDrive = true;
        toyota.color = "silver";
        toyota.consumption = 7.5;
        toyota.doors = 4;
        toyota.model = "RAV4";
        System.out.println(toyota.isFourWheelDrive + " " + toyota.color + " " + toyota.consumption + " " + toyota.doors + " " + toyota.model);

        Car audi = new Car("Audi", 4, true, "Black", 7.6  );

        Cat zhorik = new Cat();
        zhorik.age = 10;
        zhorik.color = "ginger";
        zhorik.gender = 'M';
        zhorik.name = "zhora";
        zhorik.isFed = true;
        System.out.println(zhorik.age + " " + zhorik.color + " " + zhorik.gender + " " + zhorik.name + " " + zhorik.isFed);

        Fish dorado = new Fish();
        dorado.age = 2;
        dorado.color = "grey";
        dorado.isExotic = false;
        dorado.isSaltWater = true;

        Tree palm = new Tree();
        palm.age = 5;
        palm.isChopped = false;
        palm.leavesColor = "green";
        palm.origin = "Amazon";
        palm.name = "Palm";

        Employee mike = new Employee();
        mike.age = 35;
        mike.experience = 15;
        mike.gender = 'M';
        mike.isDistantWorker = true;
        mike.name = "Mike";

        Company construction = new Company();
        construction.amountEmployee = 100;
        construction.anno = 1992;
        construction.isFinanciallyStable = true;
        construction.profile = "Construction works";
        construction.name = "Construct";

        Circle circle1 = new Circle(12);
        System.out.println(circle1.radius);

        PezDispanser pezDispanser1 = new PezDispanser("FIRST");
        System.out.println(pezDispanser1.name);
        pezDispanser1.eatOneCandy();
        System.out.println(pezDispanser1.currentCandyAmount);
        pezDispanser1.loadFullDispenser();
        System.out.println(pezDispanser1.currentCandyAmount);

        Animal animal = new Animal("Animal", 1);
        animal.voice();


        Dog papsis = new Dog("Dog", 2, "Jack Russel");
        papsis.voice();

        System.out.println(papsis);











    }
}
