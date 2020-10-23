package Homework_Lesson1;

public class Wall implements Obstacles {
    private String wall;
    private static int heightWall;

    public Wall( int heightWall) {

        this.heightWall = heightWall;
    }

    public Wall(String wall) {
        this.wall = wall;
    }

    public String getWall() {
        System.out.println("Obstacle is wall !");
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public static int getHeightWall() {
        return heightWall;
    }

    public void setHeightWall(int heightWall) {
        this.heightWall = heightWall;
    }

    public void obstacle(int moveMan, int moveCat, int moveRobot){
        if (moveMan == 1){ Man.run();
            System.out.println("The Man did not overcome the obstacle ..");
        }
        if (moveMan == 2){ Man.jump();
            System.out.println("The Man overcome an obstacle ..");
        }
        if (moveCat == 1){ Cat.run();
            System.out.println("The Cat did not overcome the obstacle ..");
        }
        if (moveCat == 2){ Cat.jump();
            System.out.println("The Cat overcome an obstacle ..");
        }
        if (moveRobot == 1){ Robot.run();
            System.out.println("The Robot did not overcome the obstacle ..");
        }
        if (moveRobot == 2){ Robot.jump();
            System.out.println("The Robot overcome an obstacle ..");
        }

    };

    public void doIt(Move[] move) {
       boolean a = Boolean.parseBoolean(null);
       boolean b = Boolean.parseBoolean(null);
       boolean c = Boolean.parseBoolean(null);

            if (move[0].getHeightJump() >= heightWall) {
                a = true;
            }else {
                a = false;
            }System.out.println("Man jump " + a);

            if (move[1].getHeightJump() >= heightWall) {
                b = true;
            }else {
                b = false;
            }System.out.println("Cat jump " + b);

            if (move[2].getHeightJump() >= heightWall) {
                c = true;
            }else {
                c = false;
            }System.out.println("Robot jump " + c);
    }

}
