import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.lang3.StringUtils;
import java.util.Arrays;
import java.util.List;

public class Junit4_Tester {



    @Test
    public void testJoin() throws IndexOutOfBoundsException, IllegalArgumentException{
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
     // Test join method with specified start and end indexes
        assertEquals("c-d", StringUtils.join(list, "-", 2, 4));
        // Test join method with end index < start index, expecting empty string
        assertEquals("", StringUtils.join(list, "-", 4, 2));
        // Test join method with single element
        assertEquals("e", StringUtils.join(list, "-", 4, 5));
        // Test join method with entire list
        assertEquals("a-b-c-d-e", StringUtils.join(list, "-", 0, 5));
    }
    @Test
    public void test_LastIndexOf() {
        // Test last index of character in a string
    	// Test case 1: Checking for present char with repeatation
        assertEquals(3, StringUtils.lastIndexOf("abcabc", 'a'));
        // Test case 2: Checking for absent char
        assertEquals(-1, StringUtils.lastIndexOf("abcabc", 'z'));
        // Test case 3: Checking for present char
        assertEquals(5, StringUtils.lastIndexOf("abcabc", 'c'));
        // Test case 4: Checking for present char no repeatation
        assertEquals(0, StringUtils.lastIndexOf("abcbc", 'a', 1));
    }

    @Test
    public void test_leftpad() {
        // Test left padding
    	// Test case 1: adding padding to null object
    	assertEquals(null, StringUtils.leftPad(null, 3, "A"));
    	// Test case 2: adding 3 padding of z to empty string
    	assertEquals("zzz", StringUtils.leftPad("", 3, 'z'));
    	// Test case 3: adding z to -1 index 
    	assertEquals("bat", StringUtils.leftPad("bat", -1, 'z'));
    	// Test case 4: adding z to 5 index 
    	assertEquals("zzbat", StringUtils.leftPad("bat", 5, 'z')); 
    }
    
    @Test
    public void test_repeat() {
        // Test repeating strings
    	// Test case 1: null object
    	assertEquals(null, StringUtils.repeat(null, 2));
    	// Test case 2: repeating from 2nd index
    	assertEquals("abab", StringUtils.repeat("ab", 2));
    	// Test case 3: empty string
    	assertEquals("", StringUtils.repeat("", 2));
    	// Test case 1: empty string with negative index
    	assertEquals("", StringUtils.repeat("a", -2)); 
    }
    
    @Test
    public void test_reverse() {
        // Test string reversal
    	// Test case 1: null object
    	assertEquals(null, StringUtils.reverse(null));
    	// Test case 2: Empty String
    	assertEquals("", StringUtils.reverse(""));
    	// Test case 3: some string
    	assertEquals("tab", StringUtils.reverse("bat")); 
    	// Test case 4: integer string
    	assertEquals("1", StringUtils.reverse("1"));
    }
    
    @Test
    public void test_split() {
        // Test string splitting
    	//Test case 1: dot separator for string containing many dots
    	assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a.b.c...", '.'));

    	// Test case 2: Different separator
    	assertArrayEquals(new String[]{"a", "b", "c"}, StringUtils.split("a,b,c", ','));

    	// Test case 3: Single character string
    	assertArrayEquals(new String[]{"a"}, StringUtils.split("a", '.'));

    	// Test case 4: Empty string with non-empty separator
    	assertArrayEquals(new String[]{}, StringUtils.split("", '.'));
    }
    
    @Test
    public void test_startsWith() {
        // Test string prefix checking
    	// Test case 1: Both parameters are null
    	assertEquals(true, StringUtils.startsWith(null, null));

    	// Test case 2: Prefix is longer than the string
    	assertEquals(false, StringUtils.startsWith("abc", "abcdef"));

    	// Test case 3: Case-sensitive check
    	assertEquals(false, StringUtils.startsWith("abcdef", "ABC"));

    	// Test case 4: Empty string and non-empty prefix
    	assertEquals(false, StringUtils.startsWith("", "abc"));
    }
    
    @Test
    public void test_subString() {
        // Test substring extraction
    	// Test case 1: Normal case
    	assertEquals("cdef", StringUtils.substring("abcdef", 2));

    	// Test case 2: Start index is zero
    	assertEquals("abcdef", StringUtils.substring("abcdef", 0));

    	// Test case 3: Start index is equal to the string length
    	assertEquals("", StringUtils.substring("abcdef", 6));

    	// Test case 4: String is null
    	assertEquals(null, StringUtils.substring(null, 1));
    }
    
    @Test
    public void test_trim() {
        // Test string trimming
    	// Test case 1: String with spaces at both ends
        assertEquals("abc", StringUtils.trim("   abc   "));

        // Test case 2: String with control characters at both ends
        assertEquals("abc", StringUtils.trim("\nabc\t"));

        // Test case 3: Empty string
        assertEquals("", StringUtils.trim("   "));

        // Test case 4: Null string
        assertEquals(null, StringUtils.trim(null));
    }

    @Test
    public void test_UpperCase() {
        // Test string upper casing

    	// Test case 1: Only one upper case
        assertEquals("HELLO", StringUtils.upperCase("Hello"));
        // Test case 2: WHole word  upper case
        assertEquals("WORLD", StringUtils.upperCase("WORLD"));
        // Test case 4: empty String
        assertEquals("", StringUtils.upperCase(""));
     // Test case 4: null object
        assertEquals(null,StringUtils.upperCase(null));
    }
}
