package com.flowersouth.feedbase.idlist;

import java.util.Collection;
import java.util.List;

/**
 * Fast seq read
 * random access
 */
public class IDList {

    private long size;

    public long size() {
        return size;
    }


    public boolean isEmpty() {
        return size > 0;
    }


    public boolean contains(String id) {
        return false;
    }

    public boolean append(byte[] bytes) {
        return false;
    }


    public boolean remove(String id) {
        return false;
    }


    public boolean containsAll(Collection<String> idList) {
        return false;
    }


    public boolean appendAll(Collection<String> idList) {
        return false;
    }


    public boolean removeAll(Collection<String> idList) {
        return false;
    }


    public List<String> get(long fromCursor, int size) {
        return null;
    }

    public List<String> reverseGet(long fromCursor, int size) {
        return null;
    }

    public IDList diff(IDList other) {
        return null;
    }

    public IDList sub(IDList other) {
        return null;
    }

    public IDList merge(IDList other) {
        return null;
    }

}
