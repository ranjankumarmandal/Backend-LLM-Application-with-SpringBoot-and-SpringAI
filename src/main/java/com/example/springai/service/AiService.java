package com.example.springai.service;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    private final OpenAiChatModel chatClient;

    @Autowired
    public AiService(OpenAiChatModel chatClient) {
        this.chatClient = chatClient;
    }

    public String ask(String prompt) {
        return chatClient.call(prompt);
    }
}

