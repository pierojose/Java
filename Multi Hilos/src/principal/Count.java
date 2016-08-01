package principal;

class Count extends Thread
{
	Count (String name) {
		  super(name);
		  start();
	}
	
	public void run() {
		  System.out.println(getName() + " Iniciando.");
		  try {
		    for(int count=0; count < 10; count++) {
		      Thread.sleep(400);
		      System.out.println("En " + getName() +
		                         ", contando es " + count);
		    }
		  }
		  catch(InterruptedException exc) {
		    System.out.println(getName() + " interrumpido.");
		  }
		  System.out.println(getName() + " terminando.");
	}
	
	class ExtendThread {
		  public void main(String args[]) {
		    System.out.println("Hilo principal iniciado.");
		    Count mt = new Count("Hijo #1");
		    for(int i=0; i < 50; i++) {
		      System.out.print(".");
		      try {
		        Thread.sleep(100);
		      }
		      catch(InterruptedException exc) {
		        System.out.println("Hilo principal interrumpido.");
		      }
		    } 
		    System.out.println("Hilo principal finalizado.");
		  }
	}
	
}