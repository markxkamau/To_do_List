package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        Collection<Task> collection = new ArrayList<>();
        HashMap<String, String> tasks = new HashMap<>();
        System.out.println("How many tasks do you have at the moment?");
        int task_count = scan.nextInt();
        for (int i = 0; i < task_count; i++) {
            System.out.println("What would you like to name the task?");
            String taskName = scan.nextLine();
            System.out.println("What date are you planning to finish the task? (dd/mm/yyyy)");
            String taskDeadline = scan.nextLine();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter.parse(taskDeadline);
            Task task = new Task(i, taskName, date, false);
            collection.add(task);
        }
        String confirmation = "";
        if (collection.size() != 7) {
            System.out.println("Tasks have turned out imbalanced to the days available\n You will have to assign the tasks to specific days\nTo go on with it press 'y' otherwise we can randomly assign");
            confirmation = scan.next();
        }

        switch (confirmation.toLowerCase()) {
            case "y":
                int count = 1;
                for (Task item : collection) {
                    System.out.println(item.getTask_name() + ", When do wish to perform the task?");
                    Day day = new Day();
                    for (String s : day.getDays()) {
                        System.out.println(count + "\t" + s);
                        count++;
                    }
                    count = 1;
                    int index = scan.nextInt();
                    Day declaredDay = new Day(index - 1, item.getTask_id());
                    System.out.println(declaredDay);
                    tasks.put(item.getTask_name(), declaredDay.toString());
                }
                break;
            default:
                Random random = new Random();
                int index = random.nextInt(6);
                for (Task item : collection) {
                    Day day = new Day(index, item.getTask_id());
                    tasks.put(item.getTask_name(), day.toString());
                    index = random.nextInt(6);
                }
                break;
        }

        for (Task item : collection) {
            System.out.println(tasks.get(item.getTask_name()) );
        }

    }
}