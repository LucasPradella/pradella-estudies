package br.com.pradella.steps.flow.service;

import org.springframework.stereotype.Component;

import br.com.pradella.steps.model.Steps;

@Component
public class StepsFlow4 extends StepsFlowAbstract {

	@Override
	public Steps execute(Steps steps) {
		steps.setScenario("Cenario 4");
		return steps;
	}

	@Override
	public boolean handle(Steps steps) {
		return false;
	}
	
}
