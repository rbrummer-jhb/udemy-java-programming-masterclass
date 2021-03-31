package com.njrbjava;

public class PaintJob {

    public static int getBucketCount(double width, double height,
                                    double areaPerBucket, int extraBuckets) {
        if (width < 1 || height < 1 || areaPerBucket < 1 || extraBuckets < 1) {
            return -1;
        }

    }
}
