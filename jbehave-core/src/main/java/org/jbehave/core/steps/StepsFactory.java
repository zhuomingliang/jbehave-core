package org.jbehave.core.steps;

import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.configuration.Configuration;

/**
 * Factory class to create {@link CandidateSteps} from POJO instances.
 * The factory allows candidate steps methods to be defined in POJOs and wrapped
 * by {@link Steps} rather than having to extend {@link Steps}.  
 * Both "has-a" relationship and "is-a" design models are thus supported.
 */
public class StepsFactory {

    private Configuration configuration;

    public StepsFactory() {
        this(new MostUsefulConfiguration());
    }

    public StepsFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    public CandidateSteps[] createCandidateSteps(Object... stepsInstances) {
        CandidateSteps[] candidateSteps = new CandidateSteps[stepsInstances.length];
        for (int i = 0; i < stepsInstances.length; i++) {
            candidateSteps[i] = new Steps(configuration, stepsInstances[i]);
        }
        return candidateSteps;
    }
}
