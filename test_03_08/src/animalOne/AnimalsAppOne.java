package animalOne;

import java.util.Scanner;

public class AnimalsAppOne {
    public static  void main(String[] args) {
        AnimalOne animal = new AnimalOne();
        Cats cats = new Cats();
        Dogs dogs = new Dogs();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Who would you like to know, about cat or dog ? ");
        String animals = scanner.next();
        String animalsLike = animal.animalsLike(animals);
        Boolean catLike = animalsLike.equals("cat");
        Boolean dogLike = animalsLike.equals("dog");
        if (catLike == true) {
            System.out.println(" What to do cat: run, jump or swim ? ");
            String act = scanner.next();
            String action = animal.actionTrue(act);
            System.out.println(" Please entered the length of the obstacle above zero.");
            int lengthObstacle = scanner.nextInt();
            cats.catAction(action, lengthObstacle);

        } else if (dogLike == true) {
            System.out.println(" We have twq dogs. ");
            System.out.println(" What to do dogs: run, jump or swim ? ");
            String act = scanner.next();
            String action = animal.actionTrue(act);
            System.out.println(" Please entered the length of the obstacle above zero.");
            int lengthObstacle = scanner.nextInt();
            dogs.dogAction(action, lengthObstacle);
        }

    }
}
