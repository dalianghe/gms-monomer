package com.github.dalianghe;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple UIBootstrap.
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    @Test
    public void testDemo() throws Exception{
        log.info("aaaaaaaaaaaaaaaaaa");
        log.error("bbbbbbbbbbbbbbb");
    }

}
