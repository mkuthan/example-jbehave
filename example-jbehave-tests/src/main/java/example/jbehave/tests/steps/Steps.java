package example.jbehave.tests.steps;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Steps {

}