# 로또

## 진행 방법

* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 기능 요구사항

### STEP1

- [x] 문자열 입력
  - [x] null / blank -> exception
- [x] 문자열 분리 : 숫자/연산 분리
  - [x] 숫자와 연산 사이엔 공백 문자열 : "1 + 2" -> [1,2], ["+"]; "10 + 1" -> [10,1], ["+"]; "10 + 1 + "-> [10,1,0], ["+","+"]
  - [x] 첫 문자가 사칙연산인 경우 : "- 1 + 2" -> [0,1,2], ["-","+"]
  - [x] 숫자 : Integer.parseInt(input) 가 예외를 던지지 않는 경우만 가능;
  - [x] 연산 : ["+","-","/","*"] contains 만 가능
- [x] 계산 기능
    - [x] 덧셈 : 1 + 1 = 2
    - [x] 뺄셈 : 1 - 1 = 0; 1 - 0 = 0;
    - [x] 곱셈 : 1 * 1 = 1; 1 * 0 = 0;
    - [x] 나눗셈 : 1 / 1 = 1; 2 / 1 = 2; 4 / 2 = 2; 
      - [x] 4 / 0 -> ArithmeticException
      - [x] 4 / 3 -> InvalidParameterException