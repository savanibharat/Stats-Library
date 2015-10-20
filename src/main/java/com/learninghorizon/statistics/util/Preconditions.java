package com.learninghorizon.statistics.util;

import java.lang.reflect.Array;
import java.util.Collection;

/**
 * TODO
 * Should this class be final?
 * Should this classes method be final?
 * Need to clear above doubts.
 * */
public final class Preconditions {
	
	/**
	 * checks whether int[] has length or not.
	 * @throws NullPointerException if argument is null.
	 * @throws IllegalArgumentException if argument size is 0.
	 * */
	public static boolean hasLength(final int[] vals){
		return hasLengthImpl(vals);
	}
	
	/**
	 * checks whether long[] has length or not.
	 * @throws NullPointerException if argument is null.
	 * @throws IllegalArgumentException if argument size is 0.
	 * */
	public static boolean hasLength(final long[] vals){
		return hasLengthImpl(vals);
	}
	/**
	 * checks whether double[] has length or not.
	 * @throws NullPointerException if argument is null.
	 * @throws IllegalArgumentException if argument size is 0.
	 * */
	
	public static boolean hasLength(final double[] vals){
		return hasLengthImpl(vals);
	}
	
	/**
	 * TODO change api name to lengthChecker
	 * 
	 * @return true 
	 * 			if vals length > 0 
	 * @return false
	 * 			if vals length is 0.
	 * @throws
	 * 			NullPointerException if vals == null
	 * */
	private static boolean hasLengthImpl(final Object vals){
		if (vals == null) {
			throw new NullPointerException(ConditionConstants.INPUT_ARRAY_NULL);
		}
		if (Preconditions.getLength(vals) == 0) {
			throw new IllegalArgumentException(ConditionConstants.INPUT_ARRAY_EMPTY);
		}
		return true;
	}
	
	/**
	 * if ((vals == null) || (vals.length == 0) || (beginIndex >= vals.length)
	 * || (beginIndex + length > vals.length)) { return Optional.absent(); }
	 * 
	 * @throws
	 * 			NullPointerException if vals == null
	 * @throws
	 * 			IllegalArgumentException 
	 * 				if beginIndex < 0
	 * 				if length < 0
	 * 				if beginIndex >= valslength
	 * 				if (beginIndex + length) > valslength
	 * 
	 * */
	public static
	boolean hasLength(final Object vals, final int beginIndex, final int length) {
		
		if (vals == null) {
			throw new NullPointerException(ConditionConstants.INPUT_ARRAY_NULL);
		}
		
		final int valslength = Preconditions.getLength(vals);
		
		if(beginIndex > valslength - 1){
			throw new IllegalArgumentException(ConditionConstants.BEGIN_INDEX_LESS_THAN_LENGTH.concat(""+valslength));
		}
		else if (beginIndex < 0) {
			throw new IllegalArgumentException(ConditionConstants.BEGIN_INDEX_GREATER_THAN_ZERO);
		}
		else if (length < 0) {
			throw new IllegalArgumentException(ConditionConstants.LENGTH_GREATER_THAN_ZERO);
		}
		
		if (beginIndex >= valslength) {
			throw new IllegalArgumentException(ConditionConstants.BEGIN_INDEX_LESS_THAN_ARRAY_LENGTH);
		}
		else if ((beginIndex + length) > valslength) {
			
			String error_msg = String.format("beginIndex(%d) + length(%d) "
					+ "must be less than vals.length(%d)", beginIndex,
					length, valslength);
			
			throw new IllegalArgumentException(error_msg);
			
		}
		if (valslength == 0) {
			return false;
		}
		return true;
	}
	
	/**
	 * used to check whether array is null or empty
	 * also checks whether beginIndex >= 0
	 * */
	public static
	boolean hasLength(final int[] vals, final int beginIndex){
		if (vals == null) {
			throw new NullPointerException(ConditionConstants.INPUT_ARRAY_NULL);
		}
		
		final int valslength = Preconditions.getLength(vals);
		
		if(beginIndex > valslength - 1){
			throw new IllegalArgumentException(ConditionConstants.BEGIN_INDEX_LESS_THAN_LENGTH.concat(""+valslength));
		}
		else if (beginIndex < 0) {
			throw new IllegalArgumentException(ConditionConstants.BEGIN_INDEX_GREATER_THAN_ZERO);
		}
		
		if (valslength == 0) {
			return ConditionConstants.FALSE;
		}
		return ConditionConstants.TRUE;
	}
	
	/**
	 * used to check whether array is not or empty
	 * also checks whether beginIndex >= 0
	 * */
	public static
	boolean hasLength(final long[] vals, final int beginIndex){
		if (vals == null) {
			throw new NullPointerException(ConditionConstants.INPUT_ARRAY_NULL);
		}
		
		final int valslength = Preconditions.getLength(vals);
		
		if(beginIndex > valslength - 1){
			throw new IllegalArgumentException(ConditionConstants.BEGIN_INDEX_LESS_THAN_LENGTH.concat(""+valslength));
		}
		else if (beginIndex < 0) {
			throw new IllegalArgumentException(ConditionConstants.BEGIN_INDEX_GREATER_THAN_ZERO);
		}
		
		if (valslength == 0) {
			return ConditionConstants.FALSE;
		}
		return ConditionConstants.TRUE;
	}
	
	/**
	 * used to check whether array is not or empty
	 * also checks whether beginIndex >= 0
	 * */
	public static
	boolean hasLength(final double[] vals, final int beginIndex){
		if (vals == null) {
			throw new NullPointerException(ConditionConstants.INPUT_ARRAY_NULL);
		}
		
		final int valslength = Preconditions.getLength(vals);
		
		if(beginIndex > valslength - 1){
			throw new IllegalArgumentException(ConditionConstants.BEGIN_INDEX_LESS_THAN_LENGTH.concat(""+valslength));
		}
		else if (beginIndex < 0) {
			throw new IllegalArgumentException(ConditionConstants.BEGIN_INDEX_GREATER_THAN_ZERO);
		}
		
		if (valslength == 0) {
			return ConditionConstants.FALSE;
		}
		return ConditionConstants.TRUE;
	}

	public static
	boolean isEmpty(final int[] vals, final int beginIndex){
		return !hasLength(vals, beginIndex);
	}
	
	public static
	boolean isEmpty(final long[] vals, final int beginIndex){
		return !hasLength(vals, beginIndex);
	}
	
	public static
	boolean isEmpty(final double[] vals, final int beginIndex){
		return !hasLength(vals, beginIndex);
	}
	
	public static
	boolean isEmpty(final int[] vals) {
		final int length = getLength(vals);
		return length == 0;
	}
	
	public static
	boolean isEmpty(final long[] vals) {
		final int length = getLength(vals);
		return length == 0;
	}
	
	public static
	boolean isEmpty(final double[] vals) {
		final int length = getLength(vals);
		return length == 0;
	}
	
	public static boolean hasLength(final Collection<? extends Number> collection) {
		if (collection == null) {
			throw new NullPointerException(ConditionConstants.INPUT_COLLECTION_NULL);
		} else if (collection.size() == 0) {
			throw new IllegalArgumentException(ConditionConstants.INPUT_COLLECTION_EMPTY);
		}
		return ConditionConstants.TRUE;
	}
	
	public static int getLength(final Object array){
		if (array == null) {
			throw new NullPointerException(ConditionConstants.INPUT_ARRAY_NULL);
		}
		return Array.getLength(array);
	}
	
	/**
	 * This method eats up any argument.
	 * */
	public static <T>
	boolean isNotNull(final T argument) {
		if (argument == null) {
			throw new NullPointerException("Argument T is null");
		}
		return ConditionConstants.TRUE;
	}
}