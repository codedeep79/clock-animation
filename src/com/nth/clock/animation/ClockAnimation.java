package com.nth.clock.animation;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

/**
 *
 * Created by HAU TRUNG NGUYEN <haunt.hcm2015@gmail.com> on Nov 18, 2021
 */
public class ClockAnimation extends JFrame {

    public static void main(String[] args) {

        new ClockAnimation();
    }

    public ClockAnimation() {

        Clock clock = new Clock();
        ClockPanel clockPanel = new ClockPanel(clock);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                clock.update();
                clockPanel.repaint();
            }

        }, 0, 1000);

        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Animated Clock");

        this.add(clockPanel);

        this.setMinimumSize(clockPanel.getMinimumSize());

        this.pack();
    }
}
