# Following the  GOOS book.

# The XMPP server
I found this: https://www.igniterealtime.org/projects/openfire/

## Openfire 4.4.4
Openfire is a real time collaboration (RTC) server licensed under the
Open Source Apache License. It uses the only widely adopted open
protocol for instant messaging, XMPP (also called Jabber). Openfire is
incredibly easy to setup and administer, but offers rock-solid
security and performance.

I have Mac, so I downloaded openfire_4_4_4.dmg.

The dmg archive contains a package installer. Running it installs the
software to /usr/local/openfire.


### Starting openfire
I've tried with the following:
```shell script
cd /usr/local/openfire/bin
./openfire.sh

Error: JAVA_HOME is not defined correctly.
  We cannot execute /System/Library/Frameworks/JavaVM.framework/Home/bin/java
```

So I set JAVA_HOME:

```shell script
export JAVA_HOME=$(/usr/libexec/java_home)
./openfire.sh


$ ./openfire.sh 
2019-11-24 18:47:35,441 main ERROR Unable to create file /usr/local/openfire/logs/debug.log java.io.IOException: Could not create directory /usr/local/openfire/logs

``` 

because of permission problems.

