package hasen;

import static hasen.Main.*;
import static hasen.BaseFrame.*;
import javax.swing.JFrame;


public class PlaygroundGenerator {
    

        public static void CreatePlayground() {
            for(int i=0; i<20; i++) {
                for(int x=0; x<20; x++){
                Spielfeld[i][x]="0";
                }
              
            }
    }
        public static void ResetFrame() {
            Frame.getContentPane().removeAll();
            Frame.revalidate();
            Frame.repaint();
            Frame.setSize(800, 800);
            Frame.setLayout(null);
            Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            WalkRight.setBounds(130, 700, 80, 40);
            WalkLeft.setBounds(40, 700, 80, 40);
            WalkUp.setBounds(220, 700, 80, 40);
            WalkDown.setBounds(310, 700, 80, 40);
            UseItem.setBounds(450, 700, 40, 40);
            
            Frame.add(WalkRight);
            Frame.add(WalkLeft);
            Frame.add(WalkUp);
            Frame.add(WalkDown);
            Frame.add(UseItem);
            Frame.setVisible(true);
            
            GenerateVisualArray();
        }
}
