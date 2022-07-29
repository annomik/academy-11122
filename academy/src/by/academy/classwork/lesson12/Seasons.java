package by.academy.classwork.lesson12;

public enum Seasons {
	
	WINTER(-5),
	SPRING(+10),
	SUMMER(+21){
		@Override
		void getDescription(){
			System.out.println("Теплое время года");
		}
	}, 
	
	AUTUMN(+5);
	
	int temperature;
	
	Seasons(int temperature) {
		this.temperature = temperature;
	}

	public int getTemperature(Seasons season) {
		return temperature;
	}

	void getDescription(){
		System.out.println("Холодное время года");
	}

	public void findSeason(Seasons season) {
		switch (season) {
		case SUMMER:
			System.out.println("I love SUMMER more!");
			break;
		case  AUTUMN:
			System.out.println("I love AUTUMN!");
			break;
		case WINTER:
			System.out.println("I love WINTER!");
			break;
		case SPRING:
			System.out.println("I love SPRING!");
			break;
		}
		
	}
	//Seasons.findSummer(season);
 }