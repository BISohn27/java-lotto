package lotto.domain.number;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class LottoGenerator {

    private static final List<LottoNumber> LOTTO_NUMBERS = IntStream.rangeClosed(1, 45)
            .mapToObj(LottoNumber::of).collect(Collectors.toList());

    private LottoGenerator() {
    }

    static List<LottoNumber> generate() {
        Collections.shuffle(LOTTO_NUMBERS);

        return LOTTO_NUMBERS.subList(0, 6).stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
