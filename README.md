# Sprong Kafka Demo
Spring Boot 기반 Apache Kafka 연결 예시 프로젝트입니다.

## 적용 기술
 * Spring Apache Kafka
 * Lombok
 * Spring Web MVC
 * Swagger(OpenAPI)

## 사전 구성사항
 * Docker Engine (Optional)
 * Docker Compose (Optional)
 * Kafka
 * JDK 17

## 실행 방법
```bash
#
$ docker-compose -f docker/kafka-docker-compose.yaml up -d

$ ./gradlew bootRun
```

# 호출 및 테스트 방법
[http://localhost:8080/swagger-ui.html]로 접속하여 OpenAPI 문서 페이지로 이동합니다.

하위의 Endpoint 경로들로 요청합니다.
```bash
# 합산값 호출
$ curl http://localhost:8080/api/v1/sum -d '[0,1,2,3,4]'

# 최솟값 호출
$ curl http://localhost:8080/api/v1/min -d '[0,1,2,3,4]'

# 최댓값 호출
$ curl http://localhost:8080/api/v1/max -d '[0,1,2,3,4]'
```