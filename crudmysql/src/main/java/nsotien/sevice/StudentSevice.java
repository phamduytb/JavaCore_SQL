package nsotien.sevice;/*
java by nsotien tv .......
Name : nsotien
Time : 20:50
Date : 26/11/2022
*/

import nsotien.entity.Student;
import nsotien.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class StudentSevice {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAll(){
        return studentRepository.findAll() ;
    }

    public void createStudent(Student student){
         studentRepository.save(student) ;
    }

    public void deleteStudent(@RequestParam("id") int id){
         studentRepository.deleteById(id);
    }




}
