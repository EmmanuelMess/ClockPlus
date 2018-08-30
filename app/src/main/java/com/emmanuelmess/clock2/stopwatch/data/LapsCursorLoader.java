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

package com.emmanuelmess.clock2.stopwatch.data;

import android.content.Context;

import com.emmanuelmess.clock2.data.SQLiteCursorLoader;
import com.emmanuelmess.clock2.stopwatch.Lap;

/**
 * Created by Phillip Hsu on 8/9/2016.
 */
public class LapsCursorLoader extends SQLiteCursorLoader<Lap, LapCursor> {
    public static final String ACTION_CHANGE_CONTENT
            = "com.emmanuelmess.clock2.stopwatch.data.action.CHANGE_CONTENT";

    public LapsCursorLoader(Context context) {
        super(context);
    }

    @Override
    protected LapCursor loadCursor() {
        return new LapsTableManager(getContext()).queryItems();
    }

    @Override
    protected String getOnContentChangeAction() {
        return ACTION_CHANGE_CONTENT;
    }
}
