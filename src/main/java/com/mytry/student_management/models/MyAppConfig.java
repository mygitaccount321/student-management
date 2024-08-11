package com.mytry.student_management.models;

import jakarta.validation.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;


@ConfigurationProperties(prefix = "myconfig")
@Validated
public record MyAppConfig (
        @NotEmpty
        String applicationName
) {
}
