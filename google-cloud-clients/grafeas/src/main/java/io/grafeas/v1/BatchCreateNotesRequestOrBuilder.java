/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/grafeas.proto

package io.grafeas.v1;

public interface BatchCreateNotesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.BatchCreateNotesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the notes are to be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the notes are to be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The notes to create. Max allowed length is 1000.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1.Note&gt; notes = 2;</code>
   */
  int getNotesCount();
  /**
   *
   *
   * <pre>
   * The notes to create. Max allowed length is 1000.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1.Note&gt; notes = 2;</code>
   */
  boolean containsNotes(java.lang.String key);
  /** Use {@link #getNotesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.grafeas.v1.Note> getNotes();
  /**
   *
   *
   * <pre>
   * The notes to create. Max allowed length is 1000.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1.Note&gt; notes = 2;</code>
   */
  java.util.Map<java.lang.String, io.grafeas.v1.Note> getNotesMap();
  /**
   *
   *
   * <pre>
   * The notes to create. Max allowed length is 1000.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1.Note&gt; notes = 2;</code>
   */
  io.grafeas.v1.Note getNotesOrDefault(java.lang.String key, io.grafeas.v1.Note defaultValue);
  /**
   *
   *
   * <pre>
   * The notes to create. Max allowed length is 1000.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1.Note&gt; notes = 2;</code>
   */
  io.grafeas.v1.Note getNotesOrThrow(java.lang.String key);
}
