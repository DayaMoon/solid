package edu.endava.multithreads;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MyBasicThreadPoolExecutorExample
{
    public static void main(String[] args)
    {
        //Use the executor created by the newCachedThreadPool() method
        //only when you have a reasonable number of threads
        //or when they have a short duration.
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        for (int i = 0; i <= 10; i++)
        {
            Task task = new Task("Task " + i);
            System.out.println("A new task has been added : " + task.getName());
            executor.submit(task);
        }
        executor.shutdown();



        System.out.println("other style:");
        ExecutorService threadPool = Executors.newScheduledThreadPool(4);
        ThreadPoolExecutor executor2 = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        CompletionService<String> pool = new ExecutorCompletionService<String>(threadPool);

        for(int i = 0; i <= 10; i++){
           pool.submit(new Task("Task " + i));
        }
        for(int i = 0; i < 10; i++){
      	 /* try
			{
				System.out.println( pool.take().get().toString() );
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (ExecutionException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
        }

    }
}