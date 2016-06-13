package edu.galileo.android.tipcalc;

import android.app.Application;

/**
 * Created by nacheteam on 2/06/16.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://about.me/nacheteam";

    public static String getAboutUrl() {
        return ABOUT_URL;
    }
}
