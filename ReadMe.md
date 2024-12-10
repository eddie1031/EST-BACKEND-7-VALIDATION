# Spring Validation

## Validation Annotation 종류
|Annotation| Detail                                               |
|:---|:-----------------------------------------------------|
|@AssertFalse| 값이 거짓인지를 판단합니다.                                      |
|@AssertTrue| 값이 참인지를 판단합니다.                                       |
|@Email| 값이 이메일 형식인지를 판단합니다.                                  |
|@Future| 값이 현재를 시점으로 미래의 날짜 또는 시간인지를 판단합니다.                   |
|@Max(value=)| 값이 value의 값보다 작거나 같은지를 판단합니다.                        |
|@Min(value=)| 값이 value의 값보다 크거나 같은지를 판단합니다.                        |
|@NotBlank| 값이 Null이 아니면서 동시에 하나 이상의 공백이 아닌 문자를 포함하고 있는지를 판단합니다. |
|@NotEmpty| 값이 Null이 아니면서 동시에 비어있지 않은지를 판단합니다.                   |
|@NotNull| 값이 Null이 아닌지를 판단합니다.                                 |
|@Pattern(regexp=)| 값이 `regexp`에 있는 정규표현식에 일치하는지 여부를 판단합니다.              |
|@Size(min=, max=)| 값이 `min`과 `max` 범위에 해당하는지 여부를 판단합니다.                 |=
