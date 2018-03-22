package cn.tju.scs;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
public class testTriangle {
	public triangle tri;
	@Before
	public void setUp()
	{
		tri=new triangle();
	}
	@Test
	public void test0()
	{
		assertEquals(0,tri.check(-1,3,4));
		assertEquals(0,tri.check(1,4,6));
	}
	@Test
	public void test1()
	{
		assertEquals(1,tri.check(5,5,5));
	}
	@Test
	public void test2()
	{
		assertEquals(2,tri.check(4,3,4));
	}
	@Test
	public void test3()
	{
		assertEquals(3,tri.check(3,4,5));
	}
}
