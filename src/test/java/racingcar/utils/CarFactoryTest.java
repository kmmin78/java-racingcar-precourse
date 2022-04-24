package racingcar.utils;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;

@DisplayName("CarFactory클래스")
public class CarFactoryTest {

    @Nested
    @DisplayName("makeCars()는")
    class Describe_Make_Cars {

        @Nested
        @DisplayName("makeCars()는")
        class Context_Make_Cars {

            @Nested
            @DisplayName("문자열 \"pobi,crong,honux\"를 받으면")
            class And_Seprated_With_Comma {

                final String input = "pobi,crong,honux";

                @Test
                @DisplayName("각자의 이름을 가진 3개의 자동차를 생성한다.")
                void It_Create_Cars() {

                    final List<Car> cars = CarFactory.makeCars(input);

                    final String[] names = input.split(",");

                    for (int i = 0; i < cars.size(); i++) {
                        final Car car = cars.get(i);
                        assertThat(car.getName()).isEqualTo(names[i]);
                    }

                }

            }

        }

    }

}
