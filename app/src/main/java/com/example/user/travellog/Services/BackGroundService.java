package com.example.user.travellog.Services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class BackGroundService extends Service {
    public BackGroundService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
