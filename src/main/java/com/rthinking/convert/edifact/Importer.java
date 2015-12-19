package com.rthinking.convert.edifact;

import com.rthinking.convert.edifact.data.UNA;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by serayuzgur on 18/12/15.
 *
 *         Service String Advice     UNA  Optional
 +----- Interchange Header        UNBHeader  Mandatory
 | +---   Functional Group Header   UNG  Conditional
 | | +-     Message Header            UNH  Mandatory
 | | |        User Data Segments             As required
 | | +-     Message Trailer           UNT  Mandatory
 | +---   Functional Group Trailer  UNE  Conditional
 +----- Interchange Trailer       UNZTrailer  Mandatory
 */
public class Importer {


	public Map<String, Object> read(InputStream is) {

		byte[] buffer = new byte[1024];

		try {
			while (is.available() > 0) {

				// Get Type UNBHeader or UNA
				is.read(buffer, 0, 3);
				String type = Byte2String.toString(buffer, 0, 3);

				if (!"UNB".equals(type) && !"UNA".equals(type)) {
					new InvalidDocumentType("Document is not an edifact.It should be UNBHeader or UNA . Current type is : " + type);
				}
				UNA separators;
				if ("UNA".equals(type)) {
					is.read(buffer, 0, 6);
					separators = new UNA(buffer[0], buffer[1], buffer[2], buffer[3], buffer[5]);
				} else
					separators = new UNA();
//				ISO 9735 syntax rules specify the comma as the default; version 4 states that the decimal mark position in the UNA segment is to be ignored a


			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new HashMap<String, Object>();
	}
}
