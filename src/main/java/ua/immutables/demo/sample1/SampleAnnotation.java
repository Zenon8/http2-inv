package ua.immutables.demo.sample1;

import org.immutables.value.Value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Value.Immutable
@Value.Style(typeImmutable = "Imm*")
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface SampleAnnotation {

    String name();

    String type() default "default value type";
}
