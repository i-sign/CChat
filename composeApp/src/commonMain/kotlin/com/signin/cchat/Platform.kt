package com.signin.cchat

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform