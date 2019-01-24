

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.struts.*;

public class TestLogic3 {
	Calculation c = new Calculation();
	
	
	@Test
	public void dmiBigDecimalConstructedFromDoubleCORRECT(){
		
		assertEquals(1,Calculation.dmiBigDecimalConstructedFromDoubleCORRECT());		
	}
	
	@Test
	public void esComparingStringsWithEqCORRECT(){
		
		assertEquals(1,Calculation.esComparingStringsWithEqCORRECT());
	}
	
	@Test
	public void vaFormatStringIllegalCORRECT(){
		
		assertEquals(1,Calculation.vaFormatStringIllegalCORRECT());
	}
	
	@Test
	public void rvReturnValueIgnoredCORRECT(){
		
		assertEquals(1,Calculation.rvReturnValueIgnoredCORRECT());
	}
	
	
}
