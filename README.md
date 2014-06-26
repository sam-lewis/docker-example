Docker Example
==============

This example is a basic java webapp deployed to docker using gradle. A mongodb docker is also setup.

[Boot2Docker] is used to install docker on non-linux platforms. [docker-java] is used called from gradle to deploy the application

PreRequisites
-------------

You need docker rest services available at http://localhost:2375.
On Windows / Mac, the easiest way to achieve this is with [Boot2Docker].

Setup Boot2Docker
------------------

* Install [Boot2Docker]
* Add the [Boot2Docker] directory to the `PATH` environment variable
* Run `boot2docker download`
* Run `boot2docker init`

Run the Application
-------------------

* Run `boot2docker up --hostip=192.168.59.103`
* In the root of this project run `gradlew clean build`
* Browse to http://192.168.59.103:8080

[Boot2Docker]:https://github.com/boot2docker/boot2docker
[docker-java]:https://github.com/docker-java/docker-java

Connect to Mongo
----------------

* Run `mongo 192.168.59.103/27017`