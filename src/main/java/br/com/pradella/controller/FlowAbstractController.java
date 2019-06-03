package br.com.pradella.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.com.pradella.steps.model.Steps;
import br.com.pradella.steps.service.StepsService;

@RestController
@RequestMapping("/pradella-estudies")
public class FlowAbstractController {

	@Autowired
	private StepsService stepsService;

	@GetMapping(value="/getSteps")
	public ResponseEntity<String> getSteps() {

		Steps steps = stepsService.getSteps();

		return new ResponseEntity<String>(new Gson().toJson(steps), HttpStatus.OK);
	}

}
