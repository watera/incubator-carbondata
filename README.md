<!--
    Licensed to the Apache Software Foundation (ASF) under one
    or more contributor license agreements.  See the NOTICE file
    distributed with this work for additional information
    regarding copyright ownership.  The ASF licenses this file
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
    with the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied.  See the License for the
    specific language governing permissions and limitations
    under the License.
-->

<img src="/docs/images/CarbonData_logo.png" width="200" height="40">

Apache CarbonData is an indexed columnar data format for fast analytics on big data platform, e.g.Apache Hadoop, Apache Spark, etc.

You can find the latest CarbonData document and learn more at:
[http://carbondata.apache.org](http://carbondata.apache.org/)

[CarbonData cwiki](https://cwiki.apache.org/confluence/display/CARBONDATA/)

## Status
[![Build Status](https://travis-ci.org/apache/incubator-carbondata.svg?branch=master)](https://travis-ci.org/apache/incubator-carbondata)

## Features
CarbonData file format is a columnar store in HDFS, it has many features that a modern columnar format has, such as splittable, compression schema ,complex data type etc, and CarbonData has following unique features:
* Stores data along with index: it can significantly accelerate query performance and reduces the I/O scans and CPU resources, where there are filters in the query.  CarbonData index consists of multiple level of indices, a processing framework can leverage this index to reduce the task it needs to schedule and process, and it can also do skip scan in more finer grain unit (called blocklet) in task side scanning instead of scanning the whole file. 
* Operable encoded data :Through supporting efficient compression and global encoding schemes, can query on compressed/encoded data, the data can be converted just before returning the results to the users, which is "late materialized". 
* Supports for various use cases with one single Data format : like interactive OLAP-style query, Sequential Access (big scan), Random Access (narrow scan). 

## Building CarbonData
CarbonData is built using Apache Maven, to [build CarbonData](https://github.com/apache/incubator-carbondata/blob/master/build)

## Online Documentation
* [Quick Start](https://github.com/apache/incubator-carbondata/blob/master/docs/quick-start-guide.md)
* [CarbonData File Structure](https://github.com/apache/incubator-carbondata/blob/master/docs/file-structure-of-carbondata.md)
* [Data Types](https://github.com/apache/incubator-carbondata/blob/master/docs/supported-data-types-in-carbondata.md)
* [Data Management](https://github.com/apache/incubator-carbondata/blob/master/docs/data-management.md)
* [DDL Operations on CarbonData](https://github.com/apache/incubator-carbondata/blob/master/docs/ddl-operation-on-carbondata.md) 
* [DML Operations on CarbonData](https://github.com/apache/incubator-carbondata/blob/master/docs/dml-operation-on-carbondata.md)  
* [Cluster Installation and Deployment](https://github.com/apache/incubator-carbondata/blob/master/docs/installation-guide.md)
* [Configuring Carbondata](https://github.com/apache/incubator-carbondata/blob/master/docs/configuration-parameters.md)
* [FAQ](https://github.com/apache/incubator-carbondata/blob/master/docs/faq.md)
* [Trouble Shooting](https://github.com/apache/incubator-carbondata/blob/master/docs/troubleshooting.md)
* [Useful Tips](https://github.com/apache/incubator-carbondata/blob/master/docs/useful-tips-on-carbondata.md)

## Other Technical Material
[Apache CarbonData meetup material](https://cwiki.apache.org/confluence/pages/viewpage.action?pageId=66850609)

## Fork and Contribute
This is an active open source project for everyone, and we are always open to people who want to use this system or contribute to it. 
This guide document introduce [how to contribute to CarbonData](https://github.com/apache/incubator-carbondata/blob/master/docs/How-to-contribute-to-Apache-CarbonData.md).

## Contact us
To get involved in CarbonData:

* First join by emailing to [dev-subscribe@carbondata.apache.org](mailto:dev-subscribe@carbondata.apache.org),then you can discuss issues by emailing to [dev@carbondata.incubator.apache.org](mailto:dev@carbondata.incubator.apache.org) or visit http://apache-carbondata-mailing-list-archive.1130556.n5.nabble.com
* Report issues on [Apache Jira](https://issues.apache.org/jira/browse/CARBONDATA).

## About
Apache CarbonData is an open source project of The Apache Software Foundation (ASF).

