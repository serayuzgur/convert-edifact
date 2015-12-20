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

package com.rthinking.convert.edifact.data.interchange.functionalgroup.message;

/**
 * 8.3.10 Message trailer control segment - UNT (See ISO 9735
 * Annex B for detailed specification)
 * <p/>
 * In addition to the segment code UNT, this segment contains two
 * mandatory service data elements.
 */
public class UNTTrailer {
	/**
	 * The first, 'Number of segments in a message' contains a count of
	 * the total number of segments in the message, including the UNH
	 * and UNT segments.
	 */
	private int count;

	/**
	 * The second, 'Message Reference Number' contains the identical
	 * reference to that carried in the same field of the UNH message
	 * header segment for the same message.
	 */
	private String messageReference;
}
