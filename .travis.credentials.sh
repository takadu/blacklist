#!/bin/bash
mkdir ~/.bintray/

FILE=$HOME/.bintray/.credentials

cat <<EOF >$FILE
realm = Bintray API Realm
host = api.bintray.com
user = takadu
password = 4e600fc2274a7c10a5a53c6a22fdf0ad46cd7dbe
EOF
