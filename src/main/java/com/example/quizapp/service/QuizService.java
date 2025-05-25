package com.example.quizapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.quizapp.dao.QuestionDao;
import com.example.quizapp.dao.QuizDao;
import com.example.quizapp.model.Quiz;

@Service
public class QuizService {
	
	@Autowired
	QuizDao quizDao;
	
	@Autowired
	QuestionDao questionDao;
	
	public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestions(questionDao.findRandomQuestionsByCategory(category, numQ));
		quizDao.save(quiz);
		return new ResponseEntity("Success", HttpStatus.CREATED);
	}
}
