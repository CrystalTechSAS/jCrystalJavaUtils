/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.utils;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.function.Function;

public class DefaultTreeMap<K, V> extends TreeMap<K, V>{
	private static final long serialVersionUID = -5333416110389237478L;
	private Function<K, V> defCreator;
	public DefaultTreeMap(Function<K, V> defCreator) {
		this.defCreator = defCreator;
	}
	public DefaultTreeMap(Function<K, V> defCreator, Comparator<K> comparator) {
		super(comparator);
		this.defCreator = defCreator;
	}
	@SuppressWarnings("unchecked")
	@Override
	public V get(Object key) {
		V ret = super.get(key);
		if(ret==null)
			put((K)key, ret = defCreator.apply((K)key));
		return ret;
	}
}
