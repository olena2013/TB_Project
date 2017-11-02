package com.qa.novotech.tbportal;

import com.qa.novotech.tbportal.appmanager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUpApp() {
        app.init();
        app.login();


    }

    @AfterMethod
    public void closeApp(){
        app.stop();

    }

    public ApplicationManager getApp() {
        return app;
    }

}
