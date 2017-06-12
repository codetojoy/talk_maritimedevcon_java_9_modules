
[![Build Status](https://travis-ci.org/codetojoy/talk_maritimedevcon_java_9_modules.svg?branch=master)](https://travis-ci.org/codetojoy/talk_maritimedevcon_java_9_modules)

### Important Dates

* from [this post](http://mail.openjdk.java.net/pipermail/jdk9-dev/2017-May/005864.html) by Mark Reinhold and the [JSR 376 page](https://jcp.org/en/jsr/detail?id=376)
    * June 7, 2017: revised spec submitted
    * June 13, 2017: voting period **begins** for second Executive Committee vote on JSR 376
    * June 22, 2017: JDK 9 initial Release Candidate
    * June 26, 2017: voting period **ends** for 2nd EC vote
    * Sept 21, 2017: *assuming 2nd EC vote succeeds, etc.*, JDK 9 General Availability release 

### Java 9 Modules For Busy Developers

* Many thanks to [Maritime DevCon](https://maritimedevcon.ca) organizers, and everyone who attended the talk
* [Slides](https://docs.google.com/presentation/d/1d2qwIx5tg_GWUa2Amz4fiqaHU4DTY22nvsTMVlrz1eY/edit?usp=sharing) 
* Code examples: see `eg_*` in this directory
* Slide-by-slide [Credits & Sources](Slides.md)
* [Basic Resources](Resources.md) for videos, code, etc
* [Exhaustive List of Resources](ExhaustiveResources.md) for videos, code, etc
* [Session description](https://maritimedevcon.ca/session/java-9-modules-busy-developers/)
* Please feel free to contact: codetojoy @t gmail

### Post-Talk Notes

* Note that reflection is allowed in Jigsaw, but it must be explicitly granted ([example here](https://github.com/codetojoy/talk_maritimedevcon_java_9_modules/blob/master/eg_03_2_java_9_open_module/src/com.acme.bids.db/module-info.java)). There wasn't time to cover this aspect, and there was a question about this afterwards. 
* [Here](https://github.com/junit-team/junit5/blob/master/junit-platform-commons/junit-platform-commons.gradle) is an instance of the new `Automatic-Module-Name` field used "in the wild" by the JUnit team. (Recall that this allows the authors to provide a stable name before modularizing the code. i.e. in a _lemonade_ jar before it turns into a _moonshine_ jar)
