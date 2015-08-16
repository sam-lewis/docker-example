package com.github.dockerexample

import spock.lang.Specification

import javax.ws.rs.client.ClientBuilder
import javax.ws.rs.core.MediaType

class HelloWorldTest extends Specification {

    def client = ClientBuilder.newClient()

    def resource = client.target('http://192.168.99.101:8080')

    def 'test get /'() {
        expect:
        resource.request(MediaType.TEXT_PLAIN_TYPE).get(String) == 'Hello from Docker!'
    }
}
