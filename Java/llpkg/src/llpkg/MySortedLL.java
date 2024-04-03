/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llpkg;

/**
 *
 * @author PC
 */
public class MySortedLL {

    LL_Element head;
    LL_Element tail;

    public MySortedLL() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
// Determine the ceiling of x in the list
    // x=7 List: 1 2 3 4 5 8 9 --> return reference of 8 --> O(n/2)

    public LL_Element ceiling(Comparable x) {
        LL_Element t = head;
        while (t != null && t.data.compareTo(x) < 0) // data<x
        {
            t = t.next;
        }
        return t;
    }

    public LL_Element search(Comparable x) {
        LL_Element result = ceiling(x);
        if (result == null) {
            return null;
        }
        return (result.data.compareTo(x) == 0) ? result : null;
    }
    // add dta x to the sorted linked list --> O(n/2)

    public LL_Element add(Comparable x) {
        LL_Element newEle = new LL_Element(x);
        LL_Element after = ceiling(x);
        // case of the list is empty
        if (head == null) {
            head = tail = newEle;
        } //Case of the list is not empty
        else if (after == null) { // There is no ceiling , add x to the end
            newEle.next = null;
            newEle.previous = tail;
            tail.next = newEle;
            tail = newEle;  // update tail
        } else if (after == head) {
            newEle.next = head;
            newEle.previous = null;
            head.previous = newEle;
            head = newEle; //update head
        } else {
            LL_Element before = after.previous;
            newEle.next = after;
            newEle.previous = before;
            after.previous = newEle;
            before.next = newEle;
        }
        return newEle;
    }
    // tool for add some data

    public void add(Comparable... group) {
        for (Comparable data : group) {
            add(data);
        }
    }
    // remove a specific valid reference --> O(1)

    private LL_Element remove(LL_Element remRef) {
        // if the list has only one element and it will be removed
        if (remRef == head && head == tail) {
            head = tail = null;
            return remRef;
        }
        LL_Element before = remRef.previous;
        LL_Element after = remRef.next;
        // the list has more than one element;
        if (remRef == head) { // Remove first element
           after.previous = null;
            head=after;
        } 
        else if (remRef==tail){ //remove last element
            before.next=null;
            tail=before;
        }
        else { // before <-> remRef <-> after
            before.next = after;
            after.previous = before;
        }
        return remRef;
    }
    // remove a specific data --> Search --> O(n/2)

    public LL_Element remove(Comparable x) {
        LL_Element remRef = search(x); //O(n/2)
        if (remRef != null) {
            remove(remRef);  // O(1)
        }
        return remRef;
    }
    // Inner class as a toll for traversing all data in the list

    private class Traverser implements MyIterator<Comparable> {
        // Data structure of Traversor: curRef -> head ->...

        LL_Element curRef;

        public Traverser() {
            curRef = new LL_Element(null);
            curRef.next = head;
        }

        public boolean hasNext() {
            return (curRef.next != null);
        }

        public Comparable next() {
            curRef = curRef.next;
            return curRef.data;
        }
    }
        public MyIterator iterator() {
            if (head == null) {
                return null;
            }
            return new Traverser();
        }
    
}
