
import robot.Robot;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Robot robot1 = new Robot("jerry", "red", 50);

        Robot robot2 = new Robot("tom", "blue", 60);
        System.out.println();
        System.out.println("I am robot one, these are my details, please change them");

        System.out.println();
        mainRobot(robot1.name, robot1.color, robot1.weight);

        System.out.println();
        weightOverwrite(robot1.weight);

        System.out.println();
        changeName(robot1.name);

        System.out.println();
        changeName(robot1.color);
    }
    public static void mainRobot(String name, String color, int weight){
        System.out.println("My name is: " +" "+ name);
        System.out.println();
        System.out.println("My color is: " +" "+ color);
        System.out.println();
        System.out.println("My weight is: " +" "+ weight);
    }

    public static int weightOverwrite(int weight){
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("PLEASE INPUT A NEW WEIGHT FOR ME");
        int newWeight = scanner.nextInt();
        System.out.println();
        System.out.println("You said: " + newWeight);
        System.out.println();
        System.out.println("Well, then my new wieght is: " +" " + newWeight);

        return newWeight;
    }
    public static String changeName(String name){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLEASE GIVE ME A NEW NAME");
        String newName = scanner.nextLine();
        System.out.println();
        System.out.println("Oh I am so excited, you gave me a nice name: " +" "+ newName);
        System.out.println();
        System.out.println("My name is now: " +" " + newName);

        return newName;
    }

    public static String changeColor(String color){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLEASE GIVE ME A NEW COLOR");
        String newColor = scanner.nextLine();
        System.out.println();
        System.out.println("Oh I am so excited, you gave me a nice color: " +" "+ newColor);
        System.out.println();
        System.out.println("My color is now: " +" " + newColor);

        return newColor;
    }
}

