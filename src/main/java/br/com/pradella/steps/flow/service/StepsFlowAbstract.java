package br.com.pradella.steps.flow.service;

import java.util.Optional;

import br.com.pradella.steps.model.Steps;

public abstract class StepsFlowAbstract {
	
	private Optional<StepsFlowAbstract> flow;
	
	protected StepsFlowAbstract() {
		this.flow = Optional.empty();
	}
	
	public void next(StepsFlowAbstract stepsFlowAbstract) {
		this.flow = Optional.of(stepsFlowAbstract);
	}
	
	public Steps start(Steps steps) {
		if (this.handle(steps)) {
			return this.execute(steps);
		} else {
			return this.flow
					.orElseThrow(() -> null)
					.start(steps);
		}
	}
	
	public abstract Steps execute(Steps steps);
	
	public abstract boolean handle(Steps steps);

}
