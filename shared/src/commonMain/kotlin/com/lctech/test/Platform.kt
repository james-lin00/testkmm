package com.lctech.test

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform