package academy.devdojo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("v1/heroes")
public class HeroController {
    private final List<String> heroes= List.of("Guts","Zoro", "Kakashi","Goku");

    @GetMapping
    public List<String>  getAllHeroes(){
        return heroes;
    }

    @GetMapping("/filter")
    public List<String>  getAllHeroesParam(@RequestParam(defaultValue = "") String name){
        return heroes.stream().filter(hero -> hero.equals(name)).toList();
    }

    @GetMapping("/filterlist")
    public List<String>  getAllHeroesParamList(@RequestParam(defaultValue = "") List<String> names){
        return heroes.stream().filter( names::contains).toList();
    }

    @GetMapping("{name}")
    public List<String>  getAllHeroesParamList(@PathVariable  String name){
        return heroes.stream().filter(hero -> hero.equals(name)).toList();
    }
    /**     EXEMPLO COM DUAS VARIÁVEIS
     *      @GetMapping("{name}anime/{id}")
     *      public List<String>  getAllHeroesParamList(@PathVariable  String name, @PathVariable long id ){
     *          return heroes.stream().filter(hero -> hero.equals(name)).toList();
     *      }
     */

}
