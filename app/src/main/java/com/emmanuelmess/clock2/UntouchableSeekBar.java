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

package com.emmanuelmess.clock2;

import android.content.Context;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * A SeekBar that cannot be touch controlled.
 */
public class UntouchableSeekBar extends AppCompatSeekBar {

    public UntouchableSeekBar(Context context) {
        super(context);
    }

    public UntouchableSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public UntouchableSeekBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent event) {
        return true;
    }
}
