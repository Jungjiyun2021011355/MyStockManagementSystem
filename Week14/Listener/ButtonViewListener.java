package Listener;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.io.*;

import gui.StockViewer;
import gui.WindowFrame;
import manager.StockManager;
public class ButtonViewListener implements ActionListener {
	WindowFrame frame;
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	public void actionPerformed(ActionEvent e) {
		StockViewer stockViewer = frame.getStockviewer();
		StockManager stockManager = getObject("studentmanager.ser");
		stockViewer.setStockManager(stockManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(stockViewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static StockManager getObject(String filename) {
		StockManager stockManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			stockManager = (StockManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return stockManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stockManager;
	}
}