package com.shakthi.setterInjection;

public class CricketCoach implements Coach
{
    private FortuneService fortuneService;
    //litteral values injection setter & getter
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        System.out.println("this is setter method-setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team)
    {
        System.out.println("this is setter method- setTeam");
        this.team = team;
    }

    public CricketCoach() {
        System.out.println("this is no arg Construcor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("this is setter method will perform");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyworkout() {
        return "Practice Fast coding for 15 minutes Daily";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
