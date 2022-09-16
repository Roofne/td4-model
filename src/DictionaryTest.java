import junit.framework.*;

public class DictionaryTest {
    // Partie Principale
    public static void main(String[] args) {
    
    }   
     
    @Test 
    public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Example"));
    }   
}