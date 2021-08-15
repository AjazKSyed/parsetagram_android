package com.example.parsetagram;

import android.app.Application;
import android.graphics.PostProcessor;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register parse
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("BOOPwZh5Nrla5hb4VUcpie7upjXvxD7GZjGqbd5O")
                .clientKey("wN13C9mbACGsiOPm3m6Z81uvJ63SXkccDNNdRwkR")
                .server("https://parseapi.back4app.com")
                .build());

    }
}
