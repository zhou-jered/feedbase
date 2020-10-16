package com.flowersouth.feedbase.idlist.io;

import com.flowersouth.feedbase.idlist.IDList;
import com.flowersouth.feedbase.idlist.IDListIO;
import com.flowersouth.feedbase.idlist.IDListMeta;
import com.flowersouth.feedbase.idlist.IDTrie;

import java.util.Collection;
import java.util.List;

public class IDListFileIO implements IDListIO {

    private static final int TRIE_THRESHOLD = 256;
    private String idListId;

    public IDListFileIO(String idListId) {
        this.idListId = idListId;
    }

    @Override
    public IDTrie readTrie() {

        return null;
    }

    @Override
    public List<String> readRange(long offset, int length) {
        return null;
    }

    @Override
    public IDListMeta readMeta() {
        return null;
    }

    @Override
    public void writeList(IDList list) {

    }

    @Override
    public void appendId(IDList list, String id) {

    }

    @Override
    public void append(String id) {

    }

    @Override
    public void appendAll(Collection<String> id) {

    }

    static class FilenameStrategy {
        public String getRawListFilename(String idListId) {
            return "r_" + idListId + ".l";
        }

        /**
         * including trie info and the meta info file
         *
         * @return
         */
        public String getListInfoFile(String idListId) {
            return "i_" + idListId + ".i";
        }

    }
}
