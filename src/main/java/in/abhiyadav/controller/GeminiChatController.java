package in.abhiyadav.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.abhiyadav.service.GeminiChatService;
@RestController
public class GeminiChatController {
    @Autowired
    private GeminiChatService geminiChatService;

    // Handles HTTP GET request
// @RequestParam Receives prompt from the user
    @GetMapping("/askany")
    public String getGenAiDetails(@RequestParam String question) {

        return geminiChatService.getAsk(question);
    }

}