
package hasen;

import static hasen.Main.*;
import static hasen.BunnyAPI.*;



public class FoxAPI {
    static int FPosX = 15;
    static int FPosY = 15;
    
    public static void PlaceFox(){
    
        Spielfeld[FPosY][FPosX] = "2";
       
    }
    
    public static void MoveFox(){
        
        if(BPosY > FPosY){
           Spielfeld[FPosY][FPosX] = "0";
           FPosY++;        
          Spielfeld[FPosY][FPosX] = "2";
           
           
        }
        
    else if(BPosY < FPosY){
            Spielfeld[FPosY][FPosX] = "0";
            FPosY--;
            Spielfeld[FPosY][FPosX] = "2";
    }         
    else if(BPosY == FPosY){
         
         if(BPosX < FPosX){
            Spielfeld[FPosY][FPosX] = "0";
            FPosX--;       
            Spielfeld[FPosY][FPosX] = "2";
 
            
        }
         else if(BPosX > FPosX){
                 Spielfeld[FPosY][FPosX] = "0";
                 FPosX++;
                 Spielfeld[FPosY][FPosX] = "2";
             
         }
        
    }      
       
              
        
    }
    
      
    
}
