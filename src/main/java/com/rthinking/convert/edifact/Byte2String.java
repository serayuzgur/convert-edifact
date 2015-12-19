package com.rthinking.convert.edifact;

import java.io.UnsupportedEncodingException;


/**
 * Created by serayuzgur on 18/12/15.
 */
public class Byte2String {

	private static String DEFAULT_CHARSET = "UTF-8";


	public static String toString(byte[] byteArr, int start, int len) {
		byte[] buffer = new byte[len];
		for (int i = 0; i < len; i++) {
			buffer[i] = byteArr[start++];
		}

		try {
			return new String(buffer, DEFAULT_CHARSET);
		} catch (UnsupportedEncodingException e) {
			//No Chance for that.
			e.printStackTrace();
			return null;
		}

	}
}
