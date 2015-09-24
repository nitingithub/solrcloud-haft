/**
 * Copyright 2014-2015 BloomReach, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bloomreach.bstore.highavailability.models;

/**
 * Contains Information About the Solr Core and its corresponding node
 *
 * @author nitin
 * @since 10/24/14.
 */
public class CorePairMetadata {
  private String coreName;
  private String hostName;

  public String getCoreName() {
    return coreName;
  }

  public void setCoreName(String coreName) {
    this.coreName = coreName;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }
}
