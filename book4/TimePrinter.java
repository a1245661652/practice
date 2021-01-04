package com.book4;

import org.w3c.dom.events.Event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * @author wu
 * @date 2021/1/5 - 0:41
 */
public class TimePrinter implements ActionListener
{
    public static void main (String[] args) {

    }



    @Override
    public void actionPerformed(ActionEvent event)
    {
       System.out.println("At the tone,the time is"+Instant.ofEpochMilli(event.getWhen()));
       Toolkit.getDefaultToolkit().beep();
    }


}
