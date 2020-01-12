package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame mFrame = new JFrame();
	JPanel mPanel = new JPanel();
	JButton addNamesButton = new JButton("Add Name");
	JButton viewNamesButton = new JButton("View Names");
	
	ArrayList<String> names = new ArrayList<String>();
	
	String viewNames = "";
	
	void run() {
		mFrame.add(mPanel);
		
		mPanel.add(addNamesButton);
		mPanel.add(viewNamesButton);
		
		mFrame.setVisible(true);
		mFrame.pack();
		
		addNamesButton.addActionListener(this);
		viewNamesButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==addNamesButton) {
			names.add(JOptionPane.showInputDialog("Type in a new name"));
		}
		else {
			for(int i = 0; i < names.size(); i++) {
				viewNames = viewNames+"Guest #"+(i+1)+": "+names.get(i)+"\n";
			}
			JOptionPane.showMessageDialog(null, viewNames);
			viewNames = "";
		}
	}
}
