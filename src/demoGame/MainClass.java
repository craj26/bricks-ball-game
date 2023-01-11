/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoGame;
import javax.swing.JFrame;
/**
 *
 * @author arpit jain
 */
public class MainClass {
    public static void main(String[] args) {
		JFrame frame = new JFrame();
		Gameplay gamePlay = new Gameplay();
		
		frame.setBounds(200,100, 700, 600);
		frame.setTitle("Breakout Ball");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(gamePlay);
		frame.setVisible(true);

	}

    
}
