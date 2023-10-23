package baseball.service.handler;

import static baseball.service.Game.NUMBER_OF_DIGITS;

import camp.nextstep.edu.missionutils.Randoms;


public class Computer {


    String getRandomNumber(int start_range, int end_range) {
        StringBuilder number = new StringBuilder();

        while (number.length() < NUMBER_OF_DIGITS) {
            int randomNumber = Randoms.pickNumberInRange(start_range, end_range);
            if (!(number.toString()).contains(String.valueOf(randomNumber))) {
                //randomNumber이 number에 없을 경우 append
                number.append(randomNumber);
            }
        }
        return number.toString();
    }

}