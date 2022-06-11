package Listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.WindowFrame;
public class ButtonAddListener implements ActionListener {
	WindowFrame frame;
	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getStockadder());
		frame.revalidate();
		frame.repaint();
	}
}