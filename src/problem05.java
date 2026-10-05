import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem05 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> taskList = new ArrayList<>();

    menu(scanner, taskList);

    scanner.close();
  }

  private static void menu(Scanner scanner, List<String> taskList) {
    int action;

    do {

      System.out.println("1 - Add task");
      System.out.println("2 - Update task");
      System.out.println("3 - Delete task");
      System.out.println("4 - List all tasks");
      System.out.println("0 - Exit");

      action = scanner.nextInt();

      switch (action) {
        case 1:
          addTask(scanner, taskList);
          break;
        case 2:
          updateTask(scanner, taskList);
          break;
        case 3:
          deleteTask(scanner, taskList);
          break;
        case 4:
          showTasks(taskList);
          break;
      }

    }while (action != 0) ;
  }

  private static void updateTask(Scanner scanner, List<String> taskList) {
    scanner.nextLine();
    System.out.println("Enter task name");
    String name = scanner.nextLine();
    int resultSearch = searchTask(taskList, name);

    if (resultSearch == -1)
      System.out.println("Invalid task name");
    else{
      System.out.println("Updated task name: ");
      String updatedName = scanner.nextLine();
      taskList.set(resultSearch, updatedName);
    }
  }

  private static void deleteTask(Scanner scanner, List<String> taskList) {
    scanner.nextLine();
    System.out.println("Enter task name");
    String name = scanner.nextLine();

    int resultSearch = searchTask(taskList, name);

    if (resultSearch == -1)
      System.out.println("Invalid task name");
    else {
      taskList.remove(resultSearch);
    }

  }

  private static void addTask(Scanner scanner, List<String> listTask) {
    scanner.nextLine();
    System.out.print("Enter task name: ");
    String name = scanner.nextLine();
    listTask.add(name);
    System.out.println("Task added successfully");
  }

  private static void showTasks(List<String> listTask) {
    for (String task : listTask) {
      System.out.println(task);
    }
  }

  private static int searchTask(List<String> listTask, String name) {
    if (listTask.contains(name))
      return listTask.indexOf(name);
    else
      return -1;
  }

}


