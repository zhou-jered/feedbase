package com.flowersouth.feedbase.idlist;

import com.google.common.primitives.Longs;

import java.util.Arrays;

public class IDListMeta {
    private static final int SERIES_LEN = 8 * 3;
    private long elementSize;
    private long byteSize;
    private long blockSize;

    public IDListMeta() {
    }

    public IDListMeta(long elementSize, long byteSize, long blockSize) {
        this.elementSize = elementSize;
        this.byteSize = byteSize;
        this.blockSize = blockSize;
    }

    public byte[] serilize() {
        byte[] series = new byte[SERIES_LEN];
        int seriesOffset = 0;
        byte[] buf = Longs.toByteArray(elementSize);
        System.arraycopy(buf, 0, series, seriesOffset, 8);
        seriesOffset += 8;
        buf = Longs.toByteArray(byteSize);
        System.arraycopy(buf, 0, series, seriesOffset, 8);
        seriesOffset += 8;
        buf = Longs.toByteArray(blockSize);
        System.arraycopy(buf, 0, series, seriesOffset, 8);
        return series;
    }

    public void fromSeries(byte[] series) {
        if (series == null || series.length < SERIES_LEN) {
            throw new RuntimeException("Series Data Error, series is null or length less than " + SERIES_LEN
                    + " series: " + series);
        }
        this.elementSize = Longs.fromByteArray(series);
        this.byteSize = Longs.fromByteArray(Arrays.copyOfRange(series, 8, 16));
        this.blockSize = Longs.fromByteArray(Arrays.copyOfRange(series, 16, 24));
    }

    public long getElementSize() {
        return elementSize;
    }

    public long getByteSize() {
        return byteSize;
    }

    public long getBlockSize() {
        return blockSize;
    }
}
