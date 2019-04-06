#!/bin/bash

ssh hadoop105 "/home/gaoxiang/app/zookeeper-3.4.6/bin/zkServer.sh start"
ssh hadoop106 "/home/gaoxiang/app/zookeeper-3.4.6/bin/zkServer.sh start"
ssh hadoop107 "/home/gaoxiang/app/zookeeper-3.4.6/bin/zkServer.sh start"

start-dfs.sh

ssh hadoop103 "/home/gaoxiang/app/hadoop-2.7.2/sbin/start-yarn.sh"
ssh hadoop104 "/home/gaoxiang/app/hadoop-2.7.2/sbin/yarn-daemon.sh start resourcemanager"
