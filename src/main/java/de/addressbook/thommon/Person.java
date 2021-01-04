package de.addressbook.thommon;


import java.util.ArrayList;
import java.util.Comparator;

public class Person implements Comparable<Person>{

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getEmail() {
        return email;
    }

    public void addMembership(Group group){
        ListOfGroupMembership.add(group);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String firstName;
    private String familyName;
    private String email;

    public ArrayList<Group> getListOfGroupMembership() {
        return ListOfGroupMembership;
    }

    ArrayList<Group> ListOfGroupMembership  = new ArrayList<>();


    public Person(String firstName, String familyName, String email) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.email = email;
    }


    @Override
    public int compareTo(Person person) {
        return this.getFamilyName().compareTo(person.familyName);
    }
}

