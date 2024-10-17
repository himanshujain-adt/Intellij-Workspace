package com.alpha.Scheduler.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DemoScheduler {

    @Scheduled(cron = "${schedulerdemo.cron}")
    public void scheduleJob() {
        System.out.println("Running  Scheduler Job........");

    }
}
