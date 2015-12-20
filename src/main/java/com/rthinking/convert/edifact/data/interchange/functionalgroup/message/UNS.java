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
 * 8.3.11 Section control segment - UNS (See ISO 9735 Annex B
 * for detailed specification)
 * <p/>
 * Some UN Standard Messages (UNSM's) have been designed having
 * three distinct logical sections, the first containing what may
 * be termed user header data for the message, the second
 * containing detail information (which will often repeat within
 * the message), and the third containing summary information
 * related to the contents of the message.
 * <p/>
 * In this type of structure, the situation may arise where
 * identical user data segment(s) may be required in more than one
 * of the sections, but containing different values for their data
 * elements, (or in some cases overriding the data carried in the
 * identical segment in the header section). In order to permit the
 * precise identification and control of this situation, a control
 * segment is provided to delimit the three sections.
 * <p/>
 * An example of the function of overriding data carried in an
 * earlier segment could be as follows.  A purchase order message
 * could specify in the header section a delivery address to which
 * the (majority of) the order should be delivered.  The same
 * segment containing this information could be repeated in the
 * detail section, related to a specific line item of the order.
 * In this case, the delivery address related to the line item
 * only, overrides the address given in the header section (which
 * could well apply to all of the other line items in the detail
 * section).
 * <p/>
 * The section control segment has a segment tag code of UNS and
 * contains one data element.  When used to delimit the
 * header section from the detail section, it contains the value
 * 'D', and when used to delimit the detail section from the
 * trailer section, it contains the value 'S'.
 * <p/>
 * When used, UNS segments must be specified in their correct
 * positions within the relevant message(s) in the message
 * directory.  If messages are designed having a different
 * structure - for example, where it is only necessary to separate
 * a summary section from the rest of the message - then only the
 * relevant UNS segment should be used.  No more than two UNS
 * segments should be used.
 * <p/>
 * An example of the use of the UNS segment is shown below:-
 * <p/>
 * UNH+........data..........'       ) Message Header
 * AAA+..........data............' ]
 * BBB+..........data............' ]User data segments
 * CCC+..........data............' ]forming the header section.
 * UNS+D' - Section control segment separating the header and
 * detail sections
 * BBB+..........data............' ]User data segments
 * FFF+..........data............' ](including an identically
 * GGG+..........data............' ]described BBB segment)
 * HHH+..........data............' ]forming the detail section.
 * UNS+S' - Section control segment separating the detail and
 * summary sections
 * III+..........data............' ] user data segments
 * JJJ+..........data............' ] forming the summary
 * KKK+..........data............' ] section.
 * UNT+.........data...........'
 */
public class UNS {
}
