package projectSimpleFinancialCalculator;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class AcceptOnlyNr extends JTextField {

	  private static final long serialVersionUID = 1L;
	    @Override
	    public void processKeyEvent(KeyEvent ev) {
	        if (Character.isDigit (ev.getKeyChar())) {
	            super.processKeyEvent(ev);
	        }
	        ev.consume();
	        
	     return;
	    }


public Long getNumber() {
    Long aresult = null;
    String text = getText();
    if (text != null && !"".equals(text)) {
        aresult = Long.valueOf(text);
    }
    
    return aresult;
}
}