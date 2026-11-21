package com.example.chatbot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ChatController {

    public record ChatRequest(String message) {}
    public record ChatResponse(String reply) {}

    @PostMapping("/chat")
    public ChatResponse chat(@RequestBody ChatRequest request) {
        // TODO: 여기서 LLM API를 호출하도록 교체하세요.
        return new ChatResponse("에코: " + request.message());
    }
}
