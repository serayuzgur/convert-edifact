package com.rthinking.convert.edifact;

import com.rthinking.convert.edifact.data.UNA;
import org.junit.Test;

/**
 * Created by serayuzgur on 18/12/15.
 */
public class UNATest {

	@Test
	public void constructorTest() {
		byte[] buffer = new byte[]{
				':', '+', '.', '?', 39/*'*/
		};
		UNA separators = new UNA(buffer[0], buffer[1], buffer[2], buffer[3], buffer[4]);

		assert separators.getDataElement() == ':';
		assert separators.getComponentDataElement() == '+';
		assert separators.getRepetition() == '.';
		assert separators.getSegment() == '?';
		assert separators.getRelease() == 39;

		buffer = new byte[]{
				'2',':', '+', '.', '?', 39/*'*/, '3'
		};
		separators = new UNA(buffer[1], buffer[2], buffer[3], buffer[4], buffer[5]);

		assert separators.getDataElement() == ':';
		assert separators.getComponentDataElement() == '+';
		assert separators.getRepetition() == '.';
		assert separators.getSegment() == '?';
		assert separators.getRelease() == 39;

	}

}