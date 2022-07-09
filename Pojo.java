import java.util.*;

public class Pojo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the total actual tasks");
		int taskCount = sc.nextInt();
		Dao taskManager = new Dao(taskCount);

		int choice;
		do
		{
			System.out.println("1 : Add new task");
			System.out.println("2 : Delete the task");
			System.out.println("3 : Update the task");
			System.out.println("4 : Search the task");
			System.out.println("0 : Exit");
			choice = sc.nextInt();

			switch (choice)
			{
				case 1 : 	taskManager.addTask();
							break;

				case 2 : 	taskManager.removeTask();
							break;

				case 3 : 	taskManager.updateTask();
							break;

				case 4 : 	taskManager.searchTask();
							break;
			}
		} while(choice != 0);
	}
}