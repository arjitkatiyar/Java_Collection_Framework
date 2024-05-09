package SetCollection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> st = new HashSet<>();
        st.add("b");
        st.add("c");
        st.add("a");
        st.add("A");

        System.out.println(st);

//        Iterator<String> itr = st.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        Set<String> st1 = new HashSet<>();
        st1.add("e");
        st1.add("a");
        st1.add("s");
        st1.add("q");

//        st1.addAll(st);  // we cannot use addAll and retailAll together.
        System.out.println(st1);

//        st1.retainAll(st);
//        System.out.println(st1);

        st1.removeAll(st);
        System.out.println(st1);
    }
}
