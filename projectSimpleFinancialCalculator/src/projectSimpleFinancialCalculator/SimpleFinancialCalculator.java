package projectSimpleFinancialCalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleFinancialCalculator {
	
	SimpleFinancialCalculator( ) {
		
//Build UI
//Frame=========================================================
		final JFrame sfCframe = new JFrame();  
		 sfCframe .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		 sfCframe.getContentPane().setBackground(Color.BLACK);
		 sfCframe.setSize(334,772);  
		 sfCframe.setLocation(10,10);
		 sfCframe .setLayout(null);  
//Labels=========================================================
		 Font font1 = new Font("SansSerif", Font.BOLD, 20);
		 Font font2 = new Font("SansSerif", Font.BOLD, 10);
		 Font font3 = new Font("SansSerif", Font.BOLD, 14);
		 Font font5 = new Font("SansSerif", Font.ITALIC, 12);
		  //
		JLabel introLabel = new JLabel("<html>Calculate final capital from a Time Deposit,"
					+ "<br>see Monthly payment of a Loan,"
					+ "<br>Check your current Liquity situation.</html>");
		introLabel .setForeground(Color.orange);
		introLabel .setBounds(50,70,250,150); 
		introLabel .setFont(font5);
		 //
		JLabel Crlabel = new JLabel("@Created by Pascalis Karagiannis 2021");
		Crlabel.setForeground(Color.white);
		Crlabel.setBounds(68,650,250,150); 
		Crlabel.setFont(font2);
		//
		JLabel appLabel = new JLabel(" Simple Financial Calculator");
		appLabel .setForeground(Color.red);
		appLabel.setFont(font1);
		appLabel .setBounds(17,0,300,80); 		
		//
		JLabel quitLabel = new JLabel("Quit Application");
		quitLabel  .setForeground(Color.green);
		quitLabel .setFont(font3);
		quitLabel .setBounds(98,598,250,150); 	
		//
// Buttons ==========================================================
		
		 //
	     ImageIcon myIcon = new ImageIcon("src/projectSimpleFinancialCalculator/btnpOff.gif");
	     final JButton  btnQuitapp = new JButton("Quit", myIcon);
	     btnQuitapp.setBounds(124, 580, 98, 78);
	     btnQuitapp.setBorderPainted(false);
	     btnQuitapp.setOpaque(false);
	     //
	    JButton  btnCtdepo = new JButton("Time Deposit");
	     btnCtdepo.setBounds(75,220,180, 60); 
	     btnCtdepo.setFont(font3);
	     //
	    JButton  btnLoan = new JButton("Loan EMI ");
	    btnLoan.setBounds(75,300,180, 60);  
	    btnLoan.setBorderPainted(true);
	    btnLoan.setFont(font3);
	    //
	    JButton  btnLR = new JButton("Liquitity Ratio");
	    btnLR.setBounds(75,380,180, 60);  
	    btnLR.setBorderPainted(true);
	    btnLR.setFont(font3);

// addOjects to Frame =====================================================
	     
		 sfCframe.add(Crlabel);  
		 sfCframe .add(btnCtdepo );  
		 sfCframe .add(btnLoan);
		 sfCframe .add(btnLR); 
		 sfCframe .add(appLabel); 
		 sfCframe .add(btnQuitapp); 
		 sfCframe .add(quitLabel); 
		 sfCframe .add( introLabel); 
// Show FInal Start UI ======================================================
		
		 sfCframe.setVisible(true);  
		 
// Actions Button Navigate to other Classes=======================================
		 
	//Exit
	 btnQuitapp.addActionListener(new ActionListener() {
		 @Override
	     public void actionPerformed(ActionEvent e) {
			 System.exit(0);
         
	       }
	});
	//NavigateCplTimDepo
	btnCtdepo.addActionListener(new ActionListener() {
		 @Override
	     public void actionPerformed(ActionEvent e) {
			 sfCframe.setVisible(false);  
			 new CplTimDepo(null);
         
	       }
	});
	//NavLaon
	btnLoan.addActionListener(new ActionListener() {
		 @Override
	     public void actionPerformed(ActionEvent e) {
			 //sfCframe.setVisible(false);  
			 sfCframe.setVisible(false);  
			 new LoanCalc();
        
	       }
	});
	//Nav
	btnLR.addActionListener(new ActionListener() {
		 @Override
	     public void actionPerformed(ActionEvent e) {
			 //sfCframe.setVisible(false);  
			 sfCframe.setVisible(false);  
			 new LiqRatio();
       
	       }
	});
	}
public static void main(String[] args) {
		
   new 	SimpleFinancialCalculator( );
}
}

