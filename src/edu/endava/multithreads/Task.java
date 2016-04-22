package edu.endava.multithreads;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

class Task implements Callable//Runnable
{
    private String name;

    public Task(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

	@Override
	public Long call()
	{
		 Long duration = null;
		try
      {
			duration = (long) (Math.random() * 10);
          System.out.println("Doing a task during : " + name);
          TimeUnit.SECONDS.sleep(duration);
      }
      catch (InterruptedException e)
      {
          e.printStackTrace();
      }
		return duration;
	}

   /* @Override
    public void run()
    {
        try
        {
            Long duration = (long) (Math.random() * 10);
            System.out.println("Doing a task during : " + name);
            TimeUnit.SECONDS.sleep(duration);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }*/
}