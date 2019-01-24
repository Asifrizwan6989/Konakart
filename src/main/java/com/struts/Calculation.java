package com.struts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class Calculation {

	public int findMax(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}

		return max;
	}

	public int calculateString(String b) {
		int count = 0;
		String a[] = new String[] { "amit", "anant", "arpit", "amit" };
		for (int i = 0; i < a.length; i++) {
			if (b.equals(a[i])) {
				count = count + 1;

			}

		}
		System.out.println("count = " + count);
		return count;

	}
	
	public int demo() {
		int hello =1;
		int hi = 0;
		int x = 0;
		int y = 0;
		if(x==y)
		System.out.println("hello");

		return hello;
	}

	/*private static void int bcImpossibleCastWRONG() {
		final Object doubleValue = Double.valueOf(1.0);
		final Long value = (Long) doubleValue;
		System.out.println("   - " + value);
		return 1;
	}*/

	/*private*/ public static /*void*/ int bcImpossibleCastCORRECT() {
		final Object doubleValue = Double.valueOf(1.0);
		final Double value = (Double) doubleValue;
		System.out.println("   - " + value);
		return 1;
	}

	/*private static void bcImpossibleDowncastWRONG() {
		final Object exception = new RuntimeException("abc");
		final SecurityException value = (SecurityException) exception;
		System.out.println("   - " + value.getMessage());
	}*/

	public static int bcImpossibleDowncastCORRECT() {
		final Object exception = new RuntimeException("abc");
		final RuntimeException value = (RuntimeException) exception;
		System.out.println("   - " + value.getMessage());
		return 1;
	}

	/*private static void bcImpossibleInstanceOfWRONG() {
		final Object value = Double.valueOf(1.0);
		System.out.println("   - " + (value instanceof Long));
	}*/

	public static int bcImpossibleInstanceOfCORRECT() {
		final Object value = Double.valueOf(1.0);
		System.out.println("   - " + (value instanceof Double));
		return 1;
	}

	/*private static void bcImpossibleDowncastOfArrayWRONG() {
		final Collection<String> stringVector = new ArrayList<String>();
		stringVector.add("abc");
		stringVector.add("xyz");
		final String[] stringArray = (String[]) stringVector.toArray();
		System.out.println("   - " + stringArray.length);
	}*/

	public static int bcImpossibleDowncastOfArrayCORRECT() {
		final Collection<String> stringVector = new ArrayList<String>();
		stringVector.add("abc");
		stringVector.add("xyz");
		final String[] stringArray = stringVector
				.toArray(new String[stringVector.size()]);
		System.out.println("   - " + stringArray.length);
		return 1;
	}

	/*private static void dmiBigDecimalConstructedFromDoubleWRONG() {
		final BigDecimal bigDecimal = new BigDecimal(3.1);
		System.out.println("   - " + bigDecimal.toString());
	}*/

	public static int dmiBigDecimalConstructedFromDoubleCORRECT() {
		final BigDecimal bigDecimal = new BigDecimal("3.1");
		System.out.println("   - " + bigDecimal.toString());
		return 1;
	}

	/*private static void esComparingStringsWithEqWRONG() {
		final StringBuilder sb1 = new StringBuilder("1234");
		final StringBuilder sb2 = new StringBuilder("1234");
		final String string1 = sb1.toString();
		final String string2 = sb2.toString();
		System.out.println("   - " + (string1 == string2));
	}*/

	public static int esComparingStringsWithEqCORRECT() {
		final StringBuilder sb1 = new StringBuilder("1234");
		final StringBuilder sb2 = new StringBuilder("1234");
		final String string1 = sb1.toString();
		final String string2 = sb2.toString();
		System.out.println("   - " + string1.equals(string2));
		return 1;
	}

	/*private static void vaFormatStringIllegalWRONG() {
		System.out.println(String.format("   - %>s  %s", "10", "9"));
	}*/

	public static int vaFormatStringIllegalCORRECT() {
		System.out.println(String.format("   - %s > %s", "10", "9"));
		return 1;
	}

	/*private static void rvReturnValueIgnoredWRONG() {
		final BigDecimal bigDecimal = BigDecimal.ONE;
		bigDecimal.add(BigDecimal.ONE);
		System.out.println(String.format("   - " + bigDecimal));
	}*/

	public static int rvReturnValueIgnoredCORRECT() {
		final BigDecimal bigDecimal = BigDecimal.ONE;
		final BigDecimal newValue = bigDecimal.add(BigDecimal.ONE);
		System.out.println(String.format("   - " + newValue));
		return 1;
	}

	/*private static void npAlwaysNullWRONG() {
		final String value = null;
		if (null != value & value.length() > 2) {
			System.out.println(String.format("   - " + value));
		} else {
			System.out.println(String.format("   - value is invalid"));
		}
	}*/

	public static int npAlwaysNullCORRECT() {
		final String value = null;
		if (null != value && value.length() > 2) {
			System.out.println(String.format("   - " + value));
		} else {
			System.out.println(String.format("   - value is invalid"));
		}
		return 1;
	}

	/*private static void qabQuestionableBooleanAssignmentWRONG() {
		boolean value = false;
		if (value = true) {
			System.out.println(String.format("   - value is true"));
		} else {
			System.out.println(String.format("   - value is false"));
		}
	}*/

}
