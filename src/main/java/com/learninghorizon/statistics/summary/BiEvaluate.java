package com.learninghorizon.statistics.summary;

/**
 * BiEvaluate interface's methods takes two parameter.
 * BiEvaluate interface's methods has same return types.
 * */
public interface BiEvaluate {
	
	public abstract double evaluate(final int[] vals, final int beginIndex);
	
	public abstract double evaluate(final long[] vals, final int beginIndex);
	
	public abstract double evaluate(final double[] vals, final int beginIndex);
}
