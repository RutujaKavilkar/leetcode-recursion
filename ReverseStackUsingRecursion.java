import java.util.*;

class Main {

    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        reverse(st);   // just call

        System.out.println(st);  // print after reverse
    }

    public static void reverse(Stack<Integer> st)
    {
        if (st.isEmpty()) return;

        int top = st.pop();

        reverse(st);

        insertAtBottom(st, top);
    }

    public static void insertAtBottom(Stack<Integer> st, int x)
    {
        if (st.isEmpty())
        {
            st.push(x);
            return;
        }

        int top = st.pop();

        insertAtBottom(st, x);

        st.push(top);
    }
}