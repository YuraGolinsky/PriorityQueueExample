# PriorityQueueExample
PriorityQueueExample


Руководство пользователя программного обеспечения Приоритетная очередь
Описание программы:
Программа "Приоритетная очередь" позволяет управлять очередью задач с разными приоритетами. Задачи с высшим приоритетом обрабатываются первыми. Пользователь может добавлять новые задачи, просматривать задачи с высоким приоритетом, удалять задачи, обновлять приоритеты, сохранять очередь в файл и загружать ее из файла.
Java – это мощный, объектно-ориентированный язык программирования, разработанный компанией Sun Microsystems (сейчас собственность Oracle Corporation). Она известна своей простотой использования, надежностью и переносимостью кода. Вот некоторые ключевые особенности Java:
Объектно-ориентированная: в Java все есть объект, каждый объект имеет свои свойства и методы.
Платформонезависимые: приложения на Java компилируются в байт-код, который выполняется на виртуальной машине Java (JVM), что позволяет им работать на любой платформе, где есть JVM.
Автоматическое управление памятью: Java автоматически производит сборку мусора, что позволяет разработчикам не следить за выделением и освобождением памяти.
Многопоточность: язык имеет встроенную поддержку для создания и управления потоками выполнения, что позволяет создавать эффективные многопоточные программы.
Безопасность Java имеет встроенную систему безопасности, которая обеспечивает безопасную виртуализацию среды выполнения.

Инструкция
1.Сложение задачи:
В меню выберите пункт "Добавить задание".
Введите имя задания.
Введите приоритет задачи в виде целого числа.
Задача будет добавлена в очередь.

2.Просмотр задачи с высоким приоритетом:
Выберите "Просмотр задач с наивысшим приоритетом" в меню.
Программа покажет название задачи с самым высоким приоритетом.

3.Удаление задачи с наивысшим приоритетом:
Выберите меню "Удалить задачи с самым высоким приоритетом".
Программа удалит и покажет название задачи с самым высоким приоритетом.

4.Обновление приоритета задачи:
Выберите меню "Обновить приоритет задачи".
Введите ID задачи, которую необходимо обновить.
Введите новый приоритет для задания.
Приоритет данной задачи будет обновлен.

5.Удаление задания по ID:
Выберите меню "Удалить задание по ID".
Введите ID задачи, которую необходимо удалить.
Задание будет удалено из очереди.

6.Сохранение в файл:
Выберите меню "Сохранить в файл".
Введите имя файла для сохранения.
Все задачи будут сохранены в указанный файл в формате "ID: <id> Задание: <название> Приоритет: <приоритет>".

7.Загрузка из файла:
Выберите "Загрузить из файла" в меню.
Введите имя загрузочного файла.
Задания будут загружены из указанного файла.

8.Показ задания из файла:
Выберите меню "Показать задачу из файла".
Информация о задачах, сохраненных в файле, будет выведена на экран.

9.Помощь:
Выберите "Помощь" в меню.
Программа предоставит краткое описание каждой опции меню.

10.Выход из программы:
Выберите "Выйти" в меню.
Программа завершит свою работу.

PriorityQueueExample, используемый в классе
Класс PriorityQueueExample – это основной класс программы, содержащий метод main и реализующий взаимодействие с приоритетной очередью. В этом классе пользователь может взаимодействовать с очередью, добавлять, удалять, обновлять и просматривать задачи.
В классе PriorityQueueExample объекты классов PriorityQueue и Task создаются для взаимодействия с приоритетной очередью. Методы класса PriorityQueue вызываются для реализации операций с очередью, таких как добавление, удаление и обновление задач, а класс Task используется для представления самой задачи.
PriorityQueue, используемый в классе
Класс PriorityQueue – это класс, реализующий приоритетную очередь. Он содержит методы для добавления задач в очереди, удаления задач с наивысшим приоритетом, обновления приоритета существующей задачи, а также сохранения и загрузки очереди из файла. В этом классе используется класс Task.
Этот класс отвечает за реализацию приоритетной очереди.
Используется для добавления, удаления, обновления приоритета и работы с задачами.
Содержит методы работы с очередью, такие как push, pop, peek, updatePriority, removeById, saveToFile, loadFromFile и displayTasksFromFile.
Task используемый в классе
Класс Task – это класс, представляющий конкретную задачу. Он содержит информацию о названии задачи, его приоритете и уникальном идентификаторе (ID). Класс Task реализует интерфейс Comparable для сравнения задач по их приоритетам.
Этот класс представляет конкретную задачу в очереди.
Используется для хранения информации о названии задачи, ее приоритете и уникальном идентификаторе (ID).
Реализуется интерфейс Comparable для сравнения задач по их приоритетам.



Как работает программа
Photos of how the works

Добавление задачи
Adding a task

![image](https://github.com/YuraGolinsky/PriorityQueueExample/assets/134283897/2e28f272-8b62-409c-8158-56817c407262)

Удаление задачи и сохранение файла и ввод информации из файла
Deleting a task and saving a file and entering information from a file

![image](https://github.com/YuraGolinsky/PriorityQueueExample/assets/134283897/104b39e7-9bb5-4f61-83cb-7298bde6a703)

Сохранение данных в файл и помощь
Дополнительные данные для файла и Help

![image](https://github.com/YuraGolinsky/PriorityQueueExample/assets/134283897/307f50e0-7b1e-4ac0-9bbf-44267cc5c03e)

![image](https://github.com/YuraGolinsky/PriorityQueueExample/assets/134283897/b5acb362-bb71-4e62-ab4c-db11a921a5d9)

Как выглядит информация в файле
What the information в the file looks like

![image](https://github.com/YuraGolinsky/PriorityQueueExample/assets/134283897/ee9e3861-a42c-40a0-a6dc-5c8671c67f5d)

Удаление через ID задачи
Сначала нужно удалить через ID задачу
Нужно скачать из файла
Затем показать задание из файла
Затем сохранение файла
Затем выйти из программы
И запустить текстовый документ и проверить, удалось ли все.


First you need to delete via task ID
You need to download from a file
Then show the task from the file
Then save the file
Then exit the program
And run the text document and check if everything was successful.
Delete by task ID

![image](https://github.com/YuraGolinsky/PriorityQueueExample/assets/134283897/415216a5-cdcb-48e2-86a8-a8c33e616bc8)

![image](https://github.com/YuraGolinsky/PriorityQueueExample/assets/134283897/79aa1d29-fb53-4b0d-a588-1cfe15365df5)


Результат после удаления задания
The result after deleting the task

![image](https://github.com/YuraGolinsky/PriorityQueueExample/assets/134283897/1d1282fd-5970-46e0-8842-c820cbb5afa2)









Software User's Guide Priority Queue
Program description:
The Priority Queue program allows you to manage a queue of tasks with different priorities. Tasks with the highest priority are processed first. The user can add new tasks, view high priority tasks, delete tasks, update priorities, save the queue to a file and load it from a file.
Java is a powerful, object-oriented programming language developed by Sun Microsystems (now owned by Oracle Corporation). It is known for its ease of use, reliability, and code portability. Here are some key features of Java:
Object Oriented: In Java, everything is an object, each object has its own properties and methods.
Platform independent: Java applications are compiled into bytecode that runs on the Java Virtual Machine (JVM), allowing them to run on any platform that has a JVM.
Automatic memory management: Java automatically performs garbage collection, which eliminates the need for developers to have to worry about memory allocation and deallocation.
Multithreading: The language has built-in support for creating and managing threads of execution, allowing you to create efficient multithreaded programs.
Security Java has built-in security that enables secure virtualization of the runtime environment.

Instructions
1. Addition of the problem:
Select "Add task" from the menu.
Enter a job name.
Enter the priority of the task as an integer.
The task will be added to the queue.

2.View a high priority task:
Select "View highest priority tasks" from the menu.
The program will show the name of the task with the highest priority.

3.Deleting a task with the highest priority:
Select the "Delete highest priority tasks" menu.
The program will delete and show the name of the task with the highest priority.

4.Updating task priority:
Select the "Update task priority" menu.
Enter the ID of the task you want to update.
Enter a new priority for the job.
The priority of this task will be updated.

5.Deleting a task by ID:
Select the "Delete task by ID" menu.
Enter the ID of the task you want to delete.
The job will be removed from the queue.

6.Saving to file:
Select the "Save to File" menu.
Enter a file name to save.
All tasks will be saved to the specified file in the format "ID: <id> Task: <name> Priority: <priority>".

7.Loading from file:
Select "Load from File" from the menu.
Enter the name of the boot file.
The tasks will be loaded from the specified file.

8. Showing a task from a file:
Select the "Show task from file" menu.
Information about tasks saved in the file will be displayed on the screen.

9.Help:
Select "Help" from the menu.
The program will provide a brief description of each menu option.

10.Exit the program:
Select "Sign Out" from the menu.
The program will terminate.








PriorityQueueExample used in the class
The PriorityQueueExample class is the main class of the program, which contains the main method and implements interaction with the priority queue. In this class, the user can interact with the queue, add, delete, update, and view jobs.
In the PriorityQueueExample class, objects of the PriorityQueue and Task classes are created to interact with the priority queue. The methods of the PriorityQueue class are called to implement queue operations such as adding, deleting, and updating tasks, and the Task class is used to represent the task itself.
PriorityQueue used in the class
The PriorityQueue class is a class that implements a priority queue. It contains methods for adding tasks to a queue, removing tasks with the highest priority, updating the priority of an existing task, and saving and loading the queue from a file. This class uses the Task class.
This class is responsible for implementing the priority queue.
Used to add, delete, update priority, and work with tasks.
Contains methods for working with the queue, such as push, pop, peek, updatePriority, removeById, saveToFile, loadFromFile, and displayTasksFromFile.
Task used in the class
The Task class is a class that represents a specific task. It contains information about the task name, its priority, and a unique identifier (ID). The Task class implements the Comparable interface for comparing tasks by their priorities.
This class represents a specific task in the queue.
It is used to store information about the name of the task, its priority and unique identifier (ID).
Implements the Comparable interface for comparing tasks by their priorities.
