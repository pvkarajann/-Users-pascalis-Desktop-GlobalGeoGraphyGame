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

public class LiqRatio  {
	
	LiqRatio(){
		 
		Font font5 = new Font("SansSerif", Font.BOLD, 20);
		Font font4 = new Font("SansSerif", Font.BOLD, 15);
		Font font3 = new Font("SansSerif", Font.BOLD, 10);
		//
		final JFrame  LiqRatioframe = new JFrame();  
		LiqRatioframe  .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		LiqRatioframe  .getContentPane().setBackground(Color.BLACK);
		LiqRatioframe  .setSize(330,770);  
		LiqRatioframe  .setLocation(30, 30);
		LiqRatioframe  .setLayout(null);  
		
		//
		JLabel appLabel = new JLabel(" Simple Financial Calculator");
		appLabel .setForeground(Color.yellow);
		appLabel.setFont(font5);
		appLabel .setBounds(10,0,290,70); 		
		//
		JLabel LiqRtoLabel = new JLabel("Liquitity Ratio%:");
		 LiqRtoLabel.setBounds(40, 90, 130, 110);
		 LiqRtoLabel .setForeground(Color.ORANGE);
		 //
		 JLabel Crlabelb = new JLabel("@Created by Pascalis Karagiannis 2021");
		 Crlabelb.setForeground(Color.white);
		 Crlabelb.setBounds(58,650,250,150); 
		 Crlabelb.setFont(font3);
		//
		final JLabel lqResult = new JLabel("0");
		lqResult .setHorizontalAlignment(SwingConstants.CENTER);
		lqResult .setBounds(155,65,250,150); 
		lqResult .setForeground(Color.red);
		lqResult .setFont(font5);
		//
		JLabel label = new JLabel("<html>Calculate Liquidity Ratio"
				+ "<br>The ratio indicates the overall health of one's finances"
				+ "<br>The value of this ratio should ideally be above one</html>");
		
		//
		label.setBounds(15,250,350,220); 
		label .setForeground(Color.white);
		label .setFont(font3);
		//
		final  AcceptOnlyNr  inTotlLiqAssets =  new AcceptOnlyNr  ();
		inTotlLiqAssets .setHorizontalAlignment(SwingConstants.CENTER);
		inTotlLiqAssets .setBounds(152,190, 150, 48);  
		inTotlLiqAssets .setBackground(Color.YELLOW);
         //
        final AcceptOnlyNr  inTotlCurrDepth  = new AcceptOnlyNr ();
        inTotlCurrDepth.setHorizontalAlignment(SwingConstants.CENTER);
        inTotlCurrDepth.setBounds(152,250, 150, 48);  
        inTotlCurrDepth.setBackground(Color.YELLOW);
        inTotlCurrDepth.setFont(font4);
        //Buttons
        final JButton  CalcBtn = new  JButton("Calaculate");
		CalcBtn.setBounds(82,470,150, 50);  
		CalcBtn.setBorderPainted(true);
		//
		 final JButton  ClearBtn= new  JButton("Clear All");
		 ClearBtn.setBounds(82,530,150, 50);  
		 ClearBtn.setBorderPainted(true);
		 
		 ImageIcon myIconb = new ImageIcon("src/projectSimpleFinancialCalculator/Cyanback.png");
		 final JButton  BackBtn= new  JButton("Go Back",myIconb);
		 BackBtn.setBounds(102,600,100, 70);
		 BackBtn.setBackground(Color.cyan);
		 BackBtn.setBorderPainted(false);
		
        //ADD
		 LiqRatioframe .add(inTotlLiqAssets);  
		 LiqRatioframe .add(inTotlCurrDepth);  
		 LiqRatioframe .add(CalcBtn);  
		 LiqRatioframe .add(BackBtn);  
		 LiqRatioframe .add(ClearBtn); 
		 LiqRatioframe .add(label);  
		 LiqRatioframe .add(lqResult);  
		 LiqRatioframe .add(	Crlabelb); 
		 LiqRatioframe .add(	appLabel); 
		 LiqRatioframe .add(LiqRtoLabel ); 
		//FinalView
		 LiqRatioframe  .setVisible(true); 
		
//ACTION BUTTON============================================
		
		CalcBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	 double LIqAssts;
            	 double CurDept;
            	 double LQresult;
            	
            	 LIqAssts = Double.parseDouble(inTotlLiqAssets .getText());
            	 CurDept = Double.parseDouble(inTotlCurrDepth.getText());
            	
            	 DecimalFormat x = new DecimalFormat("#.##");
            	
            	 LQresult = (double) (CurDept)/( LIqAssts ) ;
            	 x.format(LQresult);
            	
                 String s = Double.toString(LQresult);
               
                 lqResult .setText(s);   
            }
  });
		
//BackBtn====================================================
		
		 ClearBtn.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		            	
		            	inTotlLiqAssets.setText(null);
		            	inTotlCurrDepth.setText(null);
		            
		                lqResult .setText  ("0");   
		            }
		});
				
//BackBtn==========================================
				
		BackBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	inTotlLiqAssets.setText(null);
            	inTotlCurrDepth.setText(null);
      
            	 lqResult .setText  ("0");    
            	 LiqRatioframe.setVisible(false);
                new SimpleFinancialCalculator();   
            }
});		
}

	public static void main(String[] args) {
		
		new LiqRatio();
		
	}

}