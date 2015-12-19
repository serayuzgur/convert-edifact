package com.rthinking.convert.edifact;

import org.junit.Test;

/**
 * Created by serayuzgur on 18/12/15.
 */
public class Byte2StringTest {

	@Test
	public void testToString() throws Exception {

		byte[] arr = new byte[1024];
		arr[0] = 'U';
		arr[1] = 'N';
		arr[2] = 'B';
		String output = Byte2String.toString(arr,0,3);
		assert "UNBHeader".equals(output);

		arr[3] = 'U';
		arr[4] = 'N';
		arr[5] = 'A';
		output = Byte2String.toString(arr,3,3);
		assert "UNA".equals(output);

	}
}