package br.com.alura.linguagens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {
  // private List<Linguagem> languages = List.of(
  // new Linguagem(
  // "Java",
  // "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png",
  // 1
  // ),
  // new Linguagem(
  // "PHP",
  // "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png",
  // 2
  // )
  // );

  @Autowired
  private LinguagemRepository repository;

  @GetMapping("/languages")
  public List<Linguagem> getLanguages() {
    // List<Linguagem> languages = repository.findAll();
    // return languages;
    return repository.findAll();
  }

  @GetMapping("/home")
  public String Home(){
    return "Olá Mundo";
  }

  @PostMapping("/languages")
  public Linguagem postLanguage(@RequestBody Linguagem languageData){
    Linguagem saveLanguage = repository.save(languageData);
    return saveLanguage;
  }
}
