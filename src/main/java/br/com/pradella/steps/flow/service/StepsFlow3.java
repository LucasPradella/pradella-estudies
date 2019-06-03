package br.com.pradella.steps.flow.service;

import org.springframework.stereotype.Component;

import br.com.pradella.steps.model.Steps;

@Component
public class StepsFlow3 extends StepsFlowAbstract {

	@Override
	public Steps execute(Steps steps) {
		steps.setScenario("Cenario 3");
		return steps;
	}

	@Override
	public boolean handle(Steps steps) {
		return false;
	}
	
}
