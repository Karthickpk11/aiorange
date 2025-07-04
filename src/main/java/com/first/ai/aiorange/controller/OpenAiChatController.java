package com.first.ai.aiorange.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OpenAiChatController {

    private final ChatClient chatClient;

    @Autowired
    public OpenAiChatController(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @GetMapping("/joke-service/simple")
    public Map<String, String> tellSimpleJoke() {
        return Map.of("generation", chatClient.prompt("Tell me a joke").call().content());
    }
}
