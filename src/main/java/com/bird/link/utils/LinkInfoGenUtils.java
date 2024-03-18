package com.bird.link.utils;

import org.apache.commons.lang3.RandomUtils;

/**
 * @author zhangruilong <zhangruilong03@kuaishou.com>
 * Created on 2024-03-18
 */
public class LinkInfoGenUtils {
    private static long insertRandomBitPer5Bits(long val) {
        long result = val;
        long high = val;
        for (int i = 0; i < 10; i++) {
            if (high == 0) {
                break;
            }
            int pos = 5 + 5 * i + i;
            high = result >> pos;
            result = ((high << 1 | RandomUtils.nextInt(0, 2)) << pos)
                    | (result & (-1L >>> (64 - pos)));
        }
        return result;
    }
}
