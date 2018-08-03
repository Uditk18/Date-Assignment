//Test class for Date class, to pass some inputs and check
public class DateTest {
	public static void main(String[] args) {
		// passing values by constructor
		Date date1 = new Date(7, 8, 2000);
		Date date2 = new Date(12, 10, 1995);

		int arr[] = date1.difference(date2);
		System.out.println("Date1: " + date1);
		System.out.println("Date2: " + date2);
		System.out.println("Difference is " + arr[0] + " days" + arr[1] + " months" + arr[2] + " years");

	}
}