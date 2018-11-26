package com.awin.demojenkinsfile;

import org.junit.Test;


public class ServiceTest {

    @Test
    public void getterSetter() {
        Service service = new Service();
        service.setInjectedHostname("123");

        assert service.getInjectedHostname() == "123";
    }

}
