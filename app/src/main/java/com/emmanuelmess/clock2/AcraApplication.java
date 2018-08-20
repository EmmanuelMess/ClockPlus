package com.emmanuelmess.clock2;

import android.app.Application;
import android.content.Context;

import com.emmanuelmess.clock2.BuildConfig;
import com.emmanuelmess.clock2.R;

import org.acra.ACRA;
import org.acra.annotation.AcraCore;
import org.acra.annotation.AcraMailSender;
import org.acra.annotation.AcraToast;

@AcraCore(buildConfigClass = BuildConfig.class)
@AcraToast(resText = R.string.reportcrash)
@AcraMailSender(mailTo = "emmanuelbendavid@gmail.com", resSubject = R.string.reportcrashsubject)
public class AcraApplication  extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        // The following line triggers the initialization of ACRA
        ACRA.init(this);
    }
}