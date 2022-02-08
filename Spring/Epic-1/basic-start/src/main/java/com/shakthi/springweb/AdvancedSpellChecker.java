package com.shakthi.springweb;

public class AdvancedSpellChecker implements SpellChecker {
    @Override
    public void checkSpelling(String emailMsg) {
        if(emailMsg!=null) {

            System.out.println("Spell Checking Completed");
        }
        else
        {
            throw new RuntimeException("An exception occurred while checking Spelling ");
        }
    }
}
