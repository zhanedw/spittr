package ca.statcan.zhanedw.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by haiting on 4/5/2017.
 */

@Configuration
@ComponentScan(basePackages = {"ca.statcan.zhanedw.spittr"},
    excludeFilters = {
        @ComponentScan.Filter(type=FilterType.ANNOTATION, value= EnableWebMvc.class)
    })
public class RootConfig {
}
