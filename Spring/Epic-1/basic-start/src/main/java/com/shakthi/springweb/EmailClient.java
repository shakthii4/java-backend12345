package com.shakthi.springweb;

public class EmailClient
{
    private SpellChecker spellChecker;

    public EmailClient(SpellChecker spellChecker)
    {
        this.spellChecker = spellChecker;
    }


    void sendEmail(String emailMsg)
    {
        spellChecker.checkSpelling(emailMsg);
    }
}

