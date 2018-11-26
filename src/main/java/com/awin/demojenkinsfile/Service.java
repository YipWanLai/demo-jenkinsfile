package com.awin.demojenkinsfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Service {

    private String injectedHostname;

    @Value(value = "${injected.hostname}")
    public void setInjectedHostname(String value) {
        System.out.println("injected value " + value);
        this.injectedHostname = value;
    }


    public String getInjectedHostname() {
        return injectedHostname;
    }

}
