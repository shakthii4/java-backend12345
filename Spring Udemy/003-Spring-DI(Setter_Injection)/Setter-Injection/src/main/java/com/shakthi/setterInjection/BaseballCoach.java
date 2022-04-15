package com.shakthi.setterInjection;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach() {
    }

    public BaseballCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyworkout()
    {
        return "Spend 30 minitues on coding practice";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}
