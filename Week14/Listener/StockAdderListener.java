package Listener;

import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import manager.StockManager;
import manager.AerospaceStock;
import manager.Stock;
import manager.StockInput;

public class StockAdderListener implements ActionListener {
	
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldData;
	
    StockManager stockManager;

	public StockAdderListener(JTextField fieldID, JTextField fieldName, JTextField fieldData, StockManager stockManager) {
		super();
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldData = fieldData;
		this.stockManager = stockManager;
	}

	public void actionPerformed(ActionEvent e) {	
		StockInput stock = new AerospaceStock();
		stock.setID(fieldID.getText());
		stock.setName(fieldName.getText());
		stock.setData(fieldData.getText());
		stockManager.addManager(stock);
		putObject(stockManager, "studentmanager.ser");
		stock.printInfo();
	}
	
	public static void putObject(StockManager stockManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(stockManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
