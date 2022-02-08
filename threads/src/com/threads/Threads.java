package com.threads;

public class Threads implements Runnable
{
	 public static int myCount = 0;
	    public Threads()
	    {
	         
	    }
	    public void run() {
	        while(Threads.myCount <= 10){
	            try{
	                System.out.println("Expl Thread: "+(++Threads.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex) {
	                System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	    } 
	    public static void main(String a[]){
	        System.out.println("Starting Main Thread...");
	     Threads mrt = new Threads();
	        Thread t = new Thread(mrt);
	        t.start();
	        while(Threads.myCount <= 10){
	            try{
	                System.out.println("Main Thread: "+(++Threads.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex){
	                System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	        }
	        System.out.println("End of Main Thread...");
	    }
	}


