/**
 * Class that compares countries and returns the country with the largest
 * area
 * @author McKayla
 *
 */
public class CountryComparer  {
	private static Measurable largest;
	
	/**
	 * Method that compares Measurable objects by area and returns the largest
	 * value
	 * @param countries list of Measurable countries
	 * @return
	 */
	public static Measurable maximum(Measurable[] countries) {
		for (int i = 0; i < countries.length - 1; i++) {
			for (int j = countries.length - 1; j > 0; j--) {
				if (countries[i].getArea() > countries[j].getArea()) {
					largest = countries[i];
				}
				else largest = countries[j];
			}
		}
		return largest;
	}
		 
}
	
