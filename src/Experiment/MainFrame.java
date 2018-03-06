package Experiment;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

import java.awt.*;



public class MainFrame extends JFrame {

		
	public static void main(String[] args) {
		
		MainFrame f= new MainFrame();
		
		JPanel panel1= new JPanel();
		JPanel panel2= new JPanel();
		JPanel panel3= new JPanel();
		JPanel panel4= new JPanel();
		JPanel panel5= new JPanel();
				
		f.setVisible(true);
		f.setSize(500, 500);
		f.setResizable(false);
		f.setTitle("GarageApplication");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width=screenSize.width;
		int height=screenSize.height;
		f.setLocation(width/3,height/6 );
		
		f.getContentPane().setBackground(Color.getHSBColor(122, 168, 166));
		f.getRootPane().setBorder(BorderFactory.createMatteBorder(8, 8, 8, 8, Color.ORANGE));
		
		f.add(panel1);
		panel1.setBounds(20, 20, 430, 50);
		panel1.setBackground(Color.orange);
		panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		
		f.add(panel2);
		panel2.setBounds(20, 110, 430, 50);
		panel2.setBackground(Color.cyan);
		panel2.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		
		f.add(panel3);
		panel3.setBounds(20, 200, 430, 50);
		panel3.setBackground(Color.magenta);
		panel3.setBorder(BorderFactory.createRaisedBevelBorder());
		
		f.add(panel4);
		panel4.setBounds(20, 300, 430, 50);
		panel4.setBackground(Color.PINK);
		panel4.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		
		f.add(panel5);
		panel5.setBounds(360, 250, 70, 150);
		panel5.setBackground(null);
		
		
		
		
		
		
		
		
		
		
		

	}

	

}
