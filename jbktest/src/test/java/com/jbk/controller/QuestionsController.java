package com.jbk.controller;

import org.apache.catalina.valves.rewrite.QuotedStringTokenizer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testapi")
public class QuestionsController {
	public Question getQuestions(){
		Question question =new Question();
		question.setQuestionText("Java is platform independent  ?");
		question.setOption1("YES");
		question.setOption2("NO");
		question.setCorrectOption("1");
		question.setExplanation("Due to Byte code which is OS independent ");
		return question;
	}

}
