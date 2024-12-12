package org.example;
import java.util.Random;
import java.util.Scanner;



      public class NegativeElementsFinder {
          public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              Random random = new Random();
              boolean continueProgram;

              do {
                  System.out.println("Введите количество строк массива: ");
                  int rows = scanner.nextInt();
                  System.out.println("Введите количество столбцов массива: ");
                  int cols = scanner.nextInt();

                  // Создание и заполнение двумерного массива
                  int[][] array = new int[rows][cols];
                  for (int i = 0; i < rows; i++) {
                      for (int j = 0; j < cols; j++) {
                          array[i][j] = random.nextInt(101) - 50; // Генерация значения от -50 до 50
                      }
                  }

                  // Вывод двумерного массива
                  System.out.println("Сгенерированный массив:");
                  for (int[] row : array) {
                      for (int value : row) {
                          System.out.printf("%3d ", value);
                      }
                      System.out.println();
                  }

                  // Запрос числа у пользователя
                  System.out.println("Введите число для проверки условия: ");
                  int conditionalNumber = scanner.nextInt();

                  // Поиск отрицательных элементов, сумма индексов которых равна conditionalNumber
                  int count = 0;
                  System.out.println("Негативные элементы и их положения:");
                  for (int i = 0; i < rows; i++) {
                      for (int j = 0; j < cols; j++) {
                          if (array[i][j] < 0 && (i + j) == conditionalNumber) {
                              System.out.printf("Элемент: %3d, Положение: [%d, %d]%n", array[i][j], i, j);
                              count++;
                          }
                      }
                  }

                  // Вывод результата
                  System.out.printf("Количество отрицательных элементов с суммой индексов %d: %d%n", conditionalNumber, count);

                  // Запрос на продолжение работы программы
                  System.out.println("Хотите продолжить? (да/нет)");
                  String response = scanner.next();
                  continueProgram = response.equalsIgnoreCase("да");
              } while (continueProgram); // Цикл продолжает работу, пока пользователь отвечает "да"

              scanner.close();
              System.out.println("Завершение работы программы.");

          }
      }





