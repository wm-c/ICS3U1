package game;

import java.awt.Component;
import java.util.List;

import javax.swing.*;

public class Screen {

    private static JFrame screen;
    

    public Screen() {
        this("Default");
    }

    public Screen(final String name) {
        createScreen(name);
    }

    public JFrame createScreen(final String name) {
        screen = new JFrame(name);
        return screen;
    }

    public JFrame getJFrame(){
        return screen;
    }


    public void addTo(final Component addToItem) {
        screen.getContentPane().add(addToItem);
        
    }

    public void buildScreen(int x, int y) {
        screen.pack();
        screen.setSize(x, y);
        screen.setLayout(null);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setFocusable(true);
        screen.setVisible(true);
    }

}