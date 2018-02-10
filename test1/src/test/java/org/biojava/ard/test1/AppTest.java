package org.biojava.ard.test1;

import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test public void reverseComplement() {
    	App theApp = new App();
    	try {
    		String sequence = "ACTG";
    		theApp.reverseComplement(sequence, "unitTestReverse.fasta");
    	} catch (Exception e) {
    		Assert.fail("reverseComplement fails with " + e.getMessage());
    	}
    }
}
