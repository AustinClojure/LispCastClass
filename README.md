LispCastClass
=============

instructions and support for our LispCast intro to Clojure class.

#Before the class

## Install Java
Clojure runs on the Java Virtual Machine.  You will want to have at a Java 6 or Java 7 JDK available.  If you Java is correctly installed on your machine, `java -version` should show something like this:

```shell
$ java -version
java version "1.7.0_45"
Java(TM) SE Runtime Environment (build 1.7.0_45-b18)
Java HotSpot(TM) 64-Bit Server VM (build 24.45-b08, mixed mode)
```

## Leiningen

[Leiningen](http://leiningen.org/) is the standard Clojure dev tool.  You should [install leiningen](http://leiningen.org/#install).  There is a very tiny issue with the latest leiningen (2.4.3), so we recommend you use the 2.4.2 ([mac/linux](https://raw.githubusercontent.com/technomancy/leiningen/2.4.2/bin/lein) or [windows](https://raw.githubusercontent.com/technomancy/leiningen/2.4.2/bin/lein.bat))
instead of the version on the install page.  

If you have installed Leiningen correctly, you should see output like the following from `lein version`: 

```shell
$ lein version
Leiningen 2.4.2 on Java 1.7.0_45 Java HotSpot(TM) 64-Bit Server VM
```

You should also be able to start a Clojure REPL using `lein repl`:

```shell
$ lein repl
nREPL server started on port 56397 on host 127.0.0.1 - nrepl://127.0.0.1:56397
REPL-y 0.3.1
Clojure 1.6.0
    Docs: (doc function-name-here)
          (find-doc "part-of-name-here")
  Source: (source function-name-here)
 Javadoc: (javadoc java-object-or-class-here)
    Exit: Control+D or (exit) or (quit)
 Results: Stored in vars *1, *2, *3, an exception in *e

user=>
```

Typing `(exit)` will exit the REPL.

## Editor

At the beginning of the class, we will work entirely from the Clojure REPL.  However, later you'll want to have a good editor installed to write code.  You won't need any specific Clojure support, but if your editor has Clojure syntax coloring and paren matching, you'll be doing really well.  The most common environment for Clojure development is Emacs using [CIDER](https://github.com/clojure-emacs/cider) and [paredit](http://www.emacswiki.org/emacs/ParEdit), but setting up a professional dev environment is beyond the scope of the class.  If you want to use a a Clojure-friendly IDE, [Nightcode](https://nightcode.info/), [Lighttable](http://www.lighttable.com/) and [Cursive](https://cursiveclojure.com/) are all great environments.  If you want help setting up one of these environments, send us a note and plan to show up early.

