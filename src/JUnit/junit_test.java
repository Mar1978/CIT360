/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

/**
 *
 * @author mikeg
 */
public class junit_test {
 /*@Test
*/
    public void MultiplyTest() {
		SimpleJunit test = new SimpleJunit();

		int result = test.muliply(12, 18);

		assertEquals(216, result);

	}   

    private void assertEquals(int i, int result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
