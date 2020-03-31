package org.openmrs.module.labonfhir.api.scheduler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.openmrs.module.labonfhir.ISantePlusLabOnFHIRConfig;

@RunWith(MockitoJUnitRunner.class)
public class FetchTaskUpdatesTest {

	private static final String DRUG_ORDER_UUID = "44fdc8ad-fe4d-499b-93a8-8a991c1d477e";

	private FetchTaskUpdates updateTask;

//	@Mock
//	private IRestfulClientFactory clientFactory;

	@Mock
	private ISantePlusLabOnFHIRConfig config;

//	@Mock
//	private FhirTaskDao taskDao;

//	@Mock
//	private TaskTranslator taskTranslator;

	@Before
	public void setup() {
		updateTask = new FetchTaskUpdates();
		// updateTask.setClientFactory(clientFactory);
		updateTask.setConfig(config);
		// updateTask.setTaskDao(taskDao);
		//updateTask.setTaskTranslator(taskTranslator);
	}

	@Test
	public void execute_should_update_tasks() {
		when(config.isOpenElisEnabled()).thenReturn(true);
		String result = null;
		updateTask.execute();

		assertThat(result, notNullValue());
	}

}