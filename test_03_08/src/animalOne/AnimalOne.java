package animalOne;

import java.util.Scanner;

public class AnimalOne {
    //    Boolean run ;
//    Boolean jump ;
//    Boolean swim ;
//
//    public AnimalOne(Boolean run ,Boolean jump,Boolean swim) {
//        this.run = run;
//        this.jump = jump;
//        this.swim = swim;
//    }
    String animalsLike(String animals){
        Boolean catLike = animals.equals("cat");
        Boolean dogLike = animals.equals("dog");
        Scanner scanner = new Scanner(System.in);
        while (catLike != true && dogLike != true) {
            System.out.println("Not understood...");
            System.out.println("We only know: cat and dog.. Try again please.");
            String tryAgain = scanner.next();
            animals = tryAgain;
            catLike = tryAgain.equals("cat");
            dogLike = tryAgain.equals("dog");
        }
        return animals;
    }
    String actionTrue(String act){
        Boolean run = act.equals("run");
        Boolean jump = act.equals("jump");
        Boolean swim = act.equals("swim");
        Scanner scanner = new Scanner(System.in);
        while (run != true && jump != true && swim != true) {
            System.out.println("You entered an unknown action...");
            System.out.println("We only know: run, jump, toSwim.. Try again please.");
            String tryAgain = scanner.next();
            act = tryAgain;
            run = tryAgain.equals("run");
            jump = tryAgain.equals("jump");
            swim = tryAgain.equals("swim");
        }
        return act;
    }
}
