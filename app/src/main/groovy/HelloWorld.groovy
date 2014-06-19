import spark.Request
import spark.Response
import spark.Route

import static spark.Spark.*

class HelloWorld {
    static void main(String... args) {
        port = 8080
        get(new Route("/"){
            @Override
            Object handle(Request request, Response response) {
                'Hello from Docker!!!'
            }
        })
    }
}
