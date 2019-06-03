package br.com.pradella.steps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.pradella.steps.flow.service.StepsFlow1;
import br.com.pradella.steps.flow.service.StepsFlow2;
import br.com.pradella.steps.flow.service.StepsFlow3;
import br.com.pradella.steps.flow.service.StepsFlow4;
import br.com.pradella.steps.model.Steps;

@Component
public class StepsflowAbstractService {

	@Autowired
	private StepsFlow1 stepsFlow1; 

	@Autowired
	private StepsFlow2 stepsFlow2; 

	@Autowired
	private StepsFlow3 stepsFlow3; 

	@Autowired
	private StepsFlow4 stepsFlow4; 

	
	public Steps start() {
		Steps steps = new Steps();
		steps.setInit("iniciado");
		
		stepsFlow4.next(stepsFlow3);
		stepsFlow3.next(stepsFlow2);
		stepsFlow2.next(stepsFlow1);
	
		return stepsFlow4.start(steps);
	}

}
