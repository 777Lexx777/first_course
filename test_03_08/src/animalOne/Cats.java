package animalOne;

public class Cats extends AnimalOne{
    int runObstacle = 200;
    int jumpObstacle = 2;

    public void catAction(String action, int lengthObstacle){
        Boolean run = action.equals("run");
        Boolean jump = action.equals("jump");

        if (run == true) {
            catRun(lengthObstacle);
        } else if (jump == true){
            catJump(lengthObstacle);
        } else catToSwim();
    }

    public void catRun( int lengthObstacle){
        if (lengthObstacle > runObstacle )
        {
            System.out.println("cat.run " + lengthObstacle + " -> run: false");
        } else
            System.out.println("cat.run " + lengthObstacle + " -> run: true");
    }
    public void catJump(int lengthObstacle){
        if (lengthObstacle > jumpObstacle )
        {
            System.out.println("cat.jump " + lengthObstacle + " -> jump: false");
        } else
            System.out.println("cat.jump " + lengthObstacle + " -> jump: true");
    }
    public void catToSwim(){ System.out.println("Sorry, but cats don't like swimming ... ");}

}
