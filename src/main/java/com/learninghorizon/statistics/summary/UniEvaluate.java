package com.learninghorizon.statistics.summary;

import java.util.Collection;

/**
 * UniEvaluate interface's methods takes only single parameter.
 * All of UniEvaluate interface's methods have same return types.
 * */
public interface UniEvaluate {
	
	public abstract double evaluate(final int[] vals);
	
	public abstract double evaluate(final long[] vals);
	
	public abstract double evaluate(final double[] vals);
	
	public abstract double evaluate(final Collection<? extends Number> collection);
}
