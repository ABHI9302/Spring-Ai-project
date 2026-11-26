package in.abhiyadav.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class GeminiChatService {
    // ChatClient is a interface used to interact with AI models.
    private final ChatClient chatClient;

    public GeminiChatService(ChatClient.Builder geminiChatClientBuilder) {

        this.chatClient = geminiChatClientBuilder.build();
    }

// Builder ------> create the ChatClient object

// build()  -------> Builds ChatClient instance

    public String getAsk(String question) {

        return chatClient.prompt(question).call().content();
    }

// prompt() ----> Send the user prompt
//
// call() -------> Excecutes the AI request
//
// content() ---------> Extracts the AI response as String

}