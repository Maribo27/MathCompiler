import org.junit.Before;
import org.junit.Test;

import java.net.URL;
import java.util.Objects;

public class MainTest {
	private ClassLoader classLoader;

	@Before
	public void setUp() {
		classLoader = getClass().getClassLoader();
	}

	@Test
	public void testOne() {
		URL testOneInput = Objects.requireNonNull(classLoader.getResource("prog1.txt"));
		String path = testOneInput.getPath();
		Main.main(new String[]{path});
	}

	@Test
	public void testTwo() {
		URL testOneInput = Objects.requireNonNull(classLoader.getResource("prog2.txt"));
		String path = testOneInput.getPath();
		Main.main(new String[]{path});
	}

	@Test
	public void testThree() {
		URL testOneInput = Objects.requireNonNull(classLoader.getResource("prog3.txt"));
		String path = testOneInput.getPath();
		Main.main(new String[]{path});
	}

	@Test
	public void testFour() {
		URL testOneInput = Objects.requireNonNull(classLoader.getResource("prog4.txt"));
		String path = testOneInput.getPath();
		Main.main(new String[]{path});
	}

	@Test
	public void testFive() {
		URL testOneInput = Objects.requireNonNull(classLoader.getResource("prog5.txt"));
		String path = testOneInput.getPath();
		Main.main(new String[]{path});
	}
}