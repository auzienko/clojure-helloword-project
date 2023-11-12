==

By https://www.youtube.com/watch?v=nnFq2nVKxuw

brew install clojure/tools/clojure

https://github.com/seancorfield/clj-new

clojure -X:new :name learnclj/passgen
clojure -T:build ci
java -jar target/net.clojars.learnclj/passgen-0.1.0-SNAPSHOT.jar
clojure -M -m learnclj.passgen

https://github.com/clojure/tools.cli

https://github.com/shyiko/jabba

export JABBA_VERSION=0.11.2
curl -sL https://github.com/shyiko/jabba/raw/master/install.sh | bash && . ~/.jabba/jabba.sh

jabba install graalvm-ce-java11@20.3.0
jabba use graalvm-ce-java11@20.3.0
gu install native-image
native-image -jar target/net.clojars.learnclj/passgen-0.1.0-SNAPSHOT.jar -H:Name=passwordgenerator


==
