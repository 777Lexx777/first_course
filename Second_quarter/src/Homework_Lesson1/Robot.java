package Homework_Lesson1;

public class Robot implements Move {
    private int heightJump;
    private int longRun;

    public Robot(int heightJump, int longRun) {
        this.heightJump = heightJump;
        this.longRun = longRun;
    }

    @Override
    public int getHeightJump() {
        return heightJump;
    }

    public void setHeightJump(int heightJump) {
        this.heightJump = heightJump;
    }

    public int getLongRun() {
        return longRun;
    }

    public void setLongRun(int longRun) {
        this.longRun = longRun;
    }

    public static void run() { System.out.println("Robot is run...");}

    public static void jump() { System.out.println("Robot is jump...");}
}


