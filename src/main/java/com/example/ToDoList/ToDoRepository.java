package com.example.ToDoList;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository의 두번재 제네릭 타입은 entity의 PK 타입과 같아야함
public interface ToDoRepository extends JpaRepository<ToDoEntity, Integer> {
}
