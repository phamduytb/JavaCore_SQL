package nsotien.controller;/*
java by nsotien tv .......
Name : nsotien
Time : 15:56
Date : 26/11/2022
*/

import nsotien.entity.Student;
import nsotien.repository.StudentRepository;
import nsotien.sevice.StudentSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentSevice studentSevice;

    @Autowired
    StudentRepository studentRepository;


    @GetMapping("/create")
    public String create() {
        return "student/createstudent";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Student student) {
        studentSevice.createStudent(student);
        return "redirect:/student/search";
    }

    @GetMapping("/search")
    public String search(Model model) {
        List<Student> studentList = studentSevice.getAll();
        model.addAttribute("list", studentList);
        return "student/searchstudent";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        studentSevice.deleteStudent(id);
        return "redirect:/student/search";
    }

    @PostMapping("/search")
    public String search(@RequestParam("min") int min,
                         @RequestParam("max") int max,
                         @RequestParam("page") int page,
                         @RequestParam("size") int size,
                         Model model) {

        Page<Student> studentPage = studentRepository.search(min, max, PageRequest.of(page, size, Sort.Direction.DESC, "age"));
        System.out.println(studentPage.getTotalPages());
        System.out.println(studentPage.getNumberOfElements());
        model.addAttribute("list", studentPage.getContent());
        return "student/searchstudent";
    }

    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable("id") int id) {
        Student student = studentRepository.getById(id);
        model.addAttribute("update", student);
        return "student/updatestudent";
    }

    @PostMapping("/update/{id}")
    public String update(@ModelAttribute("id") Student student) {
        studentRepository.save(student);
        return "redirect:/student/search";
    }




}
