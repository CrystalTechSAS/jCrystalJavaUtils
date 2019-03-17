/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.utils;

import java.util.Iterator;

public abstract class IterableTransform<V, K> implements Iterable<K>{
	
	Iterable<V> it;
	public IterableTransform(Iterable<V> it) {
		this.it = it;
	}
	@Override
	public Iterator<K> iterator() {
		return new IteratorTransform(it.iterator());
	}
	public abstract K transform(V v);
	private class IteratorTransform implements Iterator<K>{
		Iterator<V> it;
		public IteratorTransform(Iterator<V> it) {
			this.it = it;
		}
		@Override
		public boolean hasNext() {
			return it.hasNext();
		}
		
		@Override
		public K next() {
			return transform(it.next());
		}
	}
}
