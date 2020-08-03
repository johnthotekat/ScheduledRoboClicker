package com.techacts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Date;


public class RoboClicker {
    public static void click(int x, int y) throws AWTException {
        Robot bot = new Robot();
        bot.mouseMove(x, y);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void main(String[] args) throws AWTException {
        if (args[0] == null || args[1] == null || args[0].equals("") || args[0].equals("")) {
            System.out.println("Arguments <X> <Y> <Interval in Minutes> !");
            System.exit(1);
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int minutes = Integer.parseInt(args[2]);
        try {
            System.out.println("ROBOCLICKER starting to click");
            while (true) {
                System.out.println("Clicked at [" + x + "] [" + y + "] , Time:" + new Date());
                click(x, y);
                Thread.sleep(minutes * 60000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

