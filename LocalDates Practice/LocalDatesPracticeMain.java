/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nande
 */
public class LocalDatesPracticeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner uinput = new Scanner(System.in);
//        creatingBootCamp(uinput);
        List<BootCamp> list = creatingBootCamp(uinput);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/yyy");
        System.out.println("Please enter a date");
        String user = uinput.next();
        LocalDate date =  LocalDate.parse(user, formatter);
        checkDates(uinput, list, date);
    }

    public static List creatingBootCamp(Scanner uinput) {
        System.out.println("Please create 3 BootCamps by inserting the following information: ");
        List<BootCamp> bootCampList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.println("Creating BootCamp " + (i + 1) + ": ");
            BootCamp bootcamp = new BootCamp();

            System.out.println("Please insert language name: ");
            bootcamp.setName(uinput.next());
            System.out.println("Please insert starting date (dd/MM/yyyy): ");
            String inputStartDate = uinput.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/yyy");
            LocalDate startDateFromString = LocalDate.parse(inputStartDate, formatter);
            bootcamp.setStartingDate(startDateFromString);
            System.out.println("Please insert ending date (dd/MM/yyyy): ");
            String inputEndDate = uinput.next();
            LocalDate endDateFromString = LocalDate.parse(inputEndDate, formatter);
            bootcamp.setStartingDate(endDateFromString);

            bootCampList.add(bootcamp);

        }
        return bootCampList;
    }

    public static void checkDates(Scanner uinput, List<BootCamp> list, LocalDate date) {
        System.out.println("Please enter a date (dd/MM/yyyy): ");
        String userDateFromString = uinput.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/yyy");
        LocalDate dateFromString = LocalDate.parse(userDateFromString, formatter);
        int pointer = 0;
        for (BootCamp camp : list) {
            if (date.isAfter(camp.getStartingDate()) && date.isBefore(camp.getEndingDate())) {
                pointer++;
                if (pointer == 1){
                System.out.println("The BootCamps available at " + date + " are:");
                }
                System.out.println(camp);
            } else {
                System.out.println("There are no BootCamps available in " + date + ":");
            }

        }
    }

}
