package collection.listAndset.stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack st = new Stack<>();

        st.push("Rajshree");
        st.push("Samastipur");
        st.push(463);
        st.push(92.6);
        System.out.println(st);

        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);

        System.out.println(st.search(463));   /// Returns the index of ele or -1
        System.out.println(st.empty());
    }
}
