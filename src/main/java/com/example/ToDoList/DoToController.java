package com.example.ToDoList;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class DoToController {

    private final ToDoRepository toDoRepository;

    @RequestMapping("/todo")
    public String list(Model model) {
        // toDoRepository 안에 있는 Repository를 사용한다는 뜻 (findAll이 있으므로 DB에 저장된 모든 항목을 가져옴)
        List<ToDoEntity> toDoEntityList = this.toDoRepository.findAll();
        model.addAttribute("toDoEntityList", toDoEntityList);
        return "todolist";
    }
}
