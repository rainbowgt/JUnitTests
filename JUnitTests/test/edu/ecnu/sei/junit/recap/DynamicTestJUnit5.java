package edu.ecnu.sei.junit.recap;

import java.util.Iterator;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.ThrowingConsumer;

public class DynamicTestJUnit5 {
	
	 @TestFactory
	    Stream<DynamicTest> generateRandomNumberOfTests() {

	        // Generates random positive integers between 0 and 100 until
	        // a number evenly divisible by 5 is encountered.
	        Iterator<Integer> inputGenerator = new Iterator<Integer>() {

	            Random random = new Random();
	            int current;

	            @Override
	            public boolean hasNext() {
	                current = random.nextInt(100);
	                return current % 5 != 0;
	            }

	            @Override
	            public Integer next() {
	                return current;
	            }
	        };

	        // Generates display names like: input:5, input:37, input:85, etc.
	        Function<Integer, String> displayNameGenerator = (input) -> "input:" + input;

	        // Executes tests based on the current input value.
	        ThrowingConsumer<Integer> testExecutor = (input) -> assertTrue(input % 5 != 0);

	        // Returns a stream of dynamic tests.
	        return DynamicTest.stream(inputGenerator, displayNameGenerator, testExecutor);
	    }
}

