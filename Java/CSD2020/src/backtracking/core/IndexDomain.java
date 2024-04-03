/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking.core;

/**
 *
 * @author PC
 */
public class IndexDomain<E> {

    RealDomain<E> realDomain;
    private int n; // index: 0..(n-1)
    int curIndex = -1; // current index of current

    public IndexDomain(RealDomain realDomain) {
        this.realDomain=realDomain;
        n= realDomain.size();
    }

    // mechanism for geeting an index in this domain
    public int nextIndex() {
        if (this == null) {
            throw new RuntimeException(" Domain is null!");
        }
        return ++curIndex;
    }

    public boolean hasNext() {
        return curIndex + 1 < n;
    }

    public void reset() {
        curIndex = -1;
    }

    public E getRealValue(int i) {
        if (curIndex == -1) {
            return null;
        }
        return this.realDomain.get(i);
    }
    // getters, setters

    public RealDomain<E> getRealDomain() {
        return realDomain;
    }

    public void setRealDomain(RealDomain<E> realDomain) {
        this.realDomain = realDomain;
    }
}
