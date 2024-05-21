public class Task implements Comparable<Task> {
    private int id;
    private String name;
    private int priority;

    public Task(int id, String name, int priority) {
        this.id = this.id;
        this.name = name;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        int priorityComparison = Integer.compare(other.priority, this.priority);
        if (priorityComparison == 0) {
            return Integer.compare(this.id, other.id); // Порівнюємо за id, якщо пріоритети рівні
        }
        return priorityComparison;
    }

    public void setId(int id) {
        this.id = id;
    }
}
