/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Othello;

import javax.swing.*;
import java.awt.*;


/**
 *
 * @author
 */
public class main extends JFrame{
    
    private static JPanel OthelloGame;
    
    public main() {
        super("Othello Game");
        setLayout(new BorderLayout());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        setSize(width/2, height/2);

        // center the jframe on screen
        setLocationRelativeTo(null);
        
        OthelloGame = new OthelloGui();
        add(OthelloGame, BorderLayout.CENTER);
        
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new main();
    }
    
}
