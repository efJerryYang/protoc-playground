// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: addressbook.proto
// Protobuf Java Version: 4.27.2

package com.example.tutorial.protos;

public interface AddressBookOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tutorial.AddressBook)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tutorial.Person people = 1;</code>
   */
  java.util.List<com.example.tutorial.protos.Person> 
      getPeopleList();
  /**
   * <code>repeated .tutorial.Person people = 1;</code>
   */
  com.example.tutorial.protos.Person getPeople(int index);
  /**
   * <code>repeated .tutorial.Person people = 1;</code>
   */
  int getPeopleCount();
  /**
   * <code>repeated .tutorial.Person people = 1;</code>
   */
  java.util.List<? extends com.example.tutorial.protos.PersonOrBuilder> 
      getPeopleOrBuilderList();
  /**
   * <code>repeated .tutorial.Person people = 1;</code>
   */
  com.example.tutorial.protos.PersonOrBuilder getPeopleOrBuilder(
      int index);
}
