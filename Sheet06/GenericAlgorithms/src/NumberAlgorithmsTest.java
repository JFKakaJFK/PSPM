import java.util.ArrayList;
import java.util.Collection;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberAlgorithmsTest {
	@Test(expectedExceptions = {IllegalArgumentException.class})
	public void minEmpty() {
		Collection<Integer> col = new ArrayList<Integer>();
		NumberAlgorithms.min(col);
	}
	@Test(expectedExceptions = {IllegalArgumentException.class})
	public void maxEmpty() {
		Collection<Integer> col = new ArrayList<Integer>();
		NumberAlgorithms.max(col);
	}
	@Test(expectedExceptions = {IllegalArgumentException.class})
	public void sumEmpty() {
		Collection<Integer> col = new ArrayList<Integer>();
		NumberAlgorithms.sum(col);
	}
	@Test(expectedExceptions = {IllegalArgumentException.class})
	public void avgEmpty() {
		Collection<Integer> col = new ArrayList<Integer>();
		NumberAlgorithms.avg(col);
	}
	@Test(expectedExceptions = {IllegalArgumentException.class})
	public void varEmpty() {
		Collection<Integer> col = new ArrayList<Integer>();
		NumberAlgorithms.var(col);
	}
	@Test(expectedExceptions = {IllegalArgumentException.class})
	public void stddevEmpty() {
		Collection<Integer> col = new ArrayList<Integer>();
		NumberAlgorithms.stddev(col);
	}
	
	@Test(expectedExceptions = {IllegalArgumentException.class})
	public void minNull() {
		NumberAlgorithms.min(null);
	}
	@Test(expectedExceptions = {IllegalArgumentException.class})
	public void maxNull() {
		NumberAlgorithms.max(null);
	}
	@Test(expectedExceptions = {IllegalArgumentException.class})
	public void sumNull() {
		NumberAlgorithms.sum(null);
	}
	@Test(expectedExceptions = {IllegalArgumentException.class})
	public void avgNull() {
		NumberAlgorithms.avg(null);
	}
	@Test(expectedExceptions = {IllegalArgumentException.class})
	public void varNull() {
		NumberAlgorithms.var(null);
	}
	@Test(expectedExceptions = {IllegalArgumentException.class})
	public void stddevNull() {
		NumberAlgorithms.stddev(null);
	}
	
	@Test
	public void min() {
		Collection<Integer> col = new ArrayList<Integer>();
		col.add(-5);
		col.add(10);
		col.add(-8);
		col.add(-10);
		col.add(15);
		col.add(90);
		
		double res = NumberAlgorithms.min(col);
		Assert.assertEquals(res, -10.0);
	}
	
	@Test
	public void max() {
		Collection<Double> col = new ArrayList<Double>();
		col.add(-5.0);
		col.add(10.0);
		col.add(-8.0);
		col.add(-10.0);
		col.add(15.0);
		col.add(90.0);
		
		double res = NumberAlgorithms.max(col);
		Assert.assertEquals(res, 90.0);
	}
	
	@Test
	public void sum() {
		Collection<Float> col = new ArrayList<Float>();
		col.add(-5.0f);
		col.add(10.0f);
		col.add(-8.0f);
		col.add(-10.0f);
		col.add(15.0f);
		col.add(90.0f);
		
		double res = NumberAlgorithms.sum(col);
		Assert.assertEquals(res, 92.0);
	}
	
	@Test
	public void avg() {
		Collection<Long> col = new ArrayList<Long>();
		col.add(-5L);
		col.add(10L);
		col.add(-8L);
		col.add(-10L);
		col.add(15L);
		col.add(90L);
		
		double res = NumberAlgorithms.avg(col);
		Assert.assertEquals(res, 92.0 / 6, 0.01);
	}
	
	@Test
	public void var() {
		Collection<Float> col = new ArrayList<Float>();
		col.add(-5.0f);
		col.add(10.0f);
		col.add(-8.0f);
		col.add(-10.0f);
		col.add(15.0f);
		col.add(90.0f);
		
		double res = NumberAlgorithms.var(col);
		Assert.assertEquals(res, 1200.56, 0.01);
	}
	
	@Test
	public void stddev() {
		Collection<Float> col = new ArrayList<Float>();
		col.add(-5.0f);
		col.add(10.0f);
		col.add(-8.0f);
		col.add(-10.0f);
		col.add(15.0f);
		col.add(90.0f);
		
		double res = NumberAlgorithms.stddev(col);
		Assert.assertEquals(res, 34.65, 0.01);
	}
	
	@Test
	public void sumMixed() {
		Collection<Number> col = new ArrayList<Number>();
		col.add(-5.0f);
		col.add(10);
		col.add(-8L);
		col.add(-10.0);
		col.add(15);
		col.add(90.0f);
		
		double res = NumberAlgorithms.sum(col);
		Assert.assertEquals(res, 92.0);
	}
}
