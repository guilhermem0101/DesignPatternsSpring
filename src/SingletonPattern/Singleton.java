package SingletonPattern;

public class Singleton {
	
	private static Singleton obj=new Singleton();// static é usado para usar a memoria apenas uma vez 
	 
	private Singleton(){} //o construtor é privado para não ser instanciado novamente 
	   
	 public static Singleton getSingleton() /* permite que o objeto seja chamado por outras classes*/{  
	  return obj;  
	 }  
	  
	 public void doSomething(){  
		 
	 }  
}
