package nsotien.repository;/*
java by nsotien tv .......
Name : nsotien
Time : 15:01
Date : 06/12/2022
*/


import nsotien.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
