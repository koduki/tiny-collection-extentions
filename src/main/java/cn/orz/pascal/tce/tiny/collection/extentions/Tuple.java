/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.orz.pascal.tce.tiny.collection.extentions;

import java.io.Serializable;
import java.util.Objects;

/**
 * Tuple types.
 *
 * @author koduki
 */
public class Tuple {

    /**
     * Create Tuple2.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @return Tuple(_1, _2)
     */
    public static <T1, T2> Tuple2<T1, T2> $(T1 _1, T2 _2) {
        return new Tuple2<>(_1, _2);
    }

    /**
     * A tuple of 2 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     */
    public static class Tuple2<T1, T2> implements Serializable {

        private final T1 _1;
        private final T2 _2;

        /**
         * Create Tuple2.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         */
        public Tuple2(T1 _1, T2 _2) {
            this._1 = _1;
            this._2 = _2;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Tuple2<?, ?> other = (Tuple2<?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "Tuple2{" + "_1=" + _1 + ", _2=" + _2 + '}';
        }
    }

    /**
     * Create Tuple3.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param _1 Element 1 of this Tuple
     * @param _2 Element 2 of this Tuple
     * @param _3 Element 3 of this Tuple
     * @return Tuple(_1, _2, _3)
     */
    public static <T1, T2, T3> Tuple3<T1, T2, T3> $(T1 _1, T2 _2, T3 _3) {
        return new Tuple3<>(_1, _2, _3);
    }

    /**
     * A tuple of 3 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     */
    public static class Tuple3<T1, T2, T3> implements Serializable {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;

        /**
         * Create Tuple3.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         */
        public Tuple3(T1 _1, T2 _2, T3 _3) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 get3() {
            return _3;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 53 * hash + Objects.hashCode(this._1);
            hash = 53 * hash + Objects.hashCode(this._2);
            hash = 53 * hash + Objects.hashCode(this._3);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Tuple3<?, ?, ?> other = (Tuple3<?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "Tuple3{" + "_1=" + _1 + ", _2=" + _2 + ", _3=" + _3 + '}';
        }

    }
}
