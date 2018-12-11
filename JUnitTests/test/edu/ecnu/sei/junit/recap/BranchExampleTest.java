package edu.ecnu.sei.junit.recap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BranchExampleTest {

	@Test
	void cover_the_true_value() {
		
		BranchExample be = new BranchExample();
		be.branchCoverageDemo(5);
		
	}

}
