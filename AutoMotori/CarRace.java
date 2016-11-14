package AutoMotori;
import AutoMotori.Ajaja.Ajotapa;
public class CarRace {
	
	public static void main(String[] args) {
		
		Mootori engine1 = new Mootori(200,8,0);
		Mootori engine2 = new Mootori(300,8,0);
		Mootori engine3 = new Mootori(500,12,0);
		Car car1 = new Car("BMW","X6",200,engine1,null);
		Car car2 = new Car("Ford","focus",250,engine2,null);
		Car car3 = new Car("Honda","city",280,engine3,null);
		Ajaja driver1 = new Ajaja(car1,"Driver1",Ajotapa.RAUHALLINEN);
		Ajaja driver2 = new Ajaja(car2,"Driver2",Ajotapa.TAVALLINEN);
		Ajaja driver3 = new Ajaja(car3,"Driver3",Ajotapa.AGGRESSIIVINEN);
		car1.driver = driver1;
		car2.driver = driver2;
		car3.driver = driver3;
		System.out.println(car2.engine.getCylinders() + ", " + 
				car2.engine.getBrokenCylinders() + ", " + car2.getTopSpeed());
		System.out.println(car2.laskeNopeus(car2.engine.getCylinders(),
				car2.engine.meneRikki(),car2.getTopSpeed()));
				System.out.println(car2.driver.behavior.getBehavior());
		System.out.println(car2.driver.aja(2));
	}

}