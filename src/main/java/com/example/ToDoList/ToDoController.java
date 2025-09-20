package com.example.ToDoList;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class ToDoController {

    private final ToDoService toDoService;

    @RequestMapping("/todo")
    public String list(Model model) {
        List<ToDoEntity> toDoEntityList = this.toDoService.getList();
        model.addAttribute("toDoEntityList", toDoEntityList);
        return "todolist";

    }

    @RequestMapping("/")
    public String root(Model model) {
        return "redirect:/todo";
    }
}
