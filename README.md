
Install Scala

> gzip -dc scala-2.10.tgz | (cd /Library/opt; tar xvf - )

or

> $brew install scala

Install java

Check if Java is already installed

> $ java -version

if it not exist, download the OS X version from the Oracle website.

Check if Java is correctly installed by running the java -version command again.

Add SCALA_HOME, JAVA_HOME to your environment variables by adding the line below to (BASH ~/.bash_profile)


> export SCALA_HOME=/Library/opt/scala/scala-2.10.2
>export JAVA_HOME="`/usr/libexec/java_home -v 1.8`"
> PATH=${SCALA_HOME}/${JAVA_HOME}/bin:${PATH}


Install scala intellij plug-in by following the steps

https://www.jetbrains.com/help/idea/2016.1/creating-and-running-your-scala-application.html

Clone the project

git clone git@github.com:rameshuk/scala-hack-night.git

And import as Scala project in intellij