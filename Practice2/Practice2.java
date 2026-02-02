public class Practice2
{
    public static void main(String[] args)
    {
        Student st = new Student("Nurassyl", 1424);
        System.out.println(st.getName());
        System.out.println(st.getId());
        System.out.println(st.getYear());
        st.incrementYear();
        System.out.println(st.getYear());

        StarTriangle small = new StarTriangle (3);
        System.out.println (small.toString());

        Time t = new Time(23, 5,6);
        System.out.println(t.toUniversal()); // prints "23:05:06"
        System.out.println(t.toStandard()); //prints "11:05:06 PM"
        Time t2 = new Time(4,24,33);
        // t.add(t2);
    }
}