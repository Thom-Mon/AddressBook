package de.addressbook.thommon;

import java.util.*;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StartClass {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        Person person1 = new Person("Helga", "Ziller", "Zeni@blowfish.com");
        Person person2 = new Person("Walter", "Ziller", "WutWalter@blowfish.com");
        Person person3 = new Person("Thomas", "Schmitt", "bigtommy@gmx.de");
        Person person4 = new Person("Bertrand", "Esel", "RusselsIhrer@web.de");
        Person person5 = new Person("Hildegard", "Esel", "Zeni@blowfish.com");
        Person person6 = new Person("Humboldt", "Ahrensen", "ZumNorder@web.de");
        Person person7 = new Person("Sascha", "Burgenzell", "WegwerfMail@read.com");
        Person person8 = new Person("Mathilda", "Esel", "Cordl@Love.com");

        AddressBook meineNachbarn = new AddressBook();
        Group mitbewohner = new Group("Mitbewohner");
        Group verwandte = new Group("Verwandte");
        Group ladies = new Group("Ladies");

        //ArrayList<Person> PersonsInAddressBook      = new ArrayList<>();
        //ArrayList<String> FamilyNamesInAddressBook  = new ArrayList<>();

        meineNachbarn.addPersonEntry(person1);
        meineNachbarn.addPersonEntry(person2);
        meineNachbarn.addPersonEntry(person3);
        meineNachbarn.addPersonEntry(person4);
        meineNachbarn.addPersonEntry(person5);
        meineNachbarn.addPersonEntry(person6);
        meineNachbarn.addPersonEntry(person7);
        meineNachbarn.addPersonEntry(person8);

        mitbewohner.addPersonToGroup(person8);
        mitbewohner.addPersonToGroup(person3);
        verwandte.addPersonToGroup(person3);

        meineNachbarn.addGroupEntry(mitbewohner);
        meineNachbarn.addGroupEntry(verwandte);
        meineNachbarn.addGroupEntry(ladies); //diese Gruppe ist zu Testzwecken leer

        System.out.println(meineNachbarn.showNamesCount());
        logger.info(String.valueOf(meineNachbarn.showNamesOccurences()));
        meineNachbarn.showAllElements();
        meineNachbarn.getGroupsInAddressBook();
        meineNachbarn.showGroupsOfPerson(person3);

    }
}