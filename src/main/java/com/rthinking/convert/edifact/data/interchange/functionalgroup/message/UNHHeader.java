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
 * 8.3.9 Message header control segment - UNH (See ISO 9735 Annex B
 * for detailed specification)
 * <p/>
 * This segment, used for both data and service messages, has the
 * segment code of UNH.  It contains two mandatory service data
 * elements:
 * <p/>
 * - the message reference number;
 * - the message identifier;
 * <p/>
 * and two conditional data elements for use with progressive
 * message transfers only:
 * <p/>
 * - the common access reference
 * - the status of the transfer
 * <p/>
 * The message reference can be either:
 * <p/>
 * - a program generated reference number starting at 1 for the
 * first message in the interchange, and incremented by 1 for
 * every successive message in the interchange; when the
 * Functional Grouping technique is not being used; or
 * <p/>
 * - when Functional Grouping is being used, a program generated
 * number starting at 1 for the first message in each
 * functional group, and incremented by 1 for every successive
 * message in each functional group; or
 * <p/>
 * - a meaningful reference number provided from the originator's
 * in-house system.
 * <p/>
 * The two techniques of program generated or meaningful reference
 * numbers must not be mixed within an interchange.
 * <p/>
 * The preferred technique should be specified in the Interchange
 * Agreement.  Most live systems use the former techniques, with
 * the numbers being program generated.
 * <p/>
 * The message identifier is a composite data element, having five
 * component data elements:
 * <p/>
 * - the type of message (mandatory)
 * - the version number of the message (mandatory)
 * - the message release number (conditional)*
 * - the controlling agency (conditional)*
 * - the association assigned code (conditional)*
 * <p/>
 * (NOTE: If Functional Grouping (See Section 8.3.6) is not being
 * used, the controlling agency field becomes mandatory in
 * the UNH.  If conditions demand the presence of data in
 * the release number, and/or association assigned code
 * fields, (see Section 7) then these too must be provided
 * in the UNH if Functional Grouping is not being used.
 */
public class UNHHeader {


	/**
	 * This segment, used for both data and service messages, has the
	 * segment code of UNH.  It contains two mandatory service data
	 * elements:
	 * <p/>
	 * - the message reference number;
	 */
	private String messageReference;

	/**
	 * - the message identifier;
	 */
	private String messageID;


	/**
	 * The type of message identifier is of variable length 6
	 * alphanumeric, e.g. INVOIC for invoice messages, or 850 for a
	 * purchase order transaction set (a non-UNSM message).
	 */
	private MessageId messageId;


	/**
	 * and two conditional data elements for use with progressive
	 * message transfers only:
	 * <p/>
	 * - the common access reference
	 */
	private String accessReference;

	/**
	 * - the status of the transfer
	 */
	private String status;


}
