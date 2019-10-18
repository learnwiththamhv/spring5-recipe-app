package guru.springframework.spring5recipeapp.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    //private Difficulty difficulty;
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)
    private Note note;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private Set<Ingredient> ingredients;
}
