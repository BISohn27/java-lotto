package stringCalculator;

public class StringCalculator {
    public boolean isCorrectString(String inputString) {
        return !(inputString == null || "".equals(inputString));
    }

    public int plusCalculate(String[] numbers) {
        int result = 0;
        for (String number : numbers) {
            result += Integer.parseInt(number);
        }
        return result;
    }

    public void checkNegativeNumber(String negativeNumber) {
        if(Integer.parseInt(negativeNumber)<0){
            throw new IllegalArgumentException("0 이상의 수를 입력하세요.");
        }
    }
}
