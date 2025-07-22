package io.schinzel.sites.admin

import io.javalin.Javalin
import io.javalin.http.staticfiles.Location
import io.schinzel.logic.db.MyDb

fun main() {
    AdminWebServer(5555)
}

class AdminWebServer(
    port: Int,
) {
    init {
        MyDb()
        Javalin
            .create { config ->
                config.staticFiles.add("/my_project/sites/admin", Location.CLASSPATH)
            }.get("/") { ctx -> ctx.result("Hello Admin World") }
            .start(port)
    }
}
