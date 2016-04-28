/**
 * Test program for CountryComparer
 * @author McKayla
 *
 */
public class CountryComparerTest {

	public static void main(String[] args)
	{
		Measurable[] countries = new Measurable[3];
		countries[0] = new Country("Uruguay", 176220);
		countries[1] = new Country("Thailand", 514000);
		countries[2] = new Country("Belgium", 30510);
		Measurable largestCountry = CountryComparer.maximum(countries);
		System.out.print("Countries are:");
		for (int i = 0; i < countries.length; i++) {
			System.out.print(" " + countries[i].getName());
		}
		System.out.println("\nLargest country by area: " + largestCountry.getName());
	}
}