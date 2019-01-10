package stack;
import java.util.*;
public class Stack {
    static void showPush(Stack st, int a){
        st.push(a);
        System.out.println("Push("+a+")");
        System.out.println("Stack: " + st);
    }

    private void push(int a) {
    }

    static void showPop (Stack st){
        System.out.println("Pop ->");
        Integer a = st.pop();
        System.out.println(a);
        System.out.println("Stack " + st);
    }

    private Integer pop() {
            return null;
    }

    public static void main(String args[]){
        Stack st = new Stack();
        System.out.println("Stack " + st);
        showPush(st,12);
        showPush(st,50);
        showPush(st,66);
        showPop(st);
        showPop(st);
        showPop(st);

        try {
            showPop(st);
        }
        catch (EmptyStackException e){
            System.out.println("EMPTY STACK");
        }
    }
}
