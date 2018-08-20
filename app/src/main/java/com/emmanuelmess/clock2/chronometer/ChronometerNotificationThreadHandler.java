/*
 * Copyright 2018 Emmanuel Messulam
 *
 * This file is part of ClockPlus.
 *
 * ClockPlus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ClockPlus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with ClockPlus.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.emmanuelmess.clock2.chronometer;

import android.os.Message;
import android.os.Handler;

import static com.emmanuelmess.clock2.chronometer.ChronometerNotificationThread.MSG_WHAT;

public class ChronometerNotificationThreadHandler extends Handler {

    private ChronometerNotificationThread chronometerNotificationThread;

    ChronometerNotificationThreadHandler(ChronometerNotificationThread chronometerNotificationThread) {
        this.chronometerNotificationThread = chronometerNotificationThread;
    }

    @Override
    public void handleMessage(Message m) {
        chronometerNotificationThread.updateNotification(true);
        sendMessageDelayed(Message.obtain(this, MSG_WHAT), 1000);
    }
}
