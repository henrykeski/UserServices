package com.learn.userservices.config;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class MyApplication extends Application {
    // nothing to configure here
}