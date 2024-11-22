# kotlin-racingcar-precourse


## 리팩토링 중점사항


### 1. 요구사항 맞추기

- 함수 10줄 이하
- [x] 이름에 타입을 담지 않기

### 2. 코드리뷰 반영하기

- [x] 람다식 it 생략
- 상수화
- [x] 함수이름을 동사 + 명사
- [x] isBlank()
- [x] 배열 대신 리스트

### 3. 스스로 생각하기에

- 파일 분리
- 단위테스트

---

이전 README.md

```

## 구현할 기능 목록
- [x] 자동차 이름 분류
  - [x] (예외) 5자이상인경우
  - [x] (예외) 아무입력도 안했을 경우
  - [x] (예외) 자동차 이름이 중복인 경우
  - [x] 이름 양옆에 공백이 있을 경우 제거
- [x] 이동할 횟수
  - [x] (예외) 정수가 아닌 경우

- [x] 랜덤 이동값
  - [x] 자동차 개수만큼 이동한 횟수 배열 생성
  - [x] 4이상일 경우 이동
  - [x] 실행 결과 출력

- [x] 최종 우승자
  - [x] 공동 우승자면 함께

- [x] depth 2이하

### 테스트
- [x] 자동차 이름에 아무 입력 안했을 경우
- [x] 자동차 이름이 중복인 경우
- [x] 횟수에 문자를 입력하였을 경우 에러
- [x] 횟수에 소수를 입력하였을 경우 에러
- [x] 공동 우승일 경우

```
