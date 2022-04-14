package com.shakthi.dependancyInjection;

public class TrackCoach implements Coach
{

    FortuneService fortuneService;
    public TrackCoach(FortuneService fortuneService)
    {
        this.fortuneService=fortuneService;

    }
    @Override
    public String getDailyworkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
