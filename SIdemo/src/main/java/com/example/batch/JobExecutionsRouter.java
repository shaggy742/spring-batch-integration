package com.example.batch;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.integration.annotation.Router;

public class JobExecutionsRouter {

	@Router
	public List<String> routeJobExecution(JobExecution jobExecution) {

		final List<String> routeToChannels = new ArrayList<String>();

		if (jobExecution.getStatus().equals(BatchStatus.FAILED)) {
			//routeToChannels.add("jobRestarts");
		}
		else {

			if (jobExecution.getStatus().equals(BatchStatus.COMPLETED)) {
				System.out.println("This is complete job");
				routeToChannels.add("completeApplication");
			}

			//routeToChannels.add("notifiableExecutions");
		}
		routeToChannels.add("samplechannel");
		return routeToChannels;
	}
}
