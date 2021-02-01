package projectSimpleFinancialCalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoanCalc  implements  ActionListener  {

		JLabel 		appLabel, loanLabel, yearsLabel, rateLabel,payLabel,Mpay ;
   		JTextField 	loanField, yearsField, rateField;
   		JButton    	clcBtnLoan, backLBtn, clrLBtn;
    
 private double loan, years, rate, monthly;
 {
	    Font font5 = new Font("SansSerif", Font.BOLD, 20);
	    Font font3 = new Font("SansSerif", Font.BOLD, 10);
	    Font font7 = new Font("SansSerif", Font.BOLD, 12);
	    
	    JLabel Crlabela = new JLabel("@Created by Pascalis Karagiannis 2021");
		Crlabela.setForeground(Color.white);
		Crlabela.setBounds(58,650,250,150); 
		Crlabela.setFont(font3);
		
		JLabel appLabel = new JLabel(" Simple Financial Calculator");		 
        appLabel = new JLabel("SimpleFinancialCalculator");
        appLabel.setBounds(30, -10, 270, 100);
        appLabel.setForeground(Color.red);
        appLabel.setFont(font5);
        // Loan Label
        loanLabel = new JLabel("Enter Loan Amount:");
        loanLabel.setBounds(28, 120, 130, 110);
        loanLabel.setForeground(Color.white);
        loanLabel.setFont(font7);
     
        yearsLabel = new JLabel("Number of Years:");
        yearsLabel.setBounds(20, 180, 130, 110);
        yearsLabel.setForeground(Color.white);
        yearsLabel.setHorizontalAlignment(4);
        yearsLabel.setFont(font7);
        
        rateLabel = new JLabel("Interest Rate:");
        rateLabel .setForeground(Color.white);
        rateLabel.setBounds(64, 240, 130, 110);
        rateLabel.setFont(font7);
        
        JLabel blabel = new JLabel("<html>Equated monthly instalments (EMIs)"
				+ "<br> It is generally an unequal combination"
				+ "<br>of principal and interest payments. </html>");
        
		blabel .setFont(font3);
		blabel.setForeground(Color.white);
		blabel .setBounds(25,330,250,150); 
		
		JLabel backLabel = new JLabel("Back to the MainMenu");
		backLabel  .setForeground(Color.green);
		backLabel .setFont(font3);
		backLabel .setBounds(98,618,250,150); 
  
        payLabel = new JLabel("Monthly Payment:");
        payLabel.setBounds(40, 60, 130, 110);
        payLabel.setForeground(Color.ORANGE);
        
        //PayField==================================================
        
        Mpay = new JLabel("$");
        Mpay.setBounds(170, 50, 130, 130);
        Mpay.setForeground(Color.ORANGE);
        Mpay.setHorizontalAlignment(4);
        Mpay.setFont(font5);
		
        
        // Textfield===================================================
        
        loanField = new AcceptOnlyNr();
        loanField.setBackground(Color.YELLOW);
        loanField.setBounds(162, 150, 150, 48);
        loanField.addActionListener(this);
 
        // Login Textfield
        yearsField = new AcceptOnlyNr();
        yearsField.setBackground(Color.YELLOW);
        yearsField.setBounds(162,210, 50, 48);
        yearsField.addActionListener(this);
           
        //Rate Textfield
        rateField = new AcceptOnlyNr();
        rateField.setBackground(Color.YELLOW);
        rateField.setBounds(162, 270, 50, 48); 
        rateField.addActionListener(this);
        
        // Button =============================================================
        
        clcBtnLoan = new JButton("Calculate");
        clcBtnLoan.setBounds(70, 460, 170, 48); 
        clcBtnLoan.addActionListener(this);
        
        clrLBtn = new JButton("Clear Input Fields");
        clrLBtn.setBounds(70, 520, 170, 48);  
      
        ImageIcon myIconb = new ImageIcon("src/projectSimpleFinancialCalculator/Cyanback.png");
        backLBtn = new JButton("GoBack",myIconb);
        backLBtn.setBounds(70, 605, 170, 72);  
        backLBtn.setBorderPainted(false);
        backLBtn.setOpaque(false);
        
        //LoanFrame
        final JFrame Loanframe = new JFrame();
        
        Loanframe .add(loanLabel);
        Loanframe.add(appLabel );
        Loanframe .add(loanLabel);
        Loanframe .add(yearsLabel);
        Loanframe .add(rateLabel); 
        Loanframe .add(payLabel); 
        Loanframe .add(Crlabela);
      
        Loanframe .add(rateField );
        Loanframe .add(Mpay);
        Loanframe .add(loanField );
        Loanframe .add(yearsField);
    
        Loanframe .add(blabel);
        Loanframe .add(clcBtnLoan);
        Loanframe .add(backLBtn);
        Loanframe .add(clrLBtn);
        Loanframe .add(appLabel);
        Loanframe .add(backLabel );
        Loanframe .setSize(330,770);
        Loanframe .setLocation(30, 30);
        
        Loanframe .setLayout(null);  
        Loanframe .getContentPane().setBackground(Color.BLACK);
        
        Loanframe .setVisible(true);
       
//==================================goBack button==============================
      
    backLBtn.addActionListener(new ActionListener () {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	Loanframe .setVisible(false);
            	new SimpleFinancialCalculator();
            	
            }
       });
    
    clrLBtn.addActionListener(new ActionListener () {
        @Override
		public void actionPerformed(java.awt.event.ActionEvent evt) {

        	yearsField.setText(null);
        	rateField.setText(null);
            loanField.setText(null);
            Mpay.setText  ("0");   
        	
        }
   });
        
    clcBtnLoan.addActionListener(new ActionListener () {
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	if(loanField.getText().equals("") || (yearsField.getText().equals(""))
    	|| ( rateField.getText().equals("")))
    	
    	{JOptionPane.showMessageDialog(null, 
                "Field is Empty please enter", 
                "Warning", 
                JOptionPane.WARNING_MESSAGE);
    	} 
    	
    	
    	else {
    	loan = (Double.parseDouble(loanField.getText()));
    	years = (Double.parseDouble(yearsField.getText()));
    	rate = (Double.parseDouble(rateField.getText()));
    	
    	double mRate = (rate)/1200.0;
    	double months = (years)*12.0;
    	double denom = (Math.pow((1+mRate),months)-1);
    	
    	monthly = (mRate + mRate/denom)*loan;
    	DecimalFormat x = new DecimalFormat("#.##");
    	monthly = Double.valueOf(x.format(monthly));
    	
    	//Mpay.setText("Your Monthly Payment");
        Mpay.setText(monthly + "$" );
    	}
    }
    });
}

//=========================================================//
 
 public static void main(String[] args) {
	 new LoanCalc ();	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}

