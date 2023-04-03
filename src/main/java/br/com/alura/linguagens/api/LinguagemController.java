package br.com.alura.linguagens.api;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {
  private List<Linguagem> languages = List.of(
    new Linguagem(
      "Java",
      "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png",
      1
    ),
    new Linguagem(
      "PHP",
      "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png",
      2
    )
  );

  @GetMapping("/languages")
  public List<Linguagem> getLanguages() {
    return languages;
  }
}
