// TODO (9) Create a class called SunshineSyncUtils
package com.example.android.sunshine.sync;

import android.content.Context;
import android.content.Intent;

public class SunshineSyncUtils {
    //  TODO (10) Create a public static void method called startImmediateSync
    public static void startImmediateSync(Context context){
        Intent intentToSyncImmediately = new Intent(context, SunshineSyncIntentService.class);
        context.startService(intentToSyncImmediately);
    }
    //  TODO (11) Within that method, start the SunshineSyncIntentService
}