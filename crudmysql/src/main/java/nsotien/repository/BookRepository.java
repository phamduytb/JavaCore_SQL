package nsotien.repository;/*
java by nsotien tv .......
Name : nsotien
Time : 14:07
Date : 26/11/2022
*/

import nsotien.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book , Integer> {
}
