import static org.junit.Assert.*;

import org.junit.Test;

public class testhelloworld 
{
	Main m=new Main();
	@Test
	public void test()
	{
		
		assertEquals("hello",m.say());
	}
	@Test
	public void testreverseWord()
	{
		System.out.println("test case reverse word");
		System.out.println(m.reverseWord("my name is billa"));
		assertEquals("ym eman si allib",m.reverseWord("my name is billa"));
	}
	@Test
	public void test3()
	{
		String s=null;
		assertNull(s);
	}
	@Test
	public void test4()
	{
		String s="hello";
		assertNotNull(s);
	}
	
	@Test
	public void test5()
	{
		
		assertNotEquals(4,4);
	}
	
}
