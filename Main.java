package com.dhanraj;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text that you what to type continuously: ");
        String text = scanner.nextLine();
        System.out.print("Enter how many times you what to type the text: ");
        int counter = scanner.nextInt();
        while (counter > 0) {
            Thread.sleep(1000);
            for (char c : text.toCharArray()) {
                robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
                robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
            }
            Thread.sleep(500);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            counter--;
        }
    }
}

