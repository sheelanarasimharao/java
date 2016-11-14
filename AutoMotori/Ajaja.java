package AutoMotori;

public class Ajaja extends Car {
		
		Car car;
		private String name;
		Ajotapa behavior;
		
		public enum Ajotapa {
			AGGRESSIIVINEN(1.0), TAVALLINEN(0.7), RAUHALLINEN(0.4);
			
			
			private final Double behavior;
		private Ajotapa(Double behavior){
				this.behavior = behavior;
			}
			
			public Double getBehavior() {
				return behavior;
			}

		}

		public Ajaja(Car car, String name, Ajotapa behavior) {
			this.car = car;
			this.name = name;
			this.behavior = behavior;
		}
		
		public Car getCar() {
			return car;
		}

		public void setCar(Car car) {
			this.car = car;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public Double aja(double tuntia) {
			Double paluuArvo = 0.0;
			Double ajotapa;
			ajotapa = behavior.getBehavior();
			paluuArvo = laskeNopeus(car.engine.getCylinders(),car.engine.meneRikki(),
					     car.getTopSpeed()) * tuntia * ajotapa;
			return paluuArvo;
		}
		
		
	}

