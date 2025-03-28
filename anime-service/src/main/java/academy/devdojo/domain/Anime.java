package academy.devdojo.domain;

import java.util.List;

public class Anime {
    private Long id;
    private String name;

    public Anime(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static List<Anime> getAnimes() {
        var ninjaKamui = new Anime(1L, "Ninja Kamui");
        var kaijuu = new Anime(2L, "Kaijuu");
        var kimetsuNoYaba = new Anime(3L, "Kimetsu No Yaba");

        return List.of(ninjaKamui, kaijuu, kimetsuNoYaba);
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
