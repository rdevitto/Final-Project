package io.swagger.api.factories;

import io.swagger.api.EventApiService;
import io.swagger.api.impl.EventApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-05-02T02:45:15.118Z")
public class EventApiServiceFactory {
    private final static EventApiService service = new EventApiServiceImpl();

    public static EventApiService getEventApi() {
        return service;
    }
}
