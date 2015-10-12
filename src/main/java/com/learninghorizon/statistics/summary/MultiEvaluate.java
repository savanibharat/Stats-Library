package com.learninghorizon.statistics.summary;

/**
 * MultiEvaluate interface's methods takes more than two parameter.
 * MultiEvaluate interface's methods has same return types.
 * */
public interface MultiEvaluate {
	public abstract double evaluate(final int[] vals, final int beginIndex, final int length);
	public abstract double evaluate(final long[] vals, final int beginIndex, final int length);
	public abstract double evaluate(final double[] vals, final int beginIndex, final int length);
}
