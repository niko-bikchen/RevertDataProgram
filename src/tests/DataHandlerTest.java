package tests;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.*;

import program.DataHandler;

/**
 * This class tests <b>DataHandler</b> class
 * which is stored in the <b>data_handler</b> jar file
 * 
 * @author Nikolay Bikchentaev
 * @since 30.03.2019
 */

public class DataHandlerTest {

	private final String[] correct_arr = { "Hello World!", "1234@4321", "I like trains!",
			"Dates in the calendar may be closer than they appear", "Albert Einstein", "001100220003", ":):):)" };

	private final String[] test_arr = { "!dlroW olleH", "1234@4321", "!sniart ekil I",
			"raeppa yeht naht resolc eb yam radnelac eht ni setaD", "nietsniE treblA", "300022001100", "):):):" };

	@Test
	public void testTwo() {
		String[] res = new String[2];

		DataHandler.write(test_arr[0]);
		res[0] = DataHandler.read();

		DataHandler.write(test_arr[1]);
		res[1] = DataHandler.read();

		assertArrayEquals(Arrays.copyOfRange(correct_arr, 0, 2), res);
		
		for(String string : res)
			System.out.println(string);
	}

	@Test
	public void testFive() {
		String[] res = new String[5];

		DataHandler.write(test_arr[2]);
		res[0] = DataHandler.read();

		DataHandler.write(test_arr[3]);
		res[1] = DataHandler.read();

		DataHandler.write(test_arr[4]);
		res[2] = DataHandler.read();
		
		DataHandler.write(test_arr[5]);
		res[3] = DataHandler.read();
		
		DataHandler.write(test_arr[6]);
		res[4] = DataHandler.read();
		
		assertArrayEquals(Arrays.copyOfRange(correct_arr, 2, 7), res);
		
		for(String string : res)
			System.out.println(string);
	}

}
