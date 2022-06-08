package com.training.java.lambda;

public class CheckPersonEligibleForSelectiveService implements CheckPerson {
    @Override
    public boolean test(Person person) {
        return person.getGender() == Person.Sex.MALE
                && person.getAge() >= 18
                && person.getAge() <= 25;
    }
}
