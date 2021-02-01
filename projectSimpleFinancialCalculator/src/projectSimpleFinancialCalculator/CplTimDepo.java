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
import javax.swing.SwingConstants;

public class CplTimDepo  {
	
	CplTimDepo(String title){
		 
		Font font5 = new Font("SansSerif", Font.BOLD, 20);
		Font font4 = new Font("SansSerif", Font.BOLD, 12);
		Font font3 = new Font("SansSerif", Font.BOLD, 10);
		
		final JFrame  cTimDepoframe = new JFrame();  
		cTimDepoframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		cTimDepoframe .getContentPane().setBackground(Color.BLACK);
		cTimDepoframe .setSize(330,770);  
		cTimDepoframe .setLocation(30, 30);
		cTimDepoframe .setLayout(null);  
	    //
		JLabel Crlabelc = new JLabel("@Created by Pascalis Karagiannis 2021");
		 Crlabelc.setForeground(Color.white);
		 Crlabelc.setBounds(58,650,250,150); 
		 Crlabelc.setFont(font3);
		 //
		 JLabel cptLabel = new JLabel("Enter Start Capital:");
		 cptLabel .setBounds(25, 120, 130, 110);
		 cptLabel .setForeground(Color.white);
		 cptLabel .setFont(font4);
		 //
		 JLabel RteLabel = new JLabel("Enter Rate:");
		 RteLabel  .setBounds(70, 177, 130, 110);
		 RteLabel .setForeground(Color.white);
		 RteLabel  .setFont(font4);
		 //
		 JLabel daysLabel = new JLabel("Enter days:");
		 daysLabel   .setBounds(70, 240, 130, 110);
		 daysLabel  .setForeground(Color.white);
		 daysLabel  .setFont(font4);
		 //
		final JLabel result = new JLabel("$");
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setForeground(Color.white);
		result.setBounds(175,50,250,150); 
		result.setForeground(Color.orange);
		result.setFont(font5);
		//
		JLabel appLabel = new JLabel(" Simple Financial Calculator");
		appLabel .setForeground(Color.red);
		appLabel.setFont(font5);
		appLabel .setBounds(10,5,290,70); 	
		//
		JLabel alabel = new JLabel("<html>A time deposit "
				+ "<br>is an interest-bearing bank account "
				+ "<br>that has a pre-set date of maturity</html>");
		alabel .setFont(font3);
		alabel.setForeground(Color.white);
		alabel .setBounds(25,300,250,150); 
		//
		final  AcceptOnlyNr   inputA =  new AcceptOnlyNr  ();
        inputA.setHorizontalAlignment(SwingConstants.CENTER);
        inputA.setBounds(152,150, 160, 48);  
        inputA.setBackground(Color.YELLOW);
         
        final AcceptOnlyNr   inputB   = new AcceptOnlyNr ();
        inputB.setHorizontalAlignment(SwingConstants.CENTER);
        inputB.setBounds(152,210, 90, 48);  
        inputB.setBackground(Color.YELLOW);
        inputB.setFont(font3);
    
        final AcceptOnlyNr inputC = new AcceptOnlyNr ();
        inputC.setHorizontalAlignment(SwingConstants.CENTER);
        inputC.setBounds(152,270, 90, 48);  
        inputC.setBackground(Color.YELLOW);
        inputC.setFont(font4);
        
        //Buttons
        final JButton  CalcBtn = new  JButton("Calaculate");
		CalcBtn.setBounds(82,450,150, 50);  
		CalcBtn.setBorderPainted(true);
		
		 final JButton  ClearBtn= new  JButton("Clear All");
		 ClearBtn.setBounds(82,520,150, 50);  
		 ClearBtn.setBorderPainted(true);
		 
		 ImageIcon myIconb = new ImageIcon("src/projectSimpleFinancialCalculator/Cyanback.png");
		 final JButton  BackBtn= new  JButton("Go Back",myIconb);
		 BackBtn.setBounds(98,598,100, 70);
		 BackBtn.setBackground(Color.cyan);
		 BackBtn.setBorderPainted(false);
		
        //ADD
        cTimDepoframe.add( inputA);  
        cTimDepoframe.add( inputB);  
        cTimDepoframe.add( inputC);  
        cTimDepoframe.add(CalcBtn);  
        cTimDepoframe.add(BackBtn);  
        cTimDepoframe.add(ClearBtn); 
        cTimDepoframe.add(alabel);
        cTimDepoframe.add(Crlabelc);
		cTimDepoframe.add(result);  
		cTimDepoframe.add(appLabel); 
		cTimDepoframe.add(cptLabel); 
		cTimDepoframe.add(RteLabel);  
		cTimDepoframe.add(daysLabel);  
		
		//FinalView
		cTimDepoframe .setVisible(true); 
		
//ACTION BUTTON============================================
		
CalcBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	 double startCapital;
            	 double rate;
            	 int days;
            	 double Sresult;
            	
            	 startCapital = Double.parseDouble(inputA.getText());
            	 rate = Double.parseDouble(inputB.getText())/100;
            	 days = Integer.parseInt(inputC.getText());
            	 DecimalFormat x = new DecimalFormat("#.##");
            	
            	 Sresult = (double)(startCapital) * (rate/365)*(int)(days);
            	 x.format(Sresult);
            	
                 String s = Double.toString(Sresult);
               
                 result.setText(s);   
            }
  });
		
//BackBtn
ClearBtn.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		            	
		            	inputA.setText(null);
		                inputB.setText(null);
		                inputC.setText(null);
		                result.setText  ("0");   
		            }
		});
				
		//BackBtn==========================================
				
BackBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	inputA.setText(null);
                inputB.setText(null);
                inputC.setText(null);
                result.setText  ("0");    
                cTimDepoframe .setVisible(false);
                new SimpleFinancialCalculator();   
            }
});		
}

	public static void main(String[] args) {
		
		new CplTimDepo(null);
		
	}

}
