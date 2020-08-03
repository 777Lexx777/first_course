package animalOne;

public class Dogs extends AnimalOne{

        int runObstacle = 500;
        double jumpObstacle = 0.5d;
        int toSwimObstacle = 10;
        int runObstacle1 = 200;
        double jumpObstacle1 = 1.5d;
        int toSwimObstacle1 = 20;

        public void dogAction(String action, int lengthObstacle){
            Boolean run = action.equals("run");
            Boolean jump = action.equals("jump");
            //Boolean swim = action.equals("swim");
            if (run == true) {
                dogRun(lengthObstacle);
            } else if (jump == true){
                dogJump(lengthObstacle);
            } else
                dogToSwim(lengthObstacle);
        }

        public void dogRun( int lengthObstacle){
            if (lengthObstacle > runObstacle) {
                System.out.println("dog 1.run " + lengthObstacle + " -> run: false");
            } else  {
                System.out.println("dog 1.run " + lengthObstacle + " -> run: true");
            }
            if (lengthObstacle > runObstacle1) {
                System.out.println("dog 2.run " + lengthObstacle + " -> run: false");
            } else {
                System.out.println("dog 2.run " + lengthObstacle + " -> run: true");
            }
        }
        public void dogJump(int lengthObstacle){
            if (lengthObstacle > jumpObstacle) {
                System.out.println("dog 1.jump " + lengthObstacle + " -> jump: false");
            } else  {
                System.out.println("dog 1.jump " + lengthObstacle + " -> jump: true");
            }
            if (lengthObstacle > jumpObstacle1) {
                System.out.println("dog 2.jump " + lengthObstacle + " -> jump: false");
            } else {
                System.out.println("dog 2.jump " + lengthObstacle + " -> jump: true");
            }
        }
        public void dogToSwim(int lengthObstacle){
            if (lengthObstacle > toSwimObstacle) {
                System.out.println("dog 1.swim " + lengthObstacle + " -> swim: false");
            } else  {
                System.out.println("dog 1.swim " + lengthObstacle + " -> swim: true");
            }
            if (lengthObstacle > toSwimObstacle1) {
                System.out.println("dog 2.swim " + lengthObstacle + " -> swim: false");
            } else {
                System.out.println("dog 2.swim " + lengthObstacle + " -> swim: true");
            }
        }

}
