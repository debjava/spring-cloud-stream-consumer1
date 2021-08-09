zookeeper-server-start.bat ..\..\config\zookeeper.properties

kafka-server-start.bat ..\..\config\server.properties

Create a Topic
kafka-topics.bat --create --topic tutorialspedia --bootstrap-server localhost:9092

Created topic tutorialspedia.

To verify
kafka-topics.bat --list --bootstrap-server localhost:9092

kafka-console-consumer.bat --topic tutorialspedia --bootstrap-server localhost:9092

kafka-console-consumer.bat --topic tutorialspedia --bootstrap-server localhost:9092


kafka-console-producer.bat --topic tutorialspedia --bootstrap-server localhost:9092

Hello from Tutorialspedia

Youtube for Kafka on Windows
https://www.youtube.com/watch?v=-fWznY5nBSg
===========================

kafka-topics.bat --create --topic kafka-spring-producer --bootstrap-server localhost:9092

kafka-topics.bat --create --topic kafka-topic-1 --bootstrap-server localhost:9092

kafka-topics.bat --create --topic kafka-topic-2 --bootstrap-server localhost:9092