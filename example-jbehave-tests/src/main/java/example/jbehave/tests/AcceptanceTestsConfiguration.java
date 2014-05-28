package example.jbehave.tests;

import example.jbehave.app.domain.DomainConfiguration;
import example.jbehave.app.infrastructure.InfrastructureConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DomainConfiguration.class, InfrastructureConfiguration.class})
@ComponentScan
public class AcceptanceTestsConfiguration {
}
