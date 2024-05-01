public class Main {
    public static void main(String[] args) {
        Car[] cars = {
            new Car("Toyota", "Camry", "Red", 0, 200),
            new Car("Honda", "Civic", "Blue", 0, 180),
            new Car("Ford", "Mustang", "Yellow", 0, 250)
        };

        RaceTrack track = new RaceTrack(1000); 
        Race race = new Race(cars, track);
        race.startRace();
        if (race.getWinner() != null) {
            System.out.println("Winner: " + race.getWinner().getMake() + " " + race.getWinner().getModel());
        } else {
            System.out.println("No winner declared.");
        }
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

