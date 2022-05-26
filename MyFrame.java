package gui;
import javax.swing.*;  
import java.awt.*;

public class MyFrame extends JFrame {
	
	public static void main(String[] args) {
		
		MyFrame gui = new MyFrame();
		gui.play();
	}
	
	public void play() {
		JFrame frame = new JFrame("My Frame");
		JTextArea jta = new JTextArea();
		JLabel jl = new JLabel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String A = "Welcome to pizza. Choose the type of pizza.";
		
		JPanel panel = new JPanel();
		
        JLabel north = new JLabel("\t" + A);
		JButton centerOne = new JButton("Combination Pizza");
		JButton centerTwo = new JButton("Potato Pizza");
		JButton centerThree = new JButton("Roasted meat Pizza");
		JLabel centerFour = new JLabel("Count");
		JTextArea centerFive = new JTextArea("\t");
		

		
		panel.add(centerOne);
		panel.add(centerTwo);
		panel.add(centerThree);
		panel.add(centerFour);
		panel.add(centerFive);
		
		frame.getContentPane().add(BorderLayout.NORTH, north);
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.setSize(800, 150);
		frame.setVisible(true);
	}
	
	

}
