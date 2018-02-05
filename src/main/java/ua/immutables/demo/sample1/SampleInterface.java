package ua.immutables.demo.sample1;

import org.immutables.value.Value;

import java.util.List;
import java.util.Set;

@Value.Immutable
@Value.Style(typeImmutable = "Imm*", get = {"get*", "is*", "on*", "*set"})
public interface SampleInterface {

    String message();

    int multiply();

    List<Integer> nums();

    Set<String> upset();

    String isTruth();

    int onClick();
}
