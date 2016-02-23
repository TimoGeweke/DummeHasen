package hasen;

import static hasen.Main.*;
import static hasen.BunnyAPI.*;
import java.awt.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class BaseFrame {
    
    static JFrame Frame = new JFrame(" ");
    static JButton WalkRight = new JButton("RIGHT");
    static JButton WalkLeft = new JButton("LEFT");
    static JButton WalkUp = new JButton("UP");
    static JButton WalkDown = new JButton("DOWN");
    static JButton UseItem = new JButton("ITEM");
     
    
    public static void GenerateFrame() {
        
    
        Frame.setSize(800, 800);
        Frame.setLayout(null);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        WalkLeft.setBounds(40, 700, 80, 40);
        WalkLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MoveLeft();
            }  
        }); 
        WalkRight.setBounds(130, 700, 80, 40);
        WalkRight.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                MoveRight();
            } 
        });
        WalkUp.setBounds(220, 700, 80, 40);
        WalkUp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                MoveUp();
            } 
        });
        WalkDown.setBounds(310, 700, 80, 40);
        WalkDown.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                MoveDown();
            } 
        });
        UseItem.setBounds(450, 700, 40, 40);
        UseItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            } 
        });
        
        Frame.add(WalkRight);
        Frame.add(WalkLeft);
        Frame.add(WalkUp);
        Frame.add(WalkDown);
        Frame.add(UseItem);
        Frame.setVisible(true);
                
    }
    
    
    public static void GenerateVisualArray() {
        
        int XCoordinate = 20;
        int YCoordinate = 20;
        
        for(int i=0; i<Spielfeld.length; i++) {
            for(int x = 0; x<Spielfeld.length; x++) {
                addText(Spielfeld[i][x], XCoordinate, YCoordinate, 20, 20 );
                XCoordinate = XCoordinate + 20;
            }
            YCoordinate = YCoordinate + 20;
            XCoordinate = 20;
        }
    }

    private static void addText(String Spielfeld, int XCoordinate, int YCoordinate, int w, int h) {
        JLabel label = new JLabel(Spielfeld);
        Frame.add(label);
        label.setBounds(XCoordinate, YCoordinate, w, h);
    }
}
