
Install Scala

> gzip -dc scala-2.10.tgz | (cd /Library/opt; tar xvf - )

or

> $brew install scala

Set up your login shell script (BASH ~/.bash_profile) and your PATH environment variable


> export SCALA_HOME=/Library/opt/scala/scala-2.10.2
>
> PATH=${SCALA_HOME}/bin:${PATH}


Install scala intellij plug-in by following the steps

https://www.jetbrains.com/help/idea/2016.1/creating-and-running-your-scala-application.html

Clone the project

git clone git@github.com:rameshuk/scala-hack-night.git

And import as Scala project in intellij