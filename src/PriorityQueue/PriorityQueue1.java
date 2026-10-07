package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

class TaskComparator implements Comparator<Task> {
	
	@Override
	public int compare(Task t1, Task t2) {
		int task = Integer.compare(t1.getPriority(), t2.getPriority());
		
		return (task != 0) ? task : Integer.compare(t1.getId(), t2.getId());
	}
}

class Task {
	
	private int id, priority;
	private String name;
	
	public Task(int id, String name, int priority) {
		this.id = id;
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
	
	@Override
	public String toString() {
		return priority + " | " + id + " | " + name;
	}
}
public class PriorityQueue1 {

	public static void main(String[] args) {
		
		Task t1 = new Task(101, "Backup Database", 3);
		Task t2 = new Task(102, "Server Down", 1);
		Task t3 = new Task(103, "Genrate Report", 2);
		Task t4 = new Task(104, "Security Alert", 1);
		Task t5 = new Task(105, "Send Email", 3);
		
		TaskComparator tsk = new TaskComparator();
		
		PriorityQueue<Task> task = new PriorityQueue<>(tsk); 
		
		task.add(t1);
		task.add(t2);
		task.add(t3);
		task.add(t4);
		task.add(t5);
		
		while(!task.isEmpty()) {
			System.out.println(task.poll());
		}
	}

}
