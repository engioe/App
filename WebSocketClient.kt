package com.groupmaster.chatapp.network

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.WebSocket
import okhttp3.WebSocketListener

class WebSocketClient(url: String, listener: WebSocketListener) {
    private val client = OkHttpClient()
    val webSocket: WebSocket

    init {
        val request = Request.Builder().url(url).build()
        webSocket = client.newWebSocket(request, listener)
    }
}
