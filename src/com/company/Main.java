package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String choice;
        String name = "";
        String code = "";
        List<Worker> workersList = new ArrayList<Worker>();
        Scanner sc = new Scanner(System.in);
        String quiter = "no";

        while (quiter.equals("no")) {

            choice = menu();

            if (choice.equals("1")) {


                System.out.println("Please enter name");

                name = sc.next();

                System.out.println("Please enter workers code");

                code = sc.next();

                Worker worker = new Worker(name, code);

                workersList.add(worker);

                System.out.println("Worker added succesfuly.");

                System.out.println("Do you wanna quit ? yes or no");

                quiter = sc.next();


            }

            if (choice.equals("2")) {

                for (int i = 0; i < workersList.size(); i++) {
                    System.out.println(workersList.get(i).toString());
                }

                System.out.println("Do you wanna quit ? yes or no");

                quiter = sc.next();

            }

            if (choice.equals("3")) {

                String command = "";

                Worker worker = new Worker();

                System.out.println("Type workers code.");

                String workcode = sc.next();

                for (Worker selectedWorker : workersList) {
                    if (selectedWorker.getWorkerCode().equals(workcode)) {
                        worker = selectedWorker;


                        DateInfo dateInfo = new DateInfo();

                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                        String timestamp  = dateFormat.format(new Date());
                        dateInfo.setDate(timestamp);


                        System.out.println("Is he at work ? yes or no");

                        command = sc.next();

                        if (command.equals("yes")) {
                            dateInfo.setPresence(true);
                        } else {
                            dateInfo.setPresence(false);
                        }

                        if (worker.getMyList() == null) {
                            List<DateInfo> myList = new ArrayList<>();
                            worker.setMyList(myList);
                            worker.getMyList().add(dateInfo);
                        } else {
                            worker.getMyList().add(dateInfo);
                        }


                        System.out.println("Worker checked succesfuly.");

                        System.out.println("Do you wanna quit ? yes or no");

                        quiter = sc.next();
                    }
                }


            }

            if (choice.equals("4")) {

                String date = "";
                String decision = "";

                Worker worker = new Worker();

                System.out.println("Type workers code.");

                String workcode = sc.next();

                for (Worker selectedWorker : workersList) {
                    if (selectedWorker.getWorkerCode().equals(workcode)) {
                        worker = selectedWorker;

                        System.out.println("Type a date which you want to edit in format: dd-MM-yyyy ");

                        date = sc.next();

                        List<DateInfo> presenceList = worker.getMyList();

                        for (DateInfo selectedDate : presenceList) {
                            if (selectedDate.getDate().equals(date)) {
                                System.out.println("Change to yes or no");

                                decision = sc.next();

                                if (decision.equals("yes")) {
                                    selectedDate.setPresence(true);
                                }
                                if (decision.equals("no")) {
                                    selectedDate.setPresence(false);
                                }

                            }
                        }
                    }
                }
                System.out.println("Presence changed succesfuly.");
                System.out.println("Do you wanna quit ? yes or no");

                quiter = sc.next();


            }

            if (choice.equals("5")) {

                String date = "";
                String decision = "";

                Worker worker = new Worker();

                System.out.println("Type workers code.");

                String workcode = sc.next();

                for (Worker selectedWorker : workersList) {
                    if (selectedWorker.getWorkerCode().equals(workcode)) {
                        worker = selectedWorker;

                        for(int i = 0; i < worker.getMyList().size(); i++){
                            System.out.println(worker.getMyList().get(i).toString());
                        }
                    }
                }



            }


        }

    }

    public static String menu() {

        String selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Add worker");
        System.out.println("2 - Show list of Workers");
        System.out.println("3 - Type workers code to input presence.");
        System.out.println("4 - If you wish to edit a presence of a given worker");
        System.out.println("5 - Show of given worker by his code his presence list");

        selection = input.next();
        return selection;
    }
}
