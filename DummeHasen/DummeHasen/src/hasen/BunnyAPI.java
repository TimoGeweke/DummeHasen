package hasen;

import static hasen.Main.*;
import static hasen.PlaygroundGenerator.*;
import static hasen.FoxAPI.*;
import java.io.IOException;

public class BunnyAPI {
    
     /* int BPosX = (int) Math.random()*19;
        int BPosY = (int) Math.random()*19;*/
        static int BPosX = 10;
        static int BPosY = 2;
    
        public static void PlaceBunnys() {
                       
        
        Spielfeld[BPosY][BPosX] = "1";
    }
        
        public static void MoveUp() {
                      
                   
            if(BPosY == 0) {
                Spielfeld[BPosY][BPosX] = "0";
                BPosY = 19;
                Spielfeld[BPosY][BPosX] = "1";  
        }
            else {
                Spielfeld[BPosY][BPosX] = "0";
                BPosY --;
                Spielfeld[BPosY][BPosX] = "1";
                
                MoveFox();
                ResetFrame();
            }
        }
        public static void MoveDown() {
            if(BPosY == 19) {
                Spielfeld[BPosY][BPosX] = "0";
                BPosY = 0;
                Spielfeld[BPosY][BPosX] = "1";
        }
            else {
                Spielfeld[BPosY][BPosX] = "0";
                BPosY ++;
                Spielfeld[BPosY][BPosX] = "1";
                
                MoveFox();
                ResetFrame();
            }   
        }
        public static void MoveLeft() {
            if(BPosX == 0) {
                Spielfeld[BPosY][BPosX] = "0";
                BPosX= 19;
                Spielfeld[BPosY][BPosX] = "1";
        }
            else {
                Spielfeld[BPosY][BPosX] = "0";
                BPosX --;
                Spielfeld[BPosY][BPosX] = "1";
            
                MoveFox();
                ResetFrame();
            }   
        }public static void MoveRight() {
            if(BPosX == 19) {
                Spielfeld[BPosY][BPosX] = "0";
                BPosX = 0;
                Spielfeld[BPosY][BPosX] = "1";
        }
            else {
                Spielfeld[BPosY][BPosX] = "0";
                BPosX ++;
                Spielfeld[BPosY][BPosX] = "1";
            
                MoveFox();
                ResetFrame();
            }   
        }
        
}
