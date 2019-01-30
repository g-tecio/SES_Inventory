package com.cwgx.ses_inventory.rest;
import com.cwgx.ses_inventory.model.Category;
import com.cwgx.ses_inventory.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;
@Controller
@RestController
public class CategoryResource {
    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping(path = "/category", method = RequestMethod.GET)
    public @ResponseBody Iterable<Category> getAllUsers() {
        // This returns a JSON or XML with the users
        return categoryRepository.findAll();
    }

    @RequestMapping(path = "/category/{categoryName}", method = RequestMethod.GET)
    public @ResponseBody Category userFindByName(@PathVariable String categoryName) {
        // This returns a JSON or XML with the users
        return categoryRepository.categoryFindByName(categoryName);
    }

    @PostMapping("/category/post")
    Category newCategory(@RequestBody Category newCategory){
        return categoryRepository.save(newCategory);
    }
}
