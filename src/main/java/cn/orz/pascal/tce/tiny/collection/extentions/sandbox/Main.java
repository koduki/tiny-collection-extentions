/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.orz.pascal.tce.tiny.collection.extentions.sandbox;

import static cn.orz.pascal.tce.tiny.collection.extentions.CollectionUtils.*;
import static cn.orz.pascal.tce.tiny.collection.extentions.Tuple.*;
import java.util.Map;

/**
 *
 * @author koduki
 */
public class Main {


    public static void main(String[] args) {
        Tuple2<String, Integer> x = new Tuple2<>("A", 10);
        Tuple2<Integer, String> y = $(1, "B");
        System.out.println(x);
        Map<Integer, String> xs = map($(1, "A"), $(2, "B"), $(3, "C"));
        System.out.println(xs);
    }
}
