package org.ow2.proactive.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

/**
 * Contains the configuration to reach other services
 */
@Component
@Getter
public class ServiceConfiguration {

    @Value("${pa.calendar.catalog-url}")
    private String catalogURL;
}
