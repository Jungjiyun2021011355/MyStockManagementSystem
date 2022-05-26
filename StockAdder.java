package gui;
import java.awt.Label;
import javax.swing.*;

public class StockAdder extends JFrame {
	public StockAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
			
		JLabel labelData = new JLabel("Data: ", JLabel.TRAILING);
		JTextField fieldData = new JTextField(10);
		labelData.setLabelFor(fieldData);
		panel.add(labelData);
		panel.add(fieldData);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancle"));
		
		SpringUtilities.makeCompactGrid(panel, 3, 2, 6, 6, 6, 6);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		
		this.setContentPane(panel);
		this.setVisible(true);	
	}
}
