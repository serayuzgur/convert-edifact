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

package com.rthinking.convert.edifact.data.interchange.functionalgroup;

/**
 * 8.3.7 Functional Group trailer segment - UNE (See ISO 9735
 * Annex B for detailed specification)
 * In addition to the segment code UNE, this service segment
 * contains two mandatory service data elements.
 * <p/>
 * <p/>
 * A group trailer for a group of 72 messages with a group
 * reference of CD1352, would be transmitted as:
 * UNE+72+CD1352'
 */
public class UNETrailer {

	/**
	 * The first, 'Number of messages' contains a count of the total
	 * number of messages in the functional group.
	 */
	private int count;

	/**
	 * The second, 'Functional group reference' contains the identical
	 * reference to that carried in the same field of the UNG header
	 * segment for the functional group.  Checking the two fields to
	 * be identical ensures that the functional group has been
	 * successfully received.
	 */
	private String groupReference;

}
