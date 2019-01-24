

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.struts.*;

public class TestLogic4 {
	Calculation c = new Calculation();
	
	
	@Test
	public void npAlwaysNullCORRECT(){
		
		assertEquals(1,Calculation.npAlwaysNullCORRECT());		
	}
	
	@Test
	public void demo(){
		
		assertEquals(1,c.demo());		
	}
}
