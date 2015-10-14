package com.learninghorizon.statistics.summary;

import java.util.Collection;

/**
 * Univariate in terms of one parameter.
 * */
public interface Univariate {

	public abstract int evaluate(final int[] vals);

	public abstract long evaluate(final long[] vals);

	public abstract double evaluate(final double[] vals);

	public abstract double evaluate(final Collection<? extends Number> collection);

}
