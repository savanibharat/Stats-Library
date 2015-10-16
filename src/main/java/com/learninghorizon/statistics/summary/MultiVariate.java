package com.learninghorizon.statistics.summary;

/**
 * MultiVariate in terms of three or more parameters.
 * */
public interface MultiVariate {
	
	public abstract int evaluate(final int[] vals, final int beginIndex, final int length);

	public abstract long evaluate(final long[] vals, final int beginIndex, final int length);

	public abstract double evaluate(final double[] vals, final int beginIndex, final int length);
}
