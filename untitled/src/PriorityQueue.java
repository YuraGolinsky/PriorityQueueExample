import java.io.*;
import java.util.*;

public class PriorityQueue {
    private Map<Integer, Task> queue;
    private int nextId; // Змінна для збереження наступного доступного id

    public PriorityQueue() {
        queue = new HashMap<>();
        nextId = 1; // Починаємо з id = 1
    }

    public void push(Task task) {
        task.setId(nextId++); // Присвоюємо новому завданню наступний id та збільшуємо наступний id
        queue.put(task.getId(), task);
    }

    public Task pop() {
        if (queue.isEmpty()) {
            return null;
        }
        Task task = peek();
        queue.remove(task.getId());
        return task;
    }

    public Task peek() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.values().stream().max(Task::compareTo).get();
    }

    public void updatePriority(int id, int newPriority) {
        Task task = queue.get(id);
        if (task != null) {
            task.setPriority(newPriority);
        }
    }

    public void removeById(int id) {
        queue.remove(id);
    }

    public void saveToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Task task : queue.values()) {
                writer.write("ID: " + task.getId() + " Завдання: " + task.getName() + " Пріоритет: " + task.getPriority());
                writer.newLine();
            }
        }
    }

    public void loadFromFile(String filename) throws IOException {
        queue.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("ID: | Завдання: | Пріоритет: ");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[1]);
                    String name = parts[2];
                    int priority = Integer.parseInt(parts[3]);
                    queue.put(id, new Task(id, name, priority));
                }
            }
        }
    }

    public void displayTasksFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
