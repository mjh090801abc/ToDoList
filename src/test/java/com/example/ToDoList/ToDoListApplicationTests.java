package com.example.ToDoList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// spring boot 애플리케이 전체를 실행 시켜서 테스트 환경을 만들어주 만들어 (DB, Jpa 연결 등 여러가지 확인 가능)
@SpringBootTest
class ToDoListApplicationTests {

	// 이 클래스 안에서 todoRepository 바로 활용 가능
	@Autowired
	// 변수 이름을 다르게 선언
	private ToDoRepository toDoRepository;

	// 테스트용 메서드라는걸 알려줌
	@Test
	void testJpa() {
		// ToDoEntity 필드들을 todo1에 담음
		ToDoEntity todo1 = new ToDoEntity();
		todo1.setContent("밥먹기");
		todo1.setCompleted(Boolean.TRUE);
		toDoRepository.save(todo1);
	}

}
