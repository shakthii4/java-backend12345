package com.shakthi.setterInjection;

public class TrackCoach implements Coach
{

    FortuneService fortuneService;

    public TrackCoach()
    {
    }

    public TrackCoach(FortuneService fortuneService)
    {
        this.fortuneService=fortuneService;

    }
    @Override
    public String getDailyworkout()
    {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }

    //Bean Life Cycle Example

    public void doMyStartupStuff()
    {
        System.out.println("TrackCoach: inside method domyStartupStuff");
    }

    public void doMyCleanupStuff()
    {
        System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }
}
