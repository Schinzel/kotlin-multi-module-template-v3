package io.schinzel.sites.site_starter

import io.schinzel.basicutils.configvar.ConfigVar
import io.schinzel.sites.admin.AdminWebServer
import io.schinzel.sites.public_site.PublicWebServer

fun main() {
    val configVar = ConfigVar.create("settings/.env")
    val siteToStart = configVar.getValue("SITE")
    val port = configVar.getValue("PORT").toInt()

    when (siteToStart) {
        "public" -> PublicWebServer(port)
        "admin" -> AdminWebServer(port)
        else -> throw IllegalArgumentException("Unknown site $siteToStart")
    }
    println("Web server started for site $siteToStart on port $port")
}
