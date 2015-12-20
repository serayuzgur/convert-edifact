/*
 * Copyright (C) 2015  Seray Uzgur
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.rthinking.convert.edifact.data.interchange.functionalgroup.message;

/**
 * The message identifier is a composite data element, having five
 * component data elements:
 * <p/>
 * - the type of message (mandatory)
 * - the version number of the message (mandatory)
 * - the message release number (conditional)*
 * - the controlling agency (conditional)*
 * - the association assigned code (conditional)*
 * * (NOTE: If Functional Grouping (See Section 8.3.6) is not being
 * used, the controlling agency field becomes mandatory in
 * the UNH.  If conditions demand the presence of data in
 * the release number, and/or association assigned code
 * fields, (see Section 7) then these too must be provided
 * in the UNH if Functional Grouping is not being used.
 */
public class MessageId {


	/**
	 * The type of message identifier is of variable length 6
	 * alphanumeric, e.g. INVOIC for invoice messages, or 850 for a
	 * purchase order transaction set (a non-UNSM message).
	 */
	private String type;


	/**
	 * The version and release numbers associated with the type of
	 * message are both variable length, 3 numeric.  The rules
	 * for the control of version and release numbers are explained in
	 * Section 7.
	 */
	private String version;

	/**
	 * The version and release numbers associated with the type of
	 * message are both variable length, 3 numeric.  The rules
	 * for the control of version and release numbers are explained in
	 * Section 7.
	 */
	private String releaseNumber;


	private String agency;


	private String assignedCode;


}

