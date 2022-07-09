import java.util.*;

public class Dao
{
	Task[] tasks;
	int maxLimit;
	int current;
	Scanner sc;
	public Dao(int n)
	{
		this.current = 0;
		this.maxLimit = n;
		this.tasks = new Task[n];
		sc = new Scanner(System.in);
	}

	public void addTask()
	{
		if (current == maxLimit)
		{
			System.out.println("maximum limit reached");
			return;
		}

		System.out.println("Enter the task title");
		String taskTitle = sc.nextLine();

		System.out.println("Enter the task text");
		String taskText = sc.nextLine();

		System.out.println("Enter the assignee");
		String assignedTo = sc.nextLine();

		Task newTask = new Task(taskTitle, taskText, assignedTo);

		this.tasks[current] = newTask;
		current++;
	}

	public void updateTask()
	{
		System.out.println("Enter the task title to update");
		String taskTitle = sc.nextLine();

		int index = this.Search(taskTitle);

		if (index != -1)
		{
			System.out.println("Enter the updated task title to");
			String updatedtaskTitle = sc.nextLine();
			System.out.println("Enter updated task text");
			String taskText = sc.nextLine();

			System.out.println("Enter the assignee");
			String assignedTo = sc.nextLine();

			tasks[index].taskTitle = updatedtaskTitle;
			tasks[index].taskText = taskText;
			tasks[index].assignedTo = assignedTo;
			System.out.println("Task Updated successfully");
			
		}
		else
		{
			System.out.println("Invalid Task Name");
		}
	}

	public void removeTask()
	{
		System.out.println("Enter the task title to be removed");
		String taskTitle = sc.nextLine();

		int index = this.Search(taskTitle);
		if (index != -1)
		{
			for (int i = index; i < current-1; i++)
				tasks[i] = tasks[i+1];
			current--;

			System.out.println("Task Removed successfully");
		}
		else
		{
			System.out.println("Invalid Task Name");
		}

	}

	public int Search(String taskTitle)
	{
		for (int i = 0; i < this.current; i++)
		{
			if (tasks[i].taskTitle.equals(taskTitle))
				return i;
		}
		return -1;
	}

	public void searchTask()
	{
		System.out.println("Enter the task title to search");
		String taskTitle = sc.nextLine();

		int index = this.Search(taskTitle);

		if (index == -1)
		{
			System.out.println("Invalid task name");
		}
		else
		{
			System.out.println("Task Id " + tasks[index].task_Id);
			System.out.println("Task Title " + tasks[index].taskTitle);
			System.out.println("Task Text " + tasks[index].taskText);
			System.out.println("Task assigned to " + tasks[index].assignedTo);
		}
	}
}