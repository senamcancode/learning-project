package org.example.strategy_pattern.People;

import java.util.List;

class PeopleCounter {
    private PersonFilter filter;

    public void setFilter(PersonFilter filter) {
        this.filter = filter;
    }

    public int count(List<Person> people) {
        int count = 0;
        for (Person person : people) {
            if (filter.apply(person)) {  // Only one filter applied
                count++;
            }
        }
        return count;
    }
}
