public class Task
{
	static int taskId;
	public int task_Id;
	public String taskTitle;
	public String taskText;
	public String assignedTo;
		
	public Task(String taskTitle, String taskText, String assignedTo)
	{
		taskId++;
		task_Id = taskId;
		this.taskTitle = taskTitle;
		this.taskText = taskText;
		this.assignedTo = assignedTo;
	}
}