package game;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameActions extends JPanel{

    public static GameActions Game_Instance = null;

    public GameActions getInstance(){

        if(Game_Instance == null){
            Game_Instance = new GameActions();

            return Game_Instance;
        }

        return Game_Instance;
    }

    public void loop(){
        while(true){





            
        }


    }



}