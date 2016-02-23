package hasen;

import static hasen.BunnyAPI.*;
import static hasen.BaseFrame.*;
import static hasen.PlaygroundGenerator.*;
import static hasen.FoxAPI.*;

import java.io.IOException;



public class Main {
    
    static String[][] Spielfeld = new String[20][20];
    static int BPosY;
    static int BPosX;

    public static void main(String[] args) throws IOException{
        
        
        CreatePlayground();
        PlaceBunnys();
        PlaceFox();
        GenerateFrame();
        GenerateVisualArray();
        
    }
}
