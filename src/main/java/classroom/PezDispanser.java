package classroom;

import java.util.Scanner;

public class PezDispanser {
    public int candyCount = 10;
    public int currentCandyAmount;
    public String name;

    public int eatOneCandy() {
        if (this.currentCandyAmount > 0) {
            System.out.println("You ate one candy");
            return this.currentCandyAmount--;
        } else {
            System.out.println("No candies left");
            return this.currentCandyAmount;
        }
    }

    public int eatManyCandies(int candies) {
        if (this.currentCandyAmount - candies > 0) {
            System.out.println("You ate " + candies + "candies");
            return this.currentCandyAmount - candies;
        } else {
            System.out.println("There is not enough candies");
            return this.currentCandyAmount;
        }
    }

    public int loadFullDispenser(){
        return this.currentCandyAmount = candyCount;
    }

    public PezDispanser(String name) {
        this.name = name;
        this.currentCandyAmount = candyCount;
        System.out.println("New object created");
    }

    public int getCurrentCandyAmount(){
        return currentCandyAmount;
    }



}








