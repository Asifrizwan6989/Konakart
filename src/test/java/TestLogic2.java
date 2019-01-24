

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.struts.*;

public class TestLogic2 {
	Calculation c = new Calculation();
	
	
	@Test
	public void bcImpossibleCastCORRECT(){
		
		assertEquals(1,Calculation.bcImpossibleCastCORRECT());		
	}
	
	@Test
	public void bcImpossibleDowncastCORRECT(){
		
		assertEquals(1,Calculation.bcImpossibleDowncastCORRECT());
	}
	
	@Test
	public void bcImpossibleInstanceOfCORRECT(){
		
		assertEquals(1,Calculation.bcImpossibleInstanceOfCORRECT());
	}
	
	@Test
	public void bcImpossibleDowncastOfArrayCORRECT(){
		
		assertEquals(1,Calculation.bcImpossibleDowncastOfArrayCORRECT());
	}
	
	
}
