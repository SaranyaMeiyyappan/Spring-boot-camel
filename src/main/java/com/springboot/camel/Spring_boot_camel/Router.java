package com.springboot.camel.Spring_boot_camel;


import ch.qos.logback.core.net.SyslogOutputStream;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Router extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        restConfiguration().host("localhost").port(8082);

        from("timer:rest-client?period=10s").to("rest:get:/hello").log("${body}");

    }
}
