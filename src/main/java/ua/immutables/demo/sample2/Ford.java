package ua.immutables.demo.sample2;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(typeImmutable = "Imm*")
public abstract class Ford implements Car {}
