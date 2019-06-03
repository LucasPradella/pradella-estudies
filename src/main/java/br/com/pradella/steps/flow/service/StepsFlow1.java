package br.com.pradella.steps.flow.service;

import org.springframework.stereotype.Component;

import br.com.pradella.steps.model.Steps;

@Component
public class StepsFlow1 extends StepsFlowAbstract {

	@Override
	public Steps execute(Steps steps) {
		steps.setScenario("Cenario 1");
		return steps;
	}

	@Override
	public boolean handle(Steps steps) {
		// A fim de teste estou adiciomos um true nesse retorno, para imprimir "Cenario 1"
		return true;
	}
	
}
