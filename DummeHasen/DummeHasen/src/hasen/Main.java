package hasen;

import static hasen.BunnyAPI.*;
import static hasen.BaseFrame.*;
import static hasen.PlaygroundGenerator.*;
import static hasen.FoxAPI.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;



public class Main {
    
    static String[][] Spielfeld = new String[20][20];
   

    public static void main(String[] args) throws IOException{
        
        
        CreatePlayground();
        PlaceBunnys();
        PlaceFox();
        GenerateFrame();
        GenerateVisualArray();
        
    }
    
  /*  public static void NewGame(){
        CreatePlayground();
        PlaceBunnys();
        PlaceFox();
        GenerateFrame();
        GenerateVisualArray();       
        
    }
    
    public static void GameOver(){
        NewGame.setVisible(true);
        
    }*/
    
   
}
