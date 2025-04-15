package org.example.springstart;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    private List<Message> messages;

    public MessageController() {
        messages = new ArrayList<>();
        messages.add(new Message("01", "test", "testmessage"));
    }

    @GetMapping
    public List<Message> getMessages() {
        return this.messages;
    }

    @PostMapping()
    public void postMessage(@RequestBody Message message) {
        messages.add(new Message(message.id(), message.name(), message.message()));
    }
    @DeleteMapping("/delete/{id}")
    public void deleteMessage(@PathVariable String id) {
        messages.removeIf(message -> message.id().equals(id));
    }
}
