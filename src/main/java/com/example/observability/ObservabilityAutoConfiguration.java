package com.example.observability;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MetricsConfig.class})
public class ObservabilityAutoConfiguration {
}
