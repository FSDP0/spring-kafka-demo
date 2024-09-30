### Spring Kafka 예시 프로젝트

#### 1. 원천코드 폴더 구조
```bash
spring-kafka-demo
├─ README.md
└─ src
   └─ main
      ├─ java
      │  └─ com
      │     └─ fsdp0
      │        └─ spring_kafka_demo
      │           ├─ config
      │           │  ├─ KafkaConsumerConfig.java        # Kafka Consumer 설정
      │           │  └─ KafkaProducerConfig.java        # Kafka Producer 설정
      │           ├─ controller
      │           │  └─ KafkaController.java            # Kafka REST API 컨트롤러
      │           ├─ service
      │           │  ├─ KafkaConsumerService.java       # Kafka Consumer 서비스 
      │           │  └─ KafkaProducerService.java       # Kafka Producer 서비스
      │           └─ SpringKafkaDemoApplication.java    # Main Class
      └─ resources
         └─ config
            ├─ application-local.yaml                   # Local 환경변수 프로파일
            └─ application.yaml                         # 공통 환경변수 프로파일
```

#### 2. 적용 라이브러리
 * Spring Kafka
 * Spring Web MVC
 * Lombok

### 3. 실행 방법
```
./gradlew bootRun
```