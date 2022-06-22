package customannotation;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    enum Color{BLUE,RED,GREEN}

    Color fruitColor() default Color.GREEN;
}

//만약 FruitColor 어노테이션의 Color 값을 주지 않으면 default로 GREEN이 사용됩니다.
