package com.example.ToDoList;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ToDoEntity {

    @Id // 기본 키 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Integer 과 Long 차이
    // Integer은 작음 ~ 중간 규의 프로젝트를 실행할떄 사용 (메모리는 덜 먹음)
    // Long은 엄청 많은 데이터가 들어갈 때 안전한 사용을 위해서 사용
    private Integer id;

    @Column(length = 200)
    private String content;

    @Column(nullable = false)
    private Boolean completed;
}
