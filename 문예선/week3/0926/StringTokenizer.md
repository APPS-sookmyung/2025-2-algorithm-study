## StringTokenizer
### 역할
구분자를 기준으로 문자열 분리

### 사용법
객체 생성 -> 토큰 잔여 여부 확인 -> nextToken으로 다음 토큰을 하나씩 꺼내쓰기

### 생성자
#### StringTokenizer(String str)
공백을 기본 구분자로 사용
#### StringTokenizer(String str, delim)
delim에 지정된 문자열을 구분자로 사용
```java
StringTokenizer st = new StringTokenizer("가나,다/라 마", ",./")
// ,와 .와 / 모두 구분자로 사용
```

### 주요 메서드
boolean hasMoreTokens(): 다음에 꺼낼 토큰 잔여 여부 확인
String nextToken(): 다음 토큰을 문자열로 봔환
int countTokens(): 남아있는 토큰의 개수를 반환