package com.shangguigu.netty.protobuf.code1;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

public interface StudentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Student)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Student 类中有 一个属性 名字为 id 类型为int32(protobuf类型) 1表示属性序号，不是值
   * </pre>
   *
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
