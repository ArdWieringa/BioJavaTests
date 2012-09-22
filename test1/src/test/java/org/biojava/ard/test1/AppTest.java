package org.biojava.ard.test1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test public void reverseComplement() {
    	App theApp = new App();
    	try {
    		theApp.reverseComplement();
    	} catch (Exception e) {
    		Assert.fail("reverseComplement fails with " + e.getMessage());
    	}
    }
}
