Docker Example
==============

This example is a basic java webapp deployed to docker using gradle. A mongodb docker is also setup.

PreRequisites
-------------

You need docker remote apiavailable at http://192.168.99.101:2376.
On Windows / Mac, the easiest way to achieve this is with [Docker Toolbox].

Build the Application
---------------------

* Run `Docker Quickstart Terminal`
* In the root of this project run `gradlew clean build`

Run the Application
-------------------

* Run `Docker Quickstart Terminal`
* In the root of this project run `gradlew clean runApp`
* Browse to http://192.168.99.101:8080

[Docker Toolbox]:https://www.docker.com/toolbox

Connect to Mongo
----------------

* Run `mongo 192.168.99.101/27017`