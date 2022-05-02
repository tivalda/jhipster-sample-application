package com.gs2e.datacollector;

import com.gs2e.datacollector.JhipsterSampleApplicationApp;
import com.gs2e.datacollector.config.EmbeddedMongo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = JhipsterSampleApplicationApp.class)
@EmbeddedMongo
public @interface IntegrationTest {
}
