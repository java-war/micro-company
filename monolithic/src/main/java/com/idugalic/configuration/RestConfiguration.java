package com.idugalic.configuration;

import com.idugalic.queryside.blog.domain.BlogPost;
import com.idugalic.queryside.project.domain.Project;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

/**
 * A configuration of rest data respositories for {@link BlogPost} and {@link Project}.
 * 
 * @author idugalic
 *
 */
@Configuration
public class RestConfiguration extends RepositoryRestMvcConfiguration {
 
    @Override
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(BlogPost.class, Project.class);
    }
}