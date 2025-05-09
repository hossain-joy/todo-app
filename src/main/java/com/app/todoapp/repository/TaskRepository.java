package com.app.todoapp.repository;

import com.app.todoapp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
    public interface TaskRepository extends JpaRepository<Task, Long> {

    }