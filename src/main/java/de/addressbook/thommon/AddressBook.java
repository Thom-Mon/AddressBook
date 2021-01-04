package de.addressbook.thommon;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AddressBook {


    private Person person;
    private Group group;

    public AddressBook() {

    }

    public int showNamesCount()
    {
        return PersonsInAddressBook.size();
    }

    public void addGroupEntry(Group group){
        GroupsInAddressBook.add(group);
    }
    public void addPersonEntry(Person person)
    {
        PersonsInAddressBook.add(person);
        Collections.sort(PersonsInAddressBook);
    }


    public String showNamesOccurences()
    {
        for(Person element : PersonsInAddressBook){
            FamilyNames.add(element.getFamilyName());
        }
        String concatString = "";
        Set<String> uniqueSet = new HashSet<String>(FamilyNames);
        for(String element : uniqueSet) {

                int counting = Collections.frequency(FamilyNames, element);
                System.out.println("\u001B[35m"+element + " : " + counting + "\u001B[0m");
                concatString += element + " : " + counting + " ";
        }
        return concatString;
    }


    public void showAllElements(){

        for(Person element : PersonsInAddressBook) {
            System.out.println("\u001B[33m"+ element.getFirstName() + "-" + element.getFamilyName() + "-" + element.getEmail() + "\u001B[0m");

        }

    }

    public void showGroupsOfPerson(Person person)
    {
        System.out.println("-------------------");
        System.out.println("Die Person " + "\u001B[31m" + person.getFirstName() + " " + person.getFamilyName()+ "\u001B[0m" +" ist in folgenden Gruppen: ");
        ArrayList<Group> Gruppe = person.getListOfGroupMembership();
        for (Group element : Gruppe)
        {
            System.out.println("\u001B[34m"+ element.getGroupname()+ "\u001B[0m");
        }
    }





    public ArrayList<Group> getGroupsInAddressBook() {
        //Testzwecke
        System.out.println("\u001B[31m" + "------Gruppen im Adressbuch-------" + "\u001B[0m");
        for (Group element : GroupsInAddressBook)
        {
            System.out.println("\u001B[31m" + element.getGroupname() + ": " + element.getPersonsInGroup().size() + "\u001B[0m");;
        }
        System.out.println("-------------------");
        return GroupsInAddressBook;
    }

    public void setGroupsInAddressBook(ArrayList<Group> groupsInAddressBook) {
        GroupsInAddressBook = groupsInAddressBook;
    }

    ArrayList<Group>    GroupsInAddressBook   = new ArrayList<>();
    ArrayList<String>   FamilyNames   = new ArrayList<>();
    ArrayList<Person>   PersonsInAddressBook   = new ArrayList<>();
}
