package com.training.java.lambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class RosterTest {
    @Test
    void printPersonOlderThan(){
        // Given
        final RosterService rosterService = new RosterService();

        final List<Person> persons = new ArrayList<>();

        final Person p = new Person();
        p.setAge(20);

        persons.add(p);

        // When
        final List<Person> searchPersons = rosterService.printPersonOlderThan(persons, 18);

        // Then
        Assertions.assertEquals(persons, searchPersons);
    }

    @Test
    void printPersonWithinAgeRange(){
        // Given
        final RosterService rosterService = new RosterService();

        final List<Person> persons = new ArrayList<>();

        final Person p = new Person();
        p.setAge(20);

        persons.add(p);

        // When
        final List<Person> searchPersons = rosterService.printPersonWithinAgeRange(persons, 18, 25);

        // Then
        Assertions.assertEquals(persons, searchPersons);
    }

    @Test
    void printPersonWithLocalClass(){
        // Given
        final RosterService rosterService = new RosterService();

        final List<Person> persons = new ArrayList<>();

        final Person p = new Person();
        p.setGender(Person.Sex.MALE);
        p.setAge(20);

        persons.add(p);

        // When
        final List<Person> searchPersons = rosterService.printPersonWithLocalClass(persons,
                new CheckPersonEligibleForSelectiveService());

        // Then
        Assertions.assertEquals(persons, searchPersons);
    }

    /**
     * Approch 4 : Specify Search Criteria Code in an Anonymous Class
     */
    @Test
    void printPersonWithAnonymousClass(){
        // Given
        final RosterService rosterService = new RosterService();

        final List<Person> persons = new ArrayList<>();

        final Person p = new Person();
        p.setGender(Person.Sex.MALE);
        p.setAge(20);

        persons.add(p);

        // When
        final List<Person> searchPersons = rosterService.printPersonWithLocalClass(persons,
                new CheckPerson() {
                    @Override
                    public boolean test(Person person) {
                        return person.getGender() == Person.Sex.MALE
                                && person.getAge() >= 18
                                && person.getAge() <= 25;
                    }
                });

        // Then
        Assertions.assertEquals(persons, searchPersons);
    }

    /**
     * Approch 5 : Specify Search Criteria Code with a Lambda Expression
     */
    @Test
    void printPersonWithLambda(){
        // Given
        final RosterService rosterService = new RosterService();

        final List<Person> persons = new ArrayList<>();

        final Person p = new Person();
        p.setGender(Person.Sex.MALE);
        p.setAge(20);

        persons.add(p);

        // When
        final List<Person> searchPersons = rosterService.printPersonWithLocalClass(persons,
                person -> person.getGender() == Person.Sex.MALE
                                && person.getAge() >= 18
                                && person.getAge() <= 25
        );

        // Then
        Assertions.assertEquals(persons, searchPersons);
    }

    /**
     * Approch 6 : Use Standard Functional Interfaces with Lambda Expressions
     */
    @Test
    void printPersonWithPredicate(){
        // Given
        final RosterService rosterService = new RosterService();

        final List<Person> persons = new ArrayList<>();

        final Person p = new Person();
        p.setGender(Person.Sex.MALE);
        p.setAge(20);

        persons.add(p);

        // When
        final List<Person> searchPersons = rosterService.printPersonWithLocalClass(persons,
                person -> person.getGender() == Person.Sex.MALE
                        && person.getAge() >= 18
                        && person.getAge() <= 25
        );

        // Then
        Assertions.assertEquals(persons, searchPersons);
    }

    @Test
    void processPerson(){
        // Given
        final RosterService rosterService = new RosterService();

        final List<Person> persons = new ArrayList<>();

        final Person p = new Person();
        p.setGender(Person.Sex.MALE);
        p.setAge(20);

        persons.add(p);

        // When
        final Predicate<Person> isPersonBetWeen = person -> person.getGender() == Person.Sex.MALE
                && person.getAge() >= 18
                && person.getAge() <= 25;
        rosterService.processPerson(persons, isPersonBetWeen, System.out::println);
    }

    /**
     * Approach 7: Use Lambda Expressions Throughout Your Application
     */
    @Test
    void processPersonsWithFunction(){
        // Given
        final RosterService rosterService = new RosterService();

        final List<Person> persons = new ArrayList<>();

        final Person p = new Person();
        p.setGender(Person.Sex.MALE);
        p.setAge(20);
        p.setEmailAddress("testEmail");

        persons.add(p);

        // When
        final Predicate<Person> isPersonBetween = person -> person.getGender() == Person.Sex.MALE
                && person.getAge() >= 18
                && person.getAge() <= 25;
        Function<Person, String> personFunctionEmail = Person::getEmailAddress;
        List<String> searchEmails = rosterService.processPersonsWithFunction(persons, isPersonBetween,
                personFunctionEmail, System.out::println);

        // Then
        Assertions.assertEquals(1, searchEmails.size());
        Assertions.assertEquals("testEmail", searchEmails.get(0));
    }

    /**
     * Approach 8: Use Generics More Extensively
     */
    @Test
    void processElements(){
        // Given
        final RosterService rosterService = new RosterService();

        final List<Person> persons = new ArrayList<>();

        final Person p = new Person();
        p.setGender(Person.Sex.MALE);
        p.setAge(20);
        p.setEmailAddress("testEmail");

        persons.add(p);

        // When
        final Predicate<Person> isPersonBetween = person -> person.getGender() == Person.Sex.MALE
                && person.getAge() >= 18
                && person.getAge() <= 25;
        Function<Person, Person.Sex> personFunctionSex = Person::getGender;
        List<Person.Sex> searchEmails = rosterService.processElements(persons, isPersonBetween,
                personFunctionSex, System.out::println);

        // Then
        Assertions.assertEquals(1, searchEmails.size());
        Assertions.assertEquals(Person.Sex.MALE, searchEmails.get(0));
    }

    /**
     * Approach 9: Use Aggregate Operations That Accept Lambda Expressions as Parameters
     */
    @Test
    void processElementsWithAgregate(){
        // Given
        final RosterService rosterService = new RosterService();

        final List<Person> persons = new ArrayList<>();

        final Person p = new Person();
        p.setGender(Person.Sex.MALE);
        p.setAge(20);
        p.setEmailAddress("testEmail");

        persons.add(p);

        // When
        final Predicate<Person> isPersonBetween = person -> person.getGender() == Person.Sex.MALE
                && person.getAge() >= 18
                && person.getAge() <= 25;
        Function<Person, Person.Sex> personFunctionSex = Person::getGender;
        List<Person.Sex> searchEmails = rosterService.processElementsWithAgregate(persons, isPersonBetween,
                personFunctionSex, System.out::println);

        // Then
        Assertions.assertEquals(1, searchEmails.size());
        Assertions.assertEquals(Person.Sex.MALE, searchEmails.get(0));
    }
}
