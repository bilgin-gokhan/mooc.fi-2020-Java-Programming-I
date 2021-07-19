
import java.util.ArrayList;

public class Room {

    private final ArrayList<Person> personList = new ArrayList<>();

    public void add(Person person) {
        this.personList.add(person);
    }

    public boolean isEmpty() {
        return this.personList.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.personList;
    }

    public Person shortest() {
        if (this.personList.isEmpty()) {
            return null;
        }
        Person returnPerson = personList.get(0);
        for (Person firstPerson : personList) {
            if (firstPerson.getHeight() < returnPerson.getHeight()) {
                returnPerson = firstPerson;
            }
        }
        return returnPerson;
    }

    public Person take() {
        if (this.personList.isEmpty()) {
            return null;
        }
        Person returnPerson = personList.get(0);
        for (Person firstPerson : personList) {
            if (firstPerson.getHeight() < returnPerson.getHeight()) {
                returnPerson = firstPerson;
            }
        }
        this.personList.remove(returnPerson);
        return returnPerson;
    }
}
