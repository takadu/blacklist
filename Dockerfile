FROM takadu/service-base:latest

MAINTAINER Adi Baron <adi.baron@takadu.com>

ENV SERVICE_VERSION 0.1.11

USER takadu
WORKDIR /home/takadu

RUN wget  https://bintray.com/artifact/download/takadu/maven/takadu/blacklist/${SERVICE_VERSION}/tgzs/blacklist.tgz
RUN tar xzvpf blacklist.tgz 

ENTRYPOINT ./blacklist-${SERVICE_VERSION}/bin/blacklist
