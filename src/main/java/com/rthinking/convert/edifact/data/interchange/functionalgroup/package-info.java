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
 * Messages in a transmission can be assembled into one or more
 * functional groups.  For interchanges of data to/from North
 * America, the use of functional grouping is mandatory. For other
 * interchange applications, its use is optional, but should be
 * specified in the interchange agreement.
 * <p/>
 * It is not permitted to mix the use of functional groups with
 * messages not contained within functional groups in the same
 * interchange.
 * <p/>
 * Each functional group must begin with the control service
 * segment 'Functional Group Header' which has the segment code UNG.
 * Each functional group must end with the control service segment
 * 'Functional Group Trailer' which has the segment code UNE.
 */
package com.rthinking.convert.edifact.data.interchange.functionalgroup;