[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.nitinb-v2solutions/ossrh-tutorial/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.nitinb-v2solutions/ossrh-tutorial)

# ossrh-tutorial
Just Trying to publishing to Maven Central with OSSRH
Based on youtube video: https://www.youtube.com/watch?v=bxP9IuJbcDQ
just forked from : https://github.com/nyholmniklas/arithmetic

# install gpg, generate and send gpg keys (https://central.sonatype.org/publish/requirements/gpg/#signing-a-file)
gpg --version
gpg --gen-key
gpg --list-keys
gpg --keyserver keyserver.ubuntu.com --send-keys your_gpg_key
gpg --keyserver keyserver.ubuntu.com --recv-keys your_gpg_key

# maven commands
mvn clean package
mvn clean deploy
mvn versions:set -DnewVersion=1.0.1
#after running above command  commit the code changes in git
mvn clean deploy

#after deploy check the arifact at https://repo.maven.apache.org/maven2/io/github/nitinb-v2solutions/ossrh-tutorial/
