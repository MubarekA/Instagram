package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("4EwLAURTXiufOIkFfZn93hnN6myDgrB1SKBhYGzl")
                .clientKey("kRJBCIIAa9v9pCPq9SESrj8CETkZNAMKPC9OrrYs")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
