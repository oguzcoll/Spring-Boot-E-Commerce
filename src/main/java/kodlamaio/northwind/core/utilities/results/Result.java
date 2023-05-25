package kodlamaio.northwind.core.utilities.results;

public class Result {
	private boolean succces;
	private String message;
	
	public Result(boolean success) {
		this.succces = success;
	}
	
   public Result(boolean success,String message) {
	   this(success);
	   this.message=message;
	}
   
   public boolean isSuccess() {
	   return this.succces;
   }
   
   public String  getMessage() {
	   return this.message;
   }
}
