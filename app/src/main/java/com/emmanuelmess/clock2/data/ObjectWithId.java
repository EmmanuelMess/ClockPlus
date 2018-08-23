/*
 * Copyright 2017 Phillip Hsu
 *
 * This file is part of Material Clock (formerly ClockPlus).
 *
 * Material Clock (formerly ClockPlus) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Material Clock (formerly ClockPlus) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Material Clock (formerly ClockPlus).  If not, see <http://www.gnu.org/licenses/>.
 */

package com.emmanuelmess.clock2.data;

/**
 * Created by Phillip Hsu on 7/29/2016.
 *
 * Superclass for objects that can be persisted in SQLite.
 */
public abstract class ObjectWithId {
    private long id;

    public final long getId() {
        return id;
    }

    public final void setId(long id) {
        this.id = id;
    }

    public final int getIntId() {
        return (int) id;
    }
}
