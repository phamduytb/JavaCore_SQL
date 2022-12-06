package nsotien.repository;/*
java by nsotien tv .......
Name : nsotien
Time : 15:20
Date : 26/11/2022
*/

import nsotien.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}
