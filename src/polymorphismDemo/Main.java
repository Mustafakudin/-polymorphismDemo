package polymorphismDemo;

public class Main {

	public static void main(String[] args) {

		//EmailLogger logger = new EmailLogger() ;
		//logger.Log("Log message ");
		
		BaseLogger[] loggers=new BaseLogger[]{new DatabaseLogger(),new FileLogger(),new EmailLogger()};
		//hepsi bir baselogger extends oldugu için rahat rahat new data new file diyebiliyoruz
		for(BaseLogger logger:loggers) {
			logger.log("Log mesaji");
		}
	}

}
