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
 * Interchange control header segment
 * http://www.unece.org/trade/untdid/texts/d423.htm
 * title 8.3.3
 * For Ex. : UNB+UNOA:1+123:AB:PO168+3572:DN:B1342+771206:121500+A143+B26AZ+DELINS+X+1+CANDE+1'
 */
public class UNBHeader {
	/**
	 * UNOA:1
	 * identifies version 1, level A of the syntax rules
	 * and Controlling Agency UNO.  (For level B, the
	 * field would contain UNOB:1).
	 * The purpose of the version number is to allow for
	 * maintenance of the standard.  Each future amendment,
	 * or groups of amendments to the syntax, will cause the
	 * version number to be incremented by 1.
	 */
	private String version;//

	/**
	 * 123:AB:PO168 identifies the sender of the transmission in code
	 * with a qualifier of AB to identify the code set being
	 * used, followed by a code representing a reverse routing
	 * address to which the recipient should address any reply.
	 */
	private String sender;

	/**
	 * 3572:DN:B1342 identifies the recipient of the transmission in
	 * code (qualified by DN), plus a sub-address code. The
	 * sub-address code for onward routing may be used if the
	 * functional grouping facility, (which also provides for
	 * sub-addressing), is not used.
	 */
	private String recipient;
	/**
	 * 771206:1215  771206 is the date and 1215 is the time of the
	 * preparation of the transmission. This is the
	 * date/time that the interchange is assembled for
	 * transmission.
	 */
	private String assembleTime;

	/**
	 * A143   is the unique interchange control reference for this
	 * transmission, allocated by the sender of the interchange.
	 */
	private String senderReference;
	/**
	 * B26AZ  is recipient's reference, or a password. (This
	 * can be accompanied by a qualifier component
	 * element, if so specified in the Interchange
	 * Agreement) the field is left blank if not used
	 */
	private String recipientReference;
	/**
	 * DELINS is an example of an application reference.
	 * A common usage of this field is to keep all
	 * messages of the same type within one unique
	 * transmission, and to carry the appropriate
	 * message identifier in this field. Such usage
	 * allows a transmission of a particular message
	 * type to be retrieved by the recipient from a
	 * mailbox service in advance of transmissions
	 * containing a different message type.  The
	 * technique would not be used if either Functional
	 * Grouping or an interchange containing a mixture
	 * of different message types were being used, in
	 * which case it would be left blank.
	 */
	private String applicationReference;

	/**
	 * X      is a processing priority code, using a code
	 * defined in the Interchange Agreement (or left
	 * blank if not used)
	 */
	private String priority;
	/**
	 * 1      indicates that the sender is requesting an acknowledgement
	 * for the interchange, but only that the recipient
	 * has successfully received and identified the header and
	 * trailer segments (UNB & UNZ) for the interchange.  The
	 * recipient would reply, using a 'CONTRL' message (see
	 * Section 10).  Such an acknowledgement does not mean that
	 * the contents of the interchange have been processed
	 * correctly and are acceptable to the recipient.  The field
	 * is set to zero if an acknowledgement is not required.
	 */
	private int acknowledgement;  // 0-1
	/**
	 * CANDE  is an example of a code specified in the Interchange
	 * Agreement, which identifies the type of communications
	 * agreement under which the interchange is controlled, (or
	 * left blank if not used).
	 */
	private String agreementType;

	/**
	 * 1      indicates that this is a test transmission.  The field is
	 * set to zero for transmission of live data
	 */
	private String testIndicator;
}
