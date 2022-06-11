package gui;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import manager.StockInput;
import manager.StockManager;
public class StockViewer extends JPanel {
	WindowFrame frame;
	StockManager stockManager;
	
	public StockManager getStockManager() {
		return stockManager;
	}
	
	public void setStockManager(StockManager stockManager) {
		this.stockManager = stockManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Data");
		
		for(int i = 0; i < stockManager.size(); i++) {
			Vector row = new Vector();
			StockInput si = stockManager.get(i);
			row.add(si.getID());
			row.add(si.getName());
			row.add(si.getData());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
	
	public StockViewer(WindowFrame frame, StockManager stockManager) {
		this.frame = frame;
		this.stockManager = stockManager;
		
		System.out.println("***" + stockManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("ID");
		model.addColumn("Data");
		
		for(int i=0; i< stockManager.size(); i++) {
			Vector<Object> row = new Vector();
			StockInput si = stockManager.get(i);
			row.add(si.getName());
			row.add(si.getID());
			row.add(si.getData());
			model.addRow(row);
		}
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		this.add(sp);
	}
}