package gui;
import javax.swing.JFrame;  
import javax.swing.JPanel;
import manager.StockManager;

public class WindowFrame extends JFrame{
	
	StockManager stockManager;
	MenuSelection menuselection;
	StockAdder stockadder;
	StockViewer stockviewer;
	
	public WindowFrame(StockManager stockManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.stockManager = stockManager;
		menuselection = new MenuSelection(this);
		stockadder = new StockAdder(this, this.stockManager);
		stockviewer = new StockViewer(this, this.stockManager);
		
		this.add(menuselection);
		this.setVisible(true);
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}
	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}
	public StockAdder getStockadder() {
		return stockadder;
	}
	public void setStockadder(StockAdder stockadder) {
		this.stockadder = stockadder;
	}
	public StockViewer getStockviewer() {
		return stockviewer;
	}
	public void setStockviewer(StockViewer stockviewer) {
		this.stockviewer = stockviewer;
	}
}