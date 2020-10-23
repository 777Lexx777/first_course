package Homework_Lesson1;
//1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
//Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).

//2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать),
// результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).

//3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
// Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.


import java.util.Random;

public class Main {

    public static void main(String[] args) {
       //Пункт 2
        Random random = new Random();
        int obstacle = random.nextInt((2))+1;
        Wall wall = new Wall("wall");
        JoggingTrack joggingTrack = new JoggingTrack("track");
        System.out.println("");

        if (obstacle == 1){
            wall.getWall();
            System.out.println("");
            int moveMan = random.nextInt((2))+1;
            int moveCat = random.nextInt((2))+1;
            int moveRobot = random.nextInt((2))+1;
            wall.obstacle(moveMan, moveCat, moveRobot);
        }

        if (obstacle == 2){
            joggingTrack.getTrack();
            System.out.println("");
            int moveMan = random.nextInt((2))+1;
            int moveCat = random.nextInt((2))+1;
            int moveRobot = random.nextInt((2))+1;
            joggingTrack.obstacle (moveMan, moveCat, moveRobot);
        }
        //======================================================================

        // Пункт 3 и пункт "*"
        int heightJumpMan = random.nextInt((4))+1;
        int longRunMan = random.nextInt((100))+1;
        int heightJumpCat = random.nextInt((3))+1;
        int longRunCat = random.nextInt((120))+1;
        int heightJumpRobot = random.nextInt((5))+1;
        int longRunRobot = random.nextInt((150))+1;
        Move[] move = {new Man(heightJumpMan,longRunMan),new Cat(heightJumpCat,longRunCat),new Robot(heightJumpRobot,longRunRobot)};


        int heightWall = random.nextInt((5))+1;
        int min = 90;
        int max = 155;
        int diff = max - min;
        int longTrack = random.nextInt((diff))+1;
        Obstacles[] obstacles = {new Wall(heightWall),new JoggingTrack(longTrack)};

        for (int i = 0; i < obstacles.length; i++) {
            System.out.println("");
            obstacles[i].doIt(move);
        }
        //======================================================================
    }
}
