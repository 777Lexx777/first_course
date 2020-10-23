package Homework_Lesson1;

public class JoggingTrack implements Obstacles  {
    private String track;
    private int longTrack;

    public JoggingTrack( int longTrack) {

        this.longTrack = longTrack;
    }

    public JoggingTrack(String track) {
        this.track = track;
    }

    public String getTrack() {
        System.out.println("Obstacle is track !");
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public int getLongTrack() {
        return longTrack;
    }

    public void setLongTrack(int longTrack) {
        this.longTrack = longTrack;
    }

    public void obstacle(int moveMan, int moveCat, int moveRobot){
        if (moveMan == 1){ Man.run();
            System.out.println("The Man overcome an obstacle ..");
        }
        if (moveMan == 2){ Man.jump();
            System.out.println("The Man did not overcome the obstacle ..");
        }
        if (moveCat == 1){ Cat.run();
            System.out.println("The Cat overcome an obstacle ..");
        }
        if (moveCat == 2){ Cat.jump();
            System.out.println("The Cat did not overcome the obstacle ..");
        }
        if (moveRobot == 1){ Robot.run();
            System.out.println("The Robot overcome an obstacle ..");
        }
        if (moveRobot == 2){ Robot.jump();
            System.out.println("The Robot did not overcome the obstacle ..");
        }
    }

    public void doIt(Move[] move){

        boolean a = Boolean.parseBoolean(null);
        boolean b = Boolean.parseBoolean(null);
        boolean c = Boolean.parseBoolean(null);

        if (move[0].getHeightJump() >= Wall.getHeightWall()) {
            if (move[0].getLongRun() >= longTrack) {
                a = true;
            } else {
                a = false;
            }
            System.out.println("Man run " + a);
        }
        if (move[1].getHeightJump() >= Wall.getHeightWall()) {
            if (move[1].getLongRun() >= longTrack) {
                b = true;
            } else {
                b = false;
            }
            System.out.println("Cat run " + b);
        }
        if (move[2].getHeightJump() >= Wall.getHeightWall()) {
            if (move[2].getLongRun() >= longTrack) {
                c = true;
            } else {
                c = false;
            }
            System.out.println("Robot run " + c);
        }
    }
}
