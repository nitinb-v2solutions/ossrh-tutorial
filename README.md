[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.nitinb-v2solutions/ossrh-tutorial/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.nitinb-v2solutions/ossrh-tutorial)

# ossrh-tutorial
Just Trying to publishing to Maven Central with OSSRH<br/>
Based on youtube video: https://www.youtube.com/watch?v=bxP9IuJbcDQ<br/>
just forked from : https://github.com/nyholmniklas/arithmetic<br/>

# install gpg, generate and send gpg keys (https://central.sonatype.org/publish/requirements/gpg/#signing-a-file)
gpg --version<br/>
gpg --gen-key<br/>
gpg --list-keys<br/>
gpg --keyserver keyserver.ubuntu.com --send-keys your_gpg_key<br/>
gpg --keyserver keyserver.ubuntu.com --recv-keys your_gpg_key<br/>

# maven commands
mvn clean package<br/>
mvn clean deploy<br/>
mvn versions:set -DnewVersion=1.0.1<br/>
#after running above command  commit the code changes in git
mvn clean deploy<br/>

#after deploy check the arifact at https://repo.maven.apache.org/maven2/io/github/nitinb-v2solutions/ossrh-tutorial/
