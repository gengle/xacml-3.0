6 lines (11 sloc)  218 Bytes
   
package net.jqwik.docs;

import net.jqwik.api.*;

@Tag("IT")
@Tag("slow")
class SimpleCalculatorIT {

    @Test
    void test_one() { 
        System.out.println("This is the testcase in this class");
        String str1="This is the testcase in this class";

        assertEquals("This is the testcase in this class", str1);
    }
    
}

//@Tag("integration-test")
//class TaggingExamples {

	// @Property
	// @Tag("fast")
	// void aFastProperty() { }

	// @Example
	// @Tag("slow") @Tag("involved")
	// void aSlowTest() { }

// }
