package AutoMotori;

public class Car  {
		
		private String mark;
		private String model;
		private int topSpeed;
		Mootori engine;
		Ajaja driver;
		
		public Car() {
			super();
		}
		
		public Car(String mark, String model, int topSpeed, Mootori engine,
				Ajaja driver) {
			super();
			this.mark = mark;
			this.model = model;
			this.topSpeed = topSpeed;
			this.engine = engine;
			this.driver = driver;
		}
		
		public String getMark() {
			return mark;
		}
		public void setMark(String mark) {
			this.mark = mark;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public int getTopSpeed() {
			return topSpeed;
		}
		public void setTopSpeed(int topSpeed) {
			this.topSpeed = topSpeed;
		}
		public Mootori getEngine() {
			return engine;
		}
		public void setEngine(Mootori engine) {
			this.engine = engine;
		}
		public Ajaja getDriver() {
			return driver;
		}
		public void setDriver(Ajaja driver) {
			this.driver = driver;
		}
		
		public Double laskeNopeus(int sylinterienMaara, int sylintereitaRikki, int huippuNopeus){
			Double paluuArvo = 0.0;
			paluuArvo = ((1.0 * (sylinterienMaara - sylintereitaRikki) / (1.0 * sylinterienMaara)) * huippuNopeus);
			return paluuArvo;
		}
	}
	 

