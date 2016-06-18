/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.orz.pascal.tce.tiny.collection.extentions;

import java.util.HashMap;

/**
 * Collection utilities.
 *
 * @author koduki
 */
public class CollectionUtils {

    /**
     * Create Map.
     *
     * @param <K> Key type of this Map
     * @param <V> Value type of this Map
     * @param elements Elements pair of this Map
     * @return Map
     */
    public static <K, V> java.util.Map<K, V> map(Tuple.Tuple2<K, V>... elements) {
        java.util.Map<K, V> map = new HashMap<>(elements.length);
        for (Tuple.Tuple2<K, V> x : elements) {
            map.put(x._1(), x._2());
        }
        return map;
    }

}
