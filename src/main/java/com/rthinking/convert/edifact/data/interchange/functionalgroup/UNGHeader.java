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
 * The main benefit of the use of functional grouping is that it
 * permits large organizations which have several functional
 * processes, (e.g. purchasing, invoicing etc) or data processing
 * centres (for example at a divisional or departmental level), to
 * create their own identifiable application level envelopes,
 * which can also be addressed from the originating department to
 * a department in the recipient's system.
 * <p/>
 * An example functional group, (which has the segment code UNG),
 * could be transmitted as:
 * <p/>
 * UNG+INVOIC+15623+23457+860606:183500+CD1352+UN+89:1+A3P52'
 */
public class UNGHeader {


	/**
	 * INVOIC      is the functional identification, used to
	 * identify the one message type contained within
	 * the functional group
	 */
	private String functionalID;

	/**
	 * 15623       is the Application Sender's Identification, which
	 * is a code identifying a specific division,
	 * department, section, etc., which has originated
	 * (or is responsible for) the messages contained
	 * in the functional group.  If necessary, the data
	 * element can contain a second component of a
	 * qualifier, to identify the code set being used.
	 */
	private String senderID;


	/**
	 * 23457       is the Application Recipients Identification, a
	 * code identifying a specific division, department,
	 * section, etc., to which the messages in the
	 * functional group are finally destined. If
	 * necessary, it too can be qualified by a second
	 * component to identify the code set being used.
	 */
	private String recipientsID;


	/**
	 * 860606:1835 is the date and time that the functional group
	 * of messages was assembled.  (NOTE that the time,
	 * and perhaps the date, will often be earlier than
	 * the date and time carried in the UNB interchange
	 * header segment).
	 */
	private String assembleTime;


	/**
	 * CD1352      is a unique reference number for the functional
	 * group, assigned by the division, etc., which
	 * originated the group of messages
	 */
	private String groupReference;


	/**
	 * UN          is the controlling agency code (see Section 7),
	 * which identifies the agency responsible for the
	 * production and maintenance of the message
	 * standards for the message type contained in the
	 * group
	 */
	private String agencyCode;

	/**
	 * 89:1        is the version and release number of all of the
	 * messages in the group, which must all be the
	 * same message type.  This composite data element
	 * could contain one additional component data
	 * element for an association assigned code. It
	 * should be noted that if conditions also demand
	 * the presence of a number in the association
	 * assigned code field, the same data for the
	 * composite need not be repeated in the equivalent
	 * fields of the Message Header (UNH) service
	 * segment preceding each message in the Functional
	 * Group.
	 * <p/>
	 * Usage is fully explained in Section 7.
	 */
	private String versionReleaseNumber;


	/**
	 * A3P52       is an application password, and is the only
	 * conditional data element in the segment, all the
	 * rest being mandatory.  The password is only used
	 * if specified in the interchange agreement (or if
	 * agreed bi-laterally) and could, for example, be
	 * used to gain entry to the recipient's sub-system
	 * which will process the functional group
	 */
	private String applicationPassword;
}
