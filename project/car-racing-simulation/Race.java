
public class Race {
	private Car[] cars;
	private RaceTrack track;
	private Car winner;

	public Race(Car[] cars, RaceTrack track) {
		this.cars=cars;
		this.track=track;
		this.winner=null;
	}

	public void startRace() {
		while(winner==null) {
			for(Car car:cars) {
				car.accelerate(10);
				car.brake(5);
				double newPosition=car.getCurrentSpeed();
				if(newPosition>=track.getLength()){
					winner=car;
					break;
				}
			}
		}
	}

	public Car getWinner() {
		return winner;
	}

}


