/*
    Copyright (C) 2015  Seray Uzgur

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.rthinking.convert.edifact.data.interchange;

/**
 * http://www.unece.org/trade/untdid/texts/d423.htm
 * 8.3.4 Interchange control trailer segment - UNZ (See ISO 9735
 * Annex B for detailed specification
 * In addition to the segment code UNZ, this control segment
 * contains two mandatory service data elements.
 * A UNZ segment which indicates a transmission with an interchange
 * control reference of A143, containing 7 functional groups, would
 * be transmitted as:  UNZ+7+A143'
 * For a transmission with the same reference where functional
 * grouping has not been used, and which contains 2500 messages,
 * the UNZ segment would be transmitted as:  UNZ+2500+A143'
 */
public class UNZTrailer {

	/**
	 * The first, the
	 * interchange control count, contains either a count of the number
	 * of messages in the interchange, or a count of the number of
	 * functional groups in the interchange if that facility has been
	 * used (see Section 8.3.5).
	 * <p/>
	 */
	private int count;

	/**
	 * The second data element, the interchange control reference,
	 * contains the identical reference to that carried in the same
	 * field of the UNB interchange header segment for the same
	 * interchange. Checking that the two fields are identical ensures
	 * that the set of interchange data has been successfully received.
	 */
	private String senderReference;

}
