package com.thehoistory.todopus;

import org.springframework.data.rest.webmvc.RepositoryLinksResource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

public class RootResourceProcessor implements ResourceProcessor<RepositoryLinksResource> {

    @Override
    public RepositoryLinksResource process(RepositoryLinksResource resource) {
        //resource.add(ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(TsetController.class).test()).withRel("test"));
        return resource;
    }
}