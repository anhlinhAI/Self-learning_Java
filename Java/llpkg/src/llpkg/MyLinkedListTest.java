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
public class MyLinkedListTest {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        // test addFirst operation
        list.addFirst(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // print data
        MyIterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();
        // Test search operation
        LL_Element p = list.search(5);
        if (p != null) {
            System.out.println("5 existed");
        } else {
            System.out.println("5 Does not existed");
        }
        // Test add before andadd after operation
        list.addBefore(new LL_Element(55), p);
        list.addAfter(new LL_Element(55), p);
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();
        // Test remove operation
        list.remove(5);
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();
        // Test addLast operation
        list.addLast(11, 12, 13, 14);
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();
        // TEST FOR REMOVE first and las operations
        list.removeFirst();
        list.removeLast();
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();
    }
}
