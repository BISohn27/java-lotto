package lotto.domain.sales;

import lotto.constant.ErrorMessage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LottoBillTest {

    @Test
    void 구매금액_입력시_구매수량_담긴_인스턴스_정상_생성() {
        int money = 10000;
        int quantity = 10000 / 1000;

        LottoBill bill = new LottoBill(money);

        assertThat(bill.quantity()).isEqualTo(quantity);
    }

    @Test
    void 로또_판매_금액_0원_입력시_인스턴스_생성_예외발생() {
        assertThatThrownBy(() -> new LottoBill(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.INVALID_LOTTO_PRICE.getMessage());
    }

    @Test
    void 로또_판매_금액_1000원단위_아닌_금액_입력시_인스턴스_생성_예외발생() {
        assertThatThrownBy(() -> new LottoBill(1222))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.INVALID_LOTTO_PRICE.getMessage());
    }
}
