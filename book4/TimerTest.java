package com.book4;

import javax.swing.*;

/**
 * @author wu
 * @date 2021/1/5 - 0:39
 */
public class TimerTest
{
    public static void main(String[] args)
    {
        var listener = new TimePrinter();
        var timer = new Timer(1000,listener);
        timer.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);

    }
}
