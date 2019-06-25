#!/usr/bin/env bash
#mvn archetype:generate -DgroupId=com.zzb.toy -DartifactId=ToySpring -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=com.zzb.toy -DartifactId=ToySpring -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false   -DarchetypeCatalog=internal 
