package problem05;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class problem05 {
  static String pathFile = "src/problem05/taskList.txt";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> taskList = readFile();

    menu(scanner, taskList);

    scanner.close();
  }

  private static void menu(Scanner scanner, ArrayList<String> taskList) {
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

  private static void updateTask(Scanner scanner, ArrayList<String> taskList) {
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
      saveTaskList(taskList);
    }
  }

  private static void deleteTask(Scanner scanner, ArrayList<String> taskList) {
    scanner.nextLine();
    System.out.println("Enter task name");
    String name = scanner.nextLine();

    int resultSearch = searchTask(taskList, name);

    if (resultSearch == -1)
      System.out.println("Invalid task name");
    else {
      taskList.remove(resultSearch);
      saveTaskList(taskList);
    }
  }

  private static void addTask(Scanner scanner, ArrayList<String> listTask) {
    scanner.nextLine();
    System.out.print("Enter task name: ");
    String name = scanner.nextLine();
    listTask.add(name);
    saveTaskList(listTask);
    System.out.println("Task added successfully");
  }

  private static void showTasks(ArrayList<String> listTask) {
    for (String task : listTask) {
      System.out.println(task);
    }
  }

  private static int searchTask(ArrayList<String> listTask, String name) {
    if (listTask.contains(name))
      return listTask.indexOf(name);
    else
      return -1;
  }

  private static void saveTaskList(ArrayList<String> taskList) {
    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFile))) {
      for (String item : taskList) {
        bufferedWriter.write(item);
        bufferedWriter.newLine();
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  private static ArrayList<String> readFile() {
    ArrayList<String> taskList = new ArrayList<>();

    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile))) {
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        taskList.add(line);
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }

    return taskList;
  }

}


