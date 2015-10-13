package com.learninghorizon.statistics.summary;

/**
 * Bivariate in terms of two parameters.
 * */
public interface Bivariate {
	
	public abstract int evaluate(final int[] vals, final int beginIndex);

	public abstract long evaluate(final long[] vals, final int beginIndex);

	public abstract double evaluate(final double[] vals, final int beginIndex);
}
