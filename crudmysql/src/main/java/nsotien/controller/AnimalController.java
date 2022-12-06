package nsotien.controller;/*
java by nsotien tv .......
Name : nsotien
Time : 15:17
Date : 26/11/2022
*/

import nsotien.entity.Animal;
import nsotien.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    AnimalRepository animalRepository;

    @GetMapping("/create")
    public String create() {
        return "animal/createanimal";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Animal animal) {
        animalRepository.save(animal);
        return "redirect:/animal/search";
    }

    @GetMapping("/search")
    public String search(Model model) {
        List<Animal> animalList = animalRepository.findAll();
        model.addAttribute("list", animalList);
        return "animal/searchanimal";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id) {
        animalRepository.deleteById(id);
        return "redirect:/animal/search";
    }

    @GetMapping("/update")
    public String update(Model model, @Param("id") int id) {
        Animal animal = animalRepository.getById(id);
        model.addAttribute("update", animal);
        return "animal/updateanimal";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("id") Animal animal) {
        animalRepository.save(animal);
        return "redirect:/animal/search";
    }
}
