package com.first.ai.aiorange.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.api.OpenAiApi;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ChatClientConfig {

    //@Bean
    //@Qualifier("openAiChatClient")
    public ChatClient openAiChatClient(ChatClient.Builder chatClientBuilder){
        return null;
    }
}
