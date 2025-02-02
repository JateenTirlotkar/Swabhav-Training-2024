package Builder.model;

public class CarDirector {
	public void buildFord(CarBuilder builder) {
		builder.model("Ford");
		builder.color("Red");
		builder.engine("V8");
		builder.year(2001);
		builder.isAutomatic(true);
		builder.build();	
	}
	
	public void buildBuggati(CarBuilder builder) {
		builder.model("Buggati");
		builder.color("Blue");
		builder.engine("V12");
		builder.year(2005);
		builder.isAutomatic(true);
		builder.build();
	}

}
