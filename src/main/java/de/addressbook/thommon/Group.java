package de.addressbook.thommon;

import java.util.ArrayList;

public class Group {


    public Group(String groupName) {
        this.groupName = groupName;

    }

    public String getGroupname() {
        return groupName;
    }



    public void setGroupname(String groupname) {
        this.groupName = groupname;
    }

    public void addPersonToGroup(Person person){
        PersonsInGroup.add(person);
        person.addMembership(Group.this);
    }




    private String groupName;

    public ArrayList<Person> getPersonsInGroup() {
        return PersonsInGroup;
    }

    public void setPersonsInGroup(ArrayList<Person> personsInGroup) {
        PersonsInGroup = personsInGroup;
    }

    ArrayList<Person> PersonsInGroup    = new ArrayList<>();
}
