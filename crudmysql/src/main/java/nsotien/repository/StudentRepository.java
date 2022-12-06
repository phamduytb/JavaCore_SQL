package nsotien.repository;/*
java by nsotien tv .......
Name : nsotien
Time : 15:55
Date : 26/11/2022
*/

import nsotien.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student , Integer> {

    @Query("SELECT s FROM Student s WHERE s.age >= :min AND s.age <= :max")
    List<Student> search(@RequestParam("min") int min, @RequestParam("max") int max) ;

        List<Student> findByName(String name);

        Page<Student> findByName(String name, Pageable pageable);

    @Query("SELECT s FROM Student s WHERE s.age >= :min AND s.age <= :max")
    Page<Student> search(@RequestParam("min") int min,@RequestParam("max") int max ,  Pageable pageable) ;


}
