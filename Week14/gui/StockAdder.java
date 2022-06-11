package gui;
import javax.swing.JButton;  
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import Listener.StockAdderCancelListener;
import Listener.StockAdderListener;
import manager.StockManager;
public class StockAdder extends JPanel {
	WindowFrame frame;
	StockManager stockmanager;
	public StockAdder (WindowFrame frame, StockManager stockManager) {
		this.frame = frame;
		this.stockmanager = stockManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("Name", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelID = new JLabel("ID", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelData = new JLabel("Data", JLabel.TRAILING);
		JTextField fieldData = new JTextField(10);
		labelData.setLabelFor(fieldData);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new StockAdderListener(fieldID, fieldName, fieldData, stockManager));
		
		JButton cancelButton = new JButton("cancel");

		panel.add(labelData);
		panel.add(fieldData);
		
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		this.add(panel);
		this.setVisible(true);
	}
}