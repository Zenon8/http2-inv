package ua.immutables.demo.sample1;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(typeImmutable = "Imm*")
public abstract class SampleClass {

    public abstract String text();

    public abstract int move();
}
