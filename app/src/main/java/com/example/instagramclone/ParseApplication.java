package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("tglgPl0iuv3Su5yTAqoaoRKEO25PvPRQd8tL704f")
                .clientKey("2TI8WkLxtxdAeyn0FQgEJZG8S7na8cA9axrAPmnD")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}


