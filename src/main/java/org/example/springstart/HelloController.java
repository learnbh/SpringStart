package org.example.springstart;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class HelloController {
    @GetMapping
    public String sayHello() {
        return "Hello World";
    }
    @PostMapping
    public String printValue(@RequestBody Student student) {
        return "Hello World"+student.surname()+" "+student.name();
    }

    @GetMapping("/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name;
    }
    @GetMapping("/search")
    public String printQuery(@RequestParam String query) {
        return "Your query is "+query;
    }

}
