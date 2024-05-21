import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;

public class PriorityQueueExample {
    private static final String FILE_NAME = "tasks.txt"; // Ім'я файлу для зберігання завдань
    private static int id;

    public static void main(String[] args) {
        // Створення пріоритетної черги
        PriorityQueue pq = new PriorityQueue();

        // Завантаження завдань з файлу
        try {
            pq.loadFromFile(FILE_NAME);
        } catch (IOException e) {
            System.out.println("Помилка завантаження з файлу: " + e.getMessage());
        }

        // Введення даних від користувача
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("1. Додати завдання");
                System.out.println("2. Переглянути завдання з найвищим пріоритетом");
                System.out.println("3. Видалити завдання з найвищим пріоритетом");
                System.out.println("4. Оновити пріоритет завдання");
                System.out.println("5. Видалити завдання за ID");
                System.out.println("6. Зберегти в файл");
                System.out.println("7. Завантажити з файлу");
                System.out.println("8. Показати завдання з файлу");
                System.out.println("9. Допомога");
                System.out.println("10. Вийти");
                System.out.print("Оберіть опцію: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Споживаємо новий рядок

                switch (choice) {
                    case 1:
                        System.out.print("Введіть назву завдання: ");
                        String name = scanner.nextLine();
                        System.out.print("Введіть пріоритет завдання (ціле число): ");
                        int priority = scanner.nextInt();
                        pq.push(new Task(id, name, priority));
                        break;
                    case 2:
                        Task topTask = pq.peek();
                        if (topTask != null) {
                            System.out.println("Завдання з найвищим пріоритетом: " + topTask.getName());
                        } else {
                            System.out.println("Черга порожня.");
                        }
                        break;
                    case 3:
                        Task removedTask = pq.pop();
                        if (removedTask != null) {
                            System.out.println("Видалено завдання: " + removedTask.getName());
                        } else {
                            System.out.println("Черга порожня.");
                        }
                        break;
                    case 4:
                        System.out.print("Введіть ID завдання для оновлення: ");
                        int taskId = scanner.nextInt();
                        System.out.print("Введіть новий пріоритет (ціле число): ");
                        int newPriority = scanner.nextInt();
                        pq.updatePriority(taskId, newPriority);
                        break;
                    case 5:
                        System.out.print("Введіть ID завдання для видалення: ");
                        int deleteId = scanner.nextInt();
                        pq.removeById(deleteId);
                        break;
                    case 6:
                        try {
                            pq.saveToFile(FILE_NAME);
                            System.out.println("Чергу збережено у файл " + FILE_NAME);
                        } catch (IOException e) {
                            System.out.println("Помилка збереження у файл: " + e.getMessage());
                        }
                        break;
                    case 7:
                        try {
                            pq.loadFromFile(FILE_NAME);
                            System.out.println("Чергу завантажено з файлу " + FILE_NAME);
                        } catch (IOException e) {
                            System.out.println("Помилка завантаження з файлу: " + e.getMessage());
                        }
                        break;
                    case 8:
                        pq.displayTasksFromFile(FILE_NAME);
                        break;
                    case 9:
                        printHelp();
                        break;
                    case 10:
                        System.out.println("Вихід з програми.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Невірна опція. Спробуйте ще раз.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Помилка введеня. Будь ласка, введіть правильні дані.");
                scanner.nextLine(); // Скидання сканера
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }// Функція для друку підказок
    private static void printHelp() {
        System.out.println("\nДопомога:");
        System.out.println("1. Додати завдання - додає нове завдання до черги. Необхідно ввести назву завдання та його пріоритет (ціле число).");
        System.out.println("2. Переглянути завдання з найвищим пріоритетом - показує завдання з найвищим пріоритетом без його видалення.");
        System.out.println("3. Видалити завдання з найвищим пріоритетом - видаляє та показує завдання з найвищим пріоритетом.");
        System.out.println("4. Оновити пріоритет завдання - змінює пріоритет існуючого завдання. Необхідно ввести ID завдання та новий пріоритет.");
        System.out.println("5. Видалити завдання за ID - видаляє завдання за його ідентифікатором.");
        System.out.println("6. Зберегти в файл - зберігає всі завдання в текстовий файл у форматі \"ID: <id> Завдання: <назва> Пріоритет: <пріоритет>\". Необхідно ввести ім'я файлу.");
        System.out.println("7. Завантажити з файлу - завантажує завдання з текстового файлу у форматі \"ID: <id> Завдання: <назва> Пріоритет: <пріоритет>\". Необхідно ввести ім'я файлу.");
        System.out.println("8. Показати завдання з файлу - виводить інформацію про завдання збережені в файлі.");
        System.out.println("9. Допомога - показує цю інформацію.");
        System.out.println("10. Вийти - вихід з програми.\n");
    }
}
