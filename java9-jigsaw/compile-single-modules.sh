#!/bin/sh
javac -d target \
  --module-source-path src/single-modules \
  $(find src/single-modules/consumeapi -name "*.java")

javac --module-path target -d target/services \
  src/single-modules/services/module-info.java \
  src/single-modules/services/com/training/java/hello/Hello.java

javac --module-path target -d target/servicesimpl \
  src/single-modules/servicesimpl/module-info.java \
  src/single-modules/servicesimpl/com/training/java/serviceimpl/HelloImpl.java
