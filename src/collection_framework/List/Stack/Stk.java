package collection_framework.List.Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Stk {
    public static void main(String[] args) {
        /*
        *
        * ----------------------------Stack (class) that extends Vector----------------------------
        *
        * 1. It follows the principle of LIFO.
        * 2. As Stack extends Vector that's why it is thread safe and synchronized.
        * 3. stk.push() => To add element in Stack.
        * 4. stk.pop() => To remove last element from Stack.
        * 5. stk.peek() => To see the top element in Stack.
        *
        *
        * */

        Stack<Integer> stk = new Stack<>();
        stk.push(30);
        stk.push(38);
        stk.push(31);

        System.out.println(stk);

//        -------------Important❣️--------------

        System.out.println(stk.get(0));
        System.out.println(stk.search(30));
        System.out.println(stk.search(Integer.valueOf(31)));

        System.out.println(stk.indexOf(31)); // 2
        System.out.println(stk.indexOf(30)); // 0


//      ⭐⭐  We can use LinkedList as Stack also. (Not thread safe)

        LinkedList<Integer> llstk = new LinkedList<>();

        llstk.addLast(20); // push()
        llstk.addLast(30);
        llstk.addLast(40);
        llstk.addLast(60);

        llstk.getLast(); // peek()
        llstk.removeLast(); // pop()


//      ⭐⭐  We can use ArrayList as Stack also. (Not thread safe)

        ArrayList<Integer> arrstk = new ArrayList<>();
        arrstk.add(56); // push();
        arrstk.add(78);
        arrstk.add(67);

        arrstk.get(arrstk.size()-1); // peek();
        arrstk.remove(arrstk.size()-1); // pop();
    }
}
