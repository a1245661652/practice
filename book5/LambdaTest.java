package com.book5;

import org.w3c.dom.events.Event;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/**
 * @author wu
 * @date 2021/1/7 - 1:18
 */
public class LambdaTest
{
    public static void main(String[] args) {
        var planets = new String[]{"byte","short","int","long","float","double","boolean","char"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first,second) -> (first.length()-second.length()));
        System.out.println(Arrays.toString(planets));
        //swing util ;
        var timer = new Timer(1000, event -> System.out.println("The time is"+ new Date()));
        timer.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }

}
