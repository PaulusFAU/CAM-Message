package net.gcdc.camdenm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface SizeRange {
    int minValue();
    int maxValue();
    boolean hasExtensionMarker() default false;
}
