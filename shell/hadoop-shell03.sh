#!/bin/bash
#远程执行的内容在“<< gx” 至“gx ”(gx可以是任意值)之间，在远程机器上的操作就位于其中
#<< gx，ssh后直到遇到gx这样的内容结束
#重定向目的在于不显示远程的输出了
#在结束前，加exit退出远程节点
ssh hadoop105 > /home/gaoxiang/files/my-ssh.log << gx  
/home/gaoxiang/app/zookeeper-3.4.6/bin/zkServer.sh stop
exit
gx
