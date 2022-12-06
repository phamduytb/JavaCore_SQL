package nsotien.controller;/*
java by nsotien tv .......
Name : nsotien
Time : 14:05
Date : 26/11/2022
*/

import nsotien.entity.Book;
import nsotien.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/book") // map đường dẫn book tới
public class BookController {
    @Autowired // khai báo interface
    BookRepository bookRepository;

    @GetMapping("/create")  // vào trang tạo danh sách
    public String create() {
        return "book/createbook";
    }

    @PostMapping("/create")  //  tạo danh sách xong sẽ lưu lại và tự trả về trang list dưới
    public String create(@ModelAttribute Book book) {
        bookRepository.save(book); // lưu thông tin sau khi create
        return "redirect:/book/search";
    }

    @GetMapping("/search")  // trang danh sách list
    public String search(Model model) {
        List<Book> bookList = bookRepository.findAll();
        model.addAttribute("list", bookList);
        return "book/searchbook";
    }

    @GetMapping("/delete") // xoá hàng dựa theo id xong trả về trang list dưới
    public String delete(@RequestParam("id") int id) {
        bookRepository.deleteById(id);
        return "redirect:/book/search";
    }

    @GetMapping("/update") // tới trang sửa list dựa theo id,pram ở đây là quét hết các thuộc tính theo id
    public String update(Model model, @Param("id") int id) {
        Book book = bookRepository.getById(id);
        model.addAttribute("update", book); // add vào danh sách bên html
        return "book/updatebook";
    }

    @PostMapping("/update")  // sau khi update xong lưu lại trả về trang list trên
    public String update(@ModelAttribute("id") Book book) {
        bookRepository.save(book);  // lưu lại,nếu list đã có thì update,không có sẽ tạo mới
        return "redirect:/book/search";
    }
}
