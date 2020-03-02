package com.nana.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * WebMVCConfig
 */

@Configurable
@ComponentScan(basePackages = "com.nana.controller")
public class WebMVCConfig {

    
}