package io.schinzel.sites.public_site

import io.javalin.Javalin
import io.javalin.http.staticfiles.Location
import io.schinzel.logic.db.MyDb

fun main() {
    PublicWebServer(5555)
}

/**
 * http://127.0.0.1:5555/
 * http://127.0.0.1:5555/index.html
 * java -jar myJar.jar
 */
class PublicWebServer(port: Int) {
    init {
        MyDb()

        Javalin.create { config ->
            config.staticFiles.add("/my_project/sites/public", Location.CLASSPATH)
        }
            .get("/") { ctx -> ctx.result("Hello Public World") }
            .start(port)
    }
}