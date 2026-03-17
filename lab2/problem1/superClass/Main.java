package superClass;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Software> set = new HashSet<>();

        UnrealEngine ue1 = new UnrealEngine("5.3", true);
        UnrealEngine ue2 = new UnrealEngine("5.3", true);
        UnrealEngine ue3 = new UnrealEngine("5.2", false);

        set.add(ue1);
        set.add(ue2);
        set.add(ue3);

        System.out.println("Set size: " + set.size());

        for (Software s : set) {
            System.out.println(s);
        }
    }
}