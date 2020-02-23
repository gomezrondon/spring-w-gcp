# Getting Started

### How to run it locally with inmemory DB
cd to spring-w-gcp\guestbook
run
java -jar guestbook-0.0.1-SNAPSHOT.jar


### How to run it connected to gcp cloud sql
cd to spring-w-gcp\terraform
run
terraform applay
After the mysql db is created, you need to create the table
-- gcloud sql connect guestbook (if you dont set any password)
gcloud sql connect guestbook --user=YOUR_USER

-- set db
use messages;

 -- create table
CREATE TABLE guestbook_message (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name CHAR(128) NOT NULL,
  message CHAR(255),
  image_uri CHAR(255),
  PRIMARY KEY (id)
);

-- exit
exit;



then execute the jar
cd to spring-w-gcp\\guestbook
create the jar
gradlew clean bootJar

then run it
java -jar -Dspring.profiles.active=cloud guestbook-0.0.1-SNAPSHOT.jar \
--PORT=8081 \
--PROJECT_ID=XXXX \
--DB_USER=XXXX \
--DB_PASSWORD=XXXX \
--DB_NAME=XXXX \
--INSTANCE_CONNECTION=XXXX \
--CREDENTIALS=file:C:\\XXXX

