package SingletonPattern;

public class Singleton {
	
	private static Singleton obj=new Singleton();// static � usado para usar a memoria apenas uma vez 
	 
	private Singleton(){} //o construtor � privado para n�o ser instanciado novamente 
	   
	 public static Singleton getSingleton() /* permite que o objeto seja chamado por outras classes*/{  
	  return obj;  
	 }  
	  
	 public void doSomething(){  
		 
	 }  
}
