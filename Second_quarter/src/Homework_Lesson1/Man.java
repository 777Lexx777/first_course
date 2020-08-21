package Homework_Lesson1;

public class Man implements Move {
//    private String jump;
//    private String run;
    private int heightJump;
    private int longRun;

    public Man(int heightJump, int longRun) {
        this.heightJump = heightJump;
        this.longRun = longRun;
    }

//    public Man(String jump, String run) {
//        this.jump = jump;
//        this.run = run;
//    }

    public int getHeightJump() { return heightJump;}

    public void setHeightJump(int heightJump) { this.heightJump = heightJump;}

    public int getLongRun() { return longRun;}

    public void setLongRun(int longRun) { this.longRun = longRun;}


    public static void run() { System.out.println("Man is run...");}

    public static void jump() { System.out.println("Man is jump...");}


}
