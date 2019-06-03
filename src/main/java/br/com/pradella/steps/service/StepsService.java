package br.com.pradella.steps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pradella.steps.model.Steps;

@Service
public class StepsService {

	@Autowired
	private StepsflowAbstractService stepsflowAbstractService;
	
	public Steps getSteps() {
		return stepsflowAbstractService.start();
	}

}
