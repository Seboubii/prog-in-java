package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {

    private Node<E> first;

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;
    }

    /**
     * return true if least elem is empty
     * @return boolean
     */
     public boolean isEmpty(){
        if (first == null){
            return true;
        }
        return false;
     }

    /**
     * add an element to the list at the start
     * @param elem
     */
    public void addFirst(E elem){
        Node<E> newElem = new Node<E>();
        if (isEmpty()) {
             newElem.elem = elem;
             first = newElem;
         }
         else{
             newElem.elem = elem;
             newElem.next = first;
             first.prev = newElem;
             first = newElem;
         }
     }

    /**
     * add an element at the end of the list
     * @param elem
     */
     public void addLast(E elem){
         Node<E> newElem = new Node<E>();
         if (isEmpty()){
            newElem.elem = elem;
            first = newElem;
        }
        else{
            Node<E> temp = first;
            while (temp.next != null){
                temp = temp.next;
            }
            newElem.elem = elem;
            newElem.prev = temp;
            temp.next = newElem;


        }
     }

    /**
     * remove the first element of the list
     * @return E
     */
     public E removeFirst(){
         if (!isEmpty()){
             Node<E> temp = first;
             if (first.next != null) {
                 first = first.next;
                 first.prev = null;
             }
             else {
                 first = null;
             }
             return temp.elem;

         }
         throw new IllegalStateException("no element");
     }

    /**
     * remove the last element of the list
     * @return E
     *
     */
     public E removeLast(){
         if (!isEmpty()){
             Node<E> temp = first;
             while (temp.next != null){
                 temp = temp.next;
             }
             if (temp.prev != null){
                 temp = temp.prev;
                 temp.next = null;
             }
             else {
                 temp = null;
             }
             return temp.elem;
         }
         throw new IllegalStateException("no element");
     }

    /**
     * return the nb of element of the list
     * @return int
     */
    int numOfElems(){
        if(first == null){
            return 0;
        }
        else{
            int count = 1;
            Node<E> temp = first;
            while(temp.next != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    @Override
    public String toString() {
        Node<E> temp = first;
        if (temp!=null) {
            String tostring = "DLinkList{ ";
            while (temp.next != null) {
                tostring += temp.elem + " / ";
                temp = temp.next;
            }
            return tostring + " }";
        }
        throw new IllegalStateException("empty");
    }

    /**
     * return the first element of the list
     * @return E
     */

    public E peek(){
         if (first!=null) {
             return first.elem;
         }
        throw new IllegalStateException("empty");
    }
}
