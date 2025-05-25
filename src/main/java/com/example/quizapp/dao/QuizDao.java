package com.example.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
