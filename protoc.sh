#!/bin/bash

protoc  --java_out=./src/main/java/ ./src/main/java/addressbook.proto
