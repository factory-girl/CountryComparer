/**
 * Class which constructs a country
 * @author McKayla
 *
 */
public class Country implements Measurable {
	
	private String name;
	private int area;
	
	/**
	 * Constructs a country based on name and area.
	 * @param name 
	 * country name
	 * @param area 
	 * country area
	 */
	public Country(String name, int area) {
		this.name = name;
		this.area = area;
	}
	
	public int getArea() {
		return area;
	}
	
	public String getName() {
		return name;
	}

}
