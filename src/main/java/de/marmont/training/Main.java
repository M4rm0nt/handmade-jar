package de.marmont.training;

import java.util.Set;
import org.apache.commons.collections4.SetUtils;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello App");
        var s1 = Set.of("A","B","C");
        var s2 = Set.of("A","X","C");
        var diff = SetUtils.difference(s1, s2);
        System.out.println("Difference: " + diff);
    }

}
