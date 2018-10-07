package com.preciousccheck.api;

import com.preciousccheck.api.resources.MyResource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testGetIt() {
        MyResource resource = new MyResource();
        Assert.assertEquals("Got it!", resource.getIt());
    }

}
