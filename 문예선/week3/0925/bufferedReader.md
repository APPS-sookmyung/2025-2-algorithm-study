### BufferedReader & BufferedWriter

buffer를 이용해 I/O의 효율을 높이는 보조 스트림 클래스
변화: 데이터를 한번에 한글자씩 읽고 씀 -> 버퍼에 일정량의 데이터를 모았다가 한번에 처리

- 스트림: 운영체제가 만드는 데이터와의 가상연결고리

import java.**io**.BufferedReader;

#### BufferedReader

키보드 입력이나 파일 내용 등 문자 입력 스트림에서 텍스트 읽기
줄단위로 읽어옴

- 주요 메서드
  `readLine():` 한 줄 전체를 문자열로 읽어옴, 더 읽을 내용이 없을 시 null 반환 -특징
  보조 스트림임. InputStreamReader와 같은 다른 입력 스트림에 연결해서 사용해야함.
  더 자세한 설명 1. 스트림 연결: System.in → InputStreamReader → BufferedReader
  Like 파이프
  _ System.in: 바이트의 흐름/ 표준 입력 장치와 직접 연결/ 원유 파이프
  _ InputStreamReader: 바이트-> 문자(!=문자열) 즉, 번역가/ 휘발유 정제소 \* BufferedReader: 버퍼 사용/ 저장 탱크 2. BufferedReader가 보조 스트림인 이유
  스스로 소스에 연결할 수 없음. 기반 스트림 = System.in 반면에, 보조 스트림 = 기반 스트림에 추가적 기능 덧씌우는 업그레이드 부품

##### 예시

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStream(System.in));
        //System.in을 InputStreamReader를 통해 문자 스트림으로 변환
        //이를 BufferedReader에 연결

        System.out.print("이름을 입력하세요: ");
        String name = br.readLine();
        br.close(); // 사용이 끝난 스트림은 닫아주기

    }
}
```

#### BufferedWriter

문자 출력 스트림에 텍스트 사용할 때 사용
많은 양의 텍스트를 다룰 때 이점 존재

- 주요 특징
  버퍼링: 출력할 데이터를 버퍼에 모으다가 버퍼가 가득 차는 등의 특정 조건이 되면 한번에 출력
- 주요 메서드
  1. newLine(): 운영체제에 맞는 줄 바꿈 문자(\n, \r\n 등)를 자동으로 추가
  2. flush(): 버퍼에 남아있는 데이터를 강제로 출력
  3. close(): 스트림을 닫기 전에 자동으로 flush()를 호출

```java
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class BufferedWriterExample{
    public static void main(String[]args) throw IOException {
        BufferesWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("출력합니다");
        bw.newLine();
        bw.flush();
        bw.close();

    }
}
```

#### StringBuilder

- 사용 이유
  String 객체는 불변. String 객체를 수정하면 새로운 객체를 생성하는 방식. 하지만 StringBuilder == 가변한 문자열 처리 클래스

  -특징
  내부 버퍼에 문자열을 저장, 기존 버퍼의 크기를 늘려가며 문자열을 수정하거나 추가

  - 주요 메서드
    append(): 문자열의 끝에 새로운 데이터 추가. (다양한 타입 추가 가능)
    insert(): 특정 위치에 데이터 삽입(인덱스를 떠올리자)
    delete(): 특정 범위의 문자열 삭제
    toString(): 최종적으로 완성된 문자열을 String 객체로 변환해 반환

* 이것도 객체 생성 후 메서드 사용하면 됨.
