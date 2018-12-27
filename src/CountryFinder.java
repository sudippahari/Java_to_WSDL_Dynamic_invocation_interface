
public class CountryFinder {
	public String findCountry(String ip) {
		if (ip.equals("172.217.5.238")) {
			return "USA";
		} else if (ip.equals("151.101.200.81")) {
			return "UK";
		} else {
			return "Invalid ip";
		}

	}

}
