package academy.devdojo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/heroes")
public class HeroController {
    private final List<String> heroes= List.of("Guts","Zoro", "Kakashi","Soku");

    @GetMapping
    public List<String>  getAllHeroes(){
        return heroes;
    }

}
