package com.flowersouth.feedbase.idlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Fast seq read
 * random access
 */
public class IdList {

    private long size;

    public long size() {
        return size;
    }


    public boolean isEmpty() {
        return size > 0;
    }


    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }




    public <T> T[] toArray(T[] a) {
        return null;
    }


    public boolean add(byte[] bytes) {
        return false;
    }


    public boolean remove(Object o) {
        return false;
    }


    public boolean containsAll(Collection<?> c) {
        return false;
    }


    public boolean addAll(Collection<? extends byte[]> c) {
        return false;
    }


    public boolean addAll(int index, Collection<? extends byte[]> c) {
        return false;
    }


    public boolean removeAll(Collection<?> c) {
        return false;
    }


    public boolean retainAll(Collection<?> c) {
        return false;
    }


    public void clear() {

    }


    public byte[] get(int index) {
        return new byte[0];
    }


    public byte[] set(int index, byte[] element) {
        return new byte[0];
    }


    public void add(int index, byte[] element) {

    }


    public byte[] remove(int index) {
        return new byte[0];
    }


    public int indexOf(Object o) {
        return 0;
    }


    public int lastIndexOf(Object o) {
        return 0;
    }


    public ListIterator<byte[]> listIterator() {
        return null;
    }


    public ListIterator<byte[]> listIterator(int index) {
        return null;
    }


    public List<byte[]> subList(int fromIndex, int toIndex) {
        return null;
    }
}
