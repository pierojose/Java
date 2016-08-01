package principal;

public class main {

	public static void main(String[] args) {
	    
		System.out.println("Hilo principal inicializando.");
	    
		Priority mt1 = new Priority("Hijo #1");
		Priority mt2 = new Priority("Hijo #2");
	    Priority mt3 = new Priority("Hijo #3");
	    
	    mt1.thrd.setPriority(Thread.MAX_PRIORITY);
	    mt2.thrd.setPriority(Thread.MAX_PRIORITY);
	    mt3.thrd.setPriority(Thread.MAX_PRIORITY);
	    
	    mt1.thrd.start();
	    mt2.thrd.start();
	    mt3.thrd.start();
	    
	    try {
	      mt1.thrd.join();
	      mt2.thrd.join();
	      mt3.thrd.join();
	    }
	    catch(InterruptedException exc) {
	      System.out.println("Hilo principal interrumpido.");
	    }
	    System.out.println("\nPrioridad Alto hilo contando a " +
	                       mt1.count);
	    System.out.println("Prioridad Bajo hilo contando a " +
	                       mt2.count);
	    System.out.println("Prioridad Normal hilo contando a " +
                mt2.count);
	    /*do {
	        System.out.print(".");
	        try {
	          Thread.sleep(100);
	        }
	        catch(InterruptedException exc) {
	          System.out.println("Hilo principal interrumpido.");
	        }
	      }while (mt1.isAlive() || mt2.isAlive() || mt3.isAlive());
	     
	    System.out.println("Hilo principal finalizado.");*/
	}

}
