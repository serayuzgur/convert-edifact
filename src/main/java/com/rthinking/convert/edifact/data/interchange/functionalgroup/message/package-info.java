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

/**
 * 8.3.8 Message structure
 * <p/>
 * A message must begin with the service segment 'Message header'
 * which has the segment code UNH.  A message must end with the
 * service segment 'Message trailer' which has the segment code
 * UNT.  In addition to these two delimiting segments, a message
 * may contain one or more user data segments required for the
 * message.
 * <p/>
 * A message containing one user data segment to be transmitted
 * can therefore be depicted as:
 * <p/>
 * . UNH segment
 * |
 * |   data segment
 * |
 * . UNT segment
 * <p/>
 * A message containing ' n ' segments to be transmitted can be
 * depicted as:
 * <p/>
 * . UNH segment
 * |
 * |   first data segment
 * |   ...
 * |   n-th data segment
 * |
 * . UNT segment
 * <p/>
 * The syntax rules do not specify the order in which these user
 * data segments should be transmitted within a message.  This is
 * a function of message design.  The Interchange Agreement must
 * contain specifications for all interchange messages and their
 * segments as required by the user group.
 */
package com.rthinking.convert.edifact.data.interchange.functionalgroup.message;