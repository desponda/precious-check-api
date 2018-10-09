package com.preciousccheck.api;

import com.preciousccheck.api.resources.MyResource;
import org.junit.Assert;
import org.junit.Test;

public class ApiApplicationTests {

    @Test
    public void contextLoads() {
        //ApiApplication.main(new String[0]);
    }

    @Test
    public void testGetIt() {
        MyResource resource = new MyResource();
        Assert.assertEquals("Got it!", resource.getIt());
    }

}
