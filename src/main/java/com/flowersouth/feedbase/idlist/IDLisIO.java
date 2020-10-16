package com.flowersouth.feedbase.idlist;

import java.util.Collection;
import java.util.List;

public interface IDLisIO {

    //read method
    IDTrie readTrie();

    List<String> readRange(long offset, int length);

    IDListMeta readMeta();


    // write method

    void writeList(IDList list);

    void appendId(IDList list, String id);

    void append(String id);

    void appendAll(Collection<String> id);


}
