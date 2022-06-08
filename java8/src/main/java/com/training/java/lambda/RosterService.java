package com.training.java.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RosterService {
    /**
     * Approach 1: Create Methods that Search for Persons that Match One
     * Characteristic
     */
    public List<Person> printPersonOlderThan(List<Person> roster, int age) {
        final List<Person> persons = new ArrayList<>();
        for (Person p : roster) {
            if (p.getAge() >= age) {
                persons.add(p);
            }
        }

        return persons;
    }

    /**
     * Approach 2: Create More Generalized Search Methods
     */
    public List<Person> printPersonWithinAgeRange(List<Person> roster, int low, int high) {
        final List<Person> persons = new ArrayList<>();
        for (Person p : roster) {
            if (p.getAge() >= low && p.getAge() < high) {
                persons.add(p);
            }
        }

        return persons;
    }

    /**
     * Approch 3 : Specify Search Criteria Code in a Local Class
     */
    public List<Person> printPersonWithLocalClass(List<Person> roster, CheckPerson tester){
        final List<Person> persons = new ArrayList<>();
        for (Person p : roster){
            if(tester.test(p)){
                persons.add(p);
            }
        }

        return persons;
    }

    /**
     * Approch 6 : Use Standard Functional Interfaces with Lambda Expressions
     */
    public List<Person> printPersonWithPredicate(List<Person> roster, Predicate<Person> tester){
        final List<Person> persons = new ArrayList<>();
        for(Person p : roster){
            if(tester.test(p)){
                persons.add(p);
            }
        }

        return persons;
    }

    /**
     * Approch 7 : Use Lambda Expressions Throughout Your Application
     */
    public void processPerson(List<Person> roster, Predicate<Person> tester, Consumer<Person> consumer){
        for (Person p : roster){
            if(tester.test(p)){
                consumer.accept(p);
            }
        }
    }

    /**
     * Approach 7: Use Lambda Expressions Throughout Your Application
     */
    public List<String> processPersonsWithFunction(List<Person> roster, Predicate<Person> tester,
                                           Function<Person, String> mapper,Consumer<String> consumer){
        final List<String> datas = new ArrayList<>();
        for (Person p : roster) {
            if(tester.test(p)){
                String data = mapper.apply(p);
                datas.add(data);
                consumer.accept(data);
            }
        }

        return datas;
    }

    /**
     * Approach 8: Use Generics More Extensively
     */
    public <X, Y> List<Y> processElements(Iterable<X> roster, Predicate<X> tester,
                                          Function<X, Y> mapper, Consumer<Y> consumer){
        final List<Y> datas = new ArrayList<>();
        for (X p : roster) {
            if(tester.test(p)){
                Y data = mapper.apply(p);
                datas.add(data);
                consumer.accept(data);
            }
        }

        return datas;
    }

    /**
     * Approach 9: Use Aggregate Operations That Accept Lambda Expressions as Parameters
     */
    public <X, Y> List<Y> processElementsWithAgregate(List<X> roster, Predicate<X> tester,
                                            Function<X, Y> mapper, Consumer<Y> consumer){
        return roster.stream()
                .filter(tester)
                .map(mapper)
                .collect(Collectors.toList());
    }
}
