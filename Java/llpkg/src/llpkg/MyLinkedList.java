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
public class MyLinkedList {

    LL_Element head; // reference to the begining of the list
    LL_Element tail;  // reference to the end of the list
    // Default constructor: Intialize any empty list

    public MyLinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public LL_Element addFirst(LL_Element newEle) {
        // Case of the list is empty
        if (head == null) {
            head = tail = newEle;
        } // Case of the list is not empty
        else { // order: newEle <-> head
            newEle.next = head; // newEle will be head
            newEle.previous = null;
            head.previous = newEle; // head is after newEle
            head = newEle; // newEle is headd
        }
        return newEle;
    }

    public LL_Element addLast(LL_Element newEle) {
        // Case of the list is empty
        if (head == null) {
            head = tail = newEle;
        } // Case of the list is not empty
        else { // order : tail <-> newEle
            newEle.next = null; //newEle will be tail
            newEle.previous = tail;
            tail.next = newEle; // tail is in front of newEle
            tail = newEle; // newEle is the tail
        }
        return newEle;
    }

    public LL_Element addBefore(LL_Element newEle, LL_Element p) {
        if (p == null || p == head) {
            return addFirst(newEle);
        }
        LL_Element pBefore = p.previous;
        // order: pBefore <-> newEle <-> p
        newEle.next = p;
        newEle.previous = pBefore;
        pBefore.next = newEle;
        p.previous = newEle;
        return newEle;
    }

    public LL_Element addAfter(LL_Element newEle, LL_Element p) {
        if (p == null || p == tail) {
            return addLast(newEle);
        }
        LL_Element pAfter = p.next;
        newEle.next = pAfter;
        newEle.previous = p;
        pAfter.previous = newEle;
        p.next = newEle;
        return newEle;

    }

    public LL_Element search(Comparable x) {
        LL_Element t;
        for (t = head; t != null; t = t.next) {
            if (t.data.compareTo(x) == 0) {
                return t;
            }
        }
        return null;
    }

    public LL_Element removeFirst() {
        // Case of the list is empty
        if (head == null) {
            return null;
        }
        LL_Element result = head;
        // Case of the list has only one element
        if (head == tail) {
            head = tail = null;
        }
        // Case of the list has mor than one elemtn, update head
        LL_Element newHead = head.next;
        newHead.previous = null;
        head = newHead;
        return result;
    }

    public LL_Element removeLast() {
        // Case of the list is empty
        if (tail == null) {
            return null;
        }
        LL_Element result = tail;
        // Case of the list has only one element
        if (tail == head) {
            head = tail = null;
        }
        // Case of the list has mor than one element, update tail
        LL_Element newTail = tail.previous;
        newTail.next = null;
        tail = newTail;
        return result;
    }

    public LL_Element remove(LL_Element ele) {
        if (ele == null) {
            return null;
        }
        // case ele is head or tail
        if (ele == head) {
            return removeFirst();
        }
        if (ele == tail) {
            return removeLast();
        }
        // Update reference , order: pBefore ele pAfter
        LL_Element pBefore = ele.previous;
        LL_Element pAfter = ele.next;
        pBefore.next = pAfter;
        pAfter.previous = pBefore;
        return ele;
    }

    public LL_Element remove(Comparable x) {
        return remove(search(x)); // ==> O(n)
    }

    // Inner class takes a role as a tool for traversing all data in the list
    private class Traverser implements MyIterator<Comparable> {

        // Data structure of the Traversor : curRef -> head -> ... -> tail
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

    // The Mylinkedlist class
    public MyIterator iterator() {
        if (head == null) {
            return null;
        }
        return new Traverser();
    }

    // Tools for add some data
    public void addFirst(Comparable... group) {
        for (Comparable data : group) {
            addFirst(new LL_Element(data));
        }
    }

    public void addLast(Comparable... group) {
        for (Comparable data : group) {
            addLast(new LL_Element(data));
        }
    }
}
